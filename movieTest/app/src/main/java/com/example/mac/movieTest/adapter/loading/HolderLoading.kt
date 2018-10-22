package com.example.mac.movieTest.adapter.loading

import android.view.View
import android.widget.ProgressBar
import com.example.mac.movieTest.R
import com.example.mac.movieTest.adapter.rootadapter.HolderTestSky

/**
 * holder loading
 *
 * @author Caio
 * @version 1
 * @since 1
 * @date 18/10/2018
 */
class HolderLoading( view : View ) : HolderTestSky( view ) {
    /**
     * the progress bar view of layout
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    private lateinit var progressBar : ProgressBar

    /**
     * get reference of layout
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun getReferences() {
        progressBar = itemView.findViewById(R.id.progressbar)
    }

    /**
     * put the data in layout when needed
     *
     * @author Caio
     * @version 1
     * @since 1
     * @date 18/10/2018
     */
    override fun bindViewHolder(obj: Any) {
        throw IllegalAccessError("not exists update on this holder")
    }

}
