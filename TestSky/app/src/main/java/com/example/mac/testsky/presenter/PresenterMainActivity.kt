package com.example.mac.testsky.presenter

import com.example.mac.testsky.entitys.MovieSky
import com.example.mac.testsky.model.ModelMovieSky
import com.example.mac.testsky.view.ActivityMethods
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * the interface required by presenter main activity
 *
 * it don't need extends activity methods
 * but just the main activity use this interface
 * and this way not problems do that
 *
 * @author Caio
 * @version 1
 * @since 1
 * @data 10/19/2018
 */
interface PMAMethods : ActivityMethods {

    /**
     * when list arrive of server
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    fun whenListArrive( list : Array<MovieSky> )

    /**
     * called when the act get the list was fail
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    fun whenListFail()
}


/**
 * the presenter of main activity
 *
 * @author Caio
 * @date 10/19/2018
 */
class PresenterMainActivity( am : PMAMethods ) : PresenterTestSky( am ) {

    /**
     * the observable
     */
    private lateinit var observable : Observable<Array<MovieSky>>

    /**
     *
     * called when activity is creating
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    override fun onCreate() {
        searchMovies()
    }

    /**
     * search movies in sky server and notify view
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/19/2018
     */
    private fun searchMovies() {

        val obs = object: Observer<Array<MovieSky>> {

            override fun onSubscribe(d: Disposable) {
            }

            override fun onNext(movieSkies: Array<MovieSky>) {
                (activityMethods as PMAMethods).whenListArrive( movieSkies )
            }

            override fun onError(e: Throwable) {
                (activityMethods as PMAMethods).whenListFail()

            }

            override fun onComplete() {

            }

        }

        observable = ModelMovieSky().getMovies( obs )
    }

}
