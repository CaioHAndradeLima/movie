package com.example.mac.testsky.adapter.mainactivity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.mac.testsky.R
import com.example.mac.testsky.adapter.rootadapter.HolderTestSky
import com.example.mac.testsky.entitys.MovieSky
import com.squareup.picasso.Picasso

class HolderMovie( view : View ) : HolderTestSky( view ) {

    private lateinit var imageView : ImageView
    private lateinit var textView  : TextView

    override fun getReferences() {
        textView  = itemView.findViewById(R.id.textview)
        imageView = itemView.findViewById(R.id.imageview)
    }

    override fun bindViewHolder(obj: Any) {
        val movieSky = obj as MovieSky

        textView.text = movieSky.title

        Picasso.get()
                .load( movieSky.backdropsUrl[0] )
                //.centerCrop()
                .into(imageView)


    }

}
