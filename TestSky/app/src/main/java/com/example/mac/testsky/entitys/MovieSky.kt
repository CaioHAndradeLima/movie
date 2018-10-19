package com.example.mac.testsky.entitys

import com.google.gson.annotations.SerializedName

/**
 * the entity for download movies at server
 *
 * @author Caio
 * @date 10/18/2018
 */
class MovieSky {

    /**
     * id of movie
     */
    var id = ""

    /**
     * title movie
     */
    var title = ""

    /**
     * description movie
     */
    var overview = ""

    /**
     * duration movie
     */
    var duration = ""

    /**
     * year release movie
     */
    @SerializedName("release_year")
    var releaseYear = ""

    /**
     * url cover photos
     */
    var cover_url = ""

    /**
     * url others photos
     */
    @SerializedName("backdrops_url")
    var backdropsUrl : Array<String> = arrayOf()


}
