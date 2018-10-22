package com.example.mac.movieTest.adapter.mainactivity

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.mac.movieTest.R
import com.example.mac.movieTest.adapter.rootadapter.AdapterDependency
import com.example.mac.movieTest.adapter.rootadapter.AdapterTestSky
import com.example.mac.movieTest.entitys.MovieSky

/**
 * adapther recycler of Main Activity
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 18/10/2018
 */
class AdapterMainActivity( list : List<MovieSky> , ad : AdapterDependency) : AdapterTestSky<MovieSky>( list , ad ) {

    /**
     * instantiate the view holder
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun onCreateViewHolder( container : ViewGroup, viewType : Int): RecyclerView.ViewHolder {
        return HolderMovie( getLayoutInflater().inflate( R.layout.holder_movie , container , false ) )
    }


}
