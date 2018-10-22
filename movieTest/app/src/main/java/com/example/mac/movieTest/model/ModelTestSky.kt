package com.example.mac.movieTest.model


import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * any model created on this App need extends this model
 *
 * here can do any setting needed or apply rules for all activity
 *
 * and put util functions
 *
 * @author Caio
 * @since 1
 * @date 18/10/2018
 */
open class ModelTestSky {


    /**
     * create new instance and return the object retrofit
     *
     * @author Caio
     * @version 1
     * @since 1
     *
     * @date 18/10/2018
     */
    internal fun getRetrofit(url: String): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(url)
                .build()
    }


}
