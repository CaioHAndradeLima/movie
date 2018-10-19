package com.example.mac.testsky.adapter.rootadapter

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * here define life cycle holder functions
 *
 * @author Caio
 * @since 1
 * @date 10/18/2018
 */
abstract class HolderTestSky( view : View) : RecyclerView.ViewHolder( view ) , HolderMethods {

    init {
        getReferences()
    }

}


interface HolderMethods {
    /**
     * get the references of view
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/18/2018
     */
    fun getReferences()

    /**
     * notify when need change the data in layout
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 10/18/2018
     * @param obj - the object that will update the layout
     *
     */
    fun bindViewHolder( obj : Any )

}