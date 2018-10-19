package com.example.mac.testsky.adapter.loading

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.mac.testsky.R
import com.example.mac.testsky.adapter.rootadapter.AdapterDependency

/**
 * create the layout loading
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 18/10/2018
 */
class AdapterLoading(private val ad : AdapterDependency) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    /**
     * create the view holder
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun onCreateViewHolder( viewGroup : ViewGroup, position : Int): RecyclerView.ViewHolder {
        return HolderLoading( ad.getLayoutInflater().inflate( R.layout.holder_loading , viewGroup , false ) )
    }

    /**
     * return the size of holders
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     *
     *
     */
    override fun getItemCount(): Int {
        return 1
    }

    /**
     * notify the holder when needed
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     *
     */
    override fun onBindViewHolder( holder : RecyclerView.ViewHolder, position : Int) {}

}
