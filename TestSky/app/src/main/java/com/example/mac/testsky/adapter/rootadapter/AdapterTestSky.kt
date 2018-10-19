package com.example.mac.testsky.adapter.rootadapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

/**
 * apply the rules for any adapter,
 * in other words, he means what's need
 * to have for it work
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 10/18/2018
 *
 * @param list list of object
 * @param ad   the dependency needed
 */
abstract class AdapterTestSky<T>(protected var list : List<T> ,private val ad : AdapterDependency) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * get size of recycler view
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun getItemCount(): Int {
        return list.size
    }

    /**
     * get layout inflater
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    protected fun getLayoutInflater() : LayoutInflater {
        return ad.getLayoutInflater()
    }

    /**
     * notify the holder that need change the data on layout
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun onBindViewHolder( holder : RecyclerView.ViewHolder, position : Int) {
        (holder as HolderMethods).bindViewHolder( getCurrentObject( position ) as Any )
    }


    /**
     * get the current object based at position
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    protected fun getCurrentObject(position : Int ) : T {
        return list[ position ]
    }
}


/**
 * contains what is need for to work
 * this adapter
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 18/10/2018
 */
interface AdapterDependency {

    /**
     * get the layout inflater
     * object that create the views
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    fun getLayoutInflater() : LayoutInflater
}