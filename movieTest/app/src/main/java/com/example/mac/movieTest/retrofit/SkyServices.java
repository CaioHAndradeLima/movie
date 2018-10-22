package com.example.mac.movieTest.retrofit;

import com.example.mac.movieTest.entitys.MovieSky;
import com.example.mac.movieTest.model.ModelMovieSky;

import org.reactivestreams.Subscriber;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.http.GET;

/**
 * contains the functions that can be called
 * by client to Sky Server
 *
 * @author Caio
 * @since 1
 * @date 10/18/2018
 */
public interface SkyServices {

    /**
     * url base sky server
     */
    String URL_BASE = "https://sky-exercise.herokuapp.com/api/";

    /**
     * the method that get the list in sky server
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/18/2018
     * @return the movie sky objects
     */
    @GET("Movies")
    Observable<MovieSky[]> getMovies();

}
