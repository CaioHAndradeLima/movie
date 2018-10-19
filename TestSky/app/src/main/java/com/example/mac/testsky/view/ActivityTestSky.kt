package com.example.mac.testsky.view

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.mac.testsky.R
import com.example.mac.testsky.adapter.rootadapter.AdapterDependency
import com.example.mac.testsky.presenter.PresenterAny

/**
 * any activity created on this App need extends this activity
 *
 * here can do any setting needed or apply rules for all activity
 *
 */
abstract class ActivityTestSky : AppCompatActivity() , AdapterDependency , ActivityMethods {

    /**
     * the presenter that management view
     */
    lateinit var presenter : PresenterAny

    /**
     * here decides what the actions needed be called in every activity
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView( getLayoutResActivity() )

        getReferences()

        presenter = getInstancePresenter()

        presenter.onCreate()
    }


    /**
     * when destroy the activity
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    /**
     * open the snack bar with a message
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    protected fun openSnackBar( text : String ) {
        Snackbar.make( findViewById(R.id.container) , text , Snackbar.LENGTH_LONG )
    }


}

/**
 * methods of every activity
 *
 * @author Caio
 * @date 10/19/2018
 */
interface ActivityMethods {

    /**
     * get the layout that will to inflate
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    @LayoutRes
    fun getLayoutResActivity() : Int


    /**
     * get the views references on layout
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    fun getReferences()

    /**
     * get the instance presenter
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    fun getInstancePresenter() : PresenterAny

}
