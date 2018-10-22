package com.example.mac.movieTest.model

import com.example.mac.movieTest.entitys.MovieSky

import com.example.mac.movieTest.retrofit.SkyServices
import io.reactivex.Observable
import io.reactivex.Observer

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * get the data in sky server
 *
 * @author Caio
 * @since 1
 * @date 18/10/2018
 */
class ModelMovieSky : ModelTestSky() {

    /**
     * get the movies in sky server using Retorfit and Reactx
     *
     * @author Caio
     * @since 1
     * @version 1
     * @date 19/10/2018
     * @return the observable
     */
    fun getMovies(obs: Observer<Array<MovieSky>>) : Observable<Array<MovieSky>> {

        val observable = getObservableMoviesSky()

        observable.subscribeOn( Schedulers.io() )
                .observeOn( AndroidSchedulers.mainThread() )
                .subscribe( obs )

        return observable
    }

    /**
     * create the observable for movie sky
     *
     * @author Caio
     * @since 1
     * @version 1
     * @date 19/10/2018
     *
     * @return the observable
     */
    public fun getObservableMoviesSky(): Observable<Array<MovieSky>> {
        val skyServices = getRetrofit( SkyServices.URL_BASE).create( SkyServices::class.java )
        return skyServices.movies
    }


}