package com.example.mac.testsky.view

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.mac.testsky.R
import com.example.mac.testsky.adapter.loading.AdapterLoading
import com.example.mac.testsky.adapter.mainactivity.AdapterMainActivity
import com.example.mac.testsky.entitys.MovieSky
import com.example.mac.testsky.presenter.PMAMethods
import com.example.mac.testsky.presenter.PresenterAny
import com.example.mac.testsky.presenter.PresenterMainActivity

/**
 * the class complete to layout
 *
 * this class contains functions to change layout
 *
 * adding the interface functions
 *
 * @author Caio
 * @date 11/19/2018
 *
 */
class MainActivity : MainActivitySampleSettings() , PMAMethods {

    /**
     * when list arrive of server
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 11/19/2018
     */
    override fun whenListArrive( array : Array<MovieSky>) {
        changeAdapter( array )
    }

    /**
     * when to happen some error about get the data
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 11/19/2018
     */
    override fun whenListFail() {
        openSnackBar("Verifique sua conectividade e tente novamente")
    }

    /**
     * get the instance presenter
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    override fun getInstancePresenter(): PresenterAny {
        return PresenterMainActivity( this )
    }
}


/**
 * the first class view of this App
 * show the same movies
 *
 * contains
 *
 * @author Caio
 * @since 1
 *
 */
abstract class MainActivitySampleSettings : ActivityTestSky() {
    /**
     * the recycler view, view on layout
     */
    protected lateinit var recyclerView : RecyclerView

    /**
     * the
     */
    protected lateinit var adapter : AdapterMainActivity

    /**
     * return the layout id
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/18/2018
     */
    override fun getLayoutResActivity(): Int {
        return R.layout.activity_main
    }

    /**
     * get the views references on layout
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun getReferences() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = AdapterLoading(this)
        recyclerView.layoutManager = LinearLayoutManager( this )
    }

    /**
     * change the adapter when list arrived of server
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    protected fun changeAdapter( array : Array<MovieSky> ) {
        adapter = AdapterMainActivity( array.toMutableList() , this )
        recyclerView.layoutManager = GridLayoutManager( this , 2 )
        recyclerView.adapter = adapter

    }

}