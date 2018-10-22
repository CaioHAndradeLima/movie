package com.example.mac.movieTest;

import com.example.mac.movieTest.entitys.MovieSky;
import com.example.mac.movieTest.model.ModelMovieSky;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * tests about movie sky
 *
 * @author Caio
 * @date 10/19/2018
 */
public class TestMovieSkyConsistency {

    /**
     * test consistency between server and client
     * if json is correct and if receive all data
     *
     * @author Caio
     * @since 1
     * @version 1
     * @date 10/19/2018
     */
    @Test
    public void testConsistencyServerClient() {
        new ModelMovieSky().getObservableMoviesSky().subscribe( new Observer<MovieSky[]>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(MovieSky[] movieSkies) {
                List<MovieSky> list =  Arrays.asList( movieSkies );

                for ( MovieSky movie : list ) {
                    testString(movie.getCover_url() );
                    testString(movie.getDuration() );
                    testString(movie.getId() );
                    testString(movie.getOverview() );
                    testString(movie.getReleaseYear() );
                    testString(movie.getTitle() );
                    testString(movie.getBackdropsUrl()[0] );
                    testString(movie.getBackdropsUrl()[1] );
                }

            }

            @Override
            public void onError(Throwable e) {
                throw new IllegalStateException("can't tested");
            }

            @Override
            public void onComplete() {

            }
        });
    }


    /**
     * test string of object movie Sky
     *
     * @author Caio
     * @since 1
     * @version 1
     * @date 10/19/2018
     */
    public void testString(String property) {
        Assert.assertNotEquals( property , "" );
    }
}
