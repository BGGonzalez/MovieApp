package com.example.mymoviesapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymoviesapp.R
import com.example.mymoviesapp.models.Movie

class MovieListAdapter(private val movies: List<Movie>, private val context: Context)
    : RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.movie_celds, viewGroup, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var itemImage: ImageView
        private var itemTitle: TextView
        private var itemYear: TextView
        private var itemDirector: TextView
        private var itemGenre: TextView

        init {
            itemImage = itemView.findViewById(R.id.imageView_image)
            itemTitle = itemView.findViewById(R.id.textView_title)
            itemYear = itemView.findViewById(R.id.textView_year)
            itemDirector = itemView.findViewById(R.id.textView_director)
            itemGenre = itemView.findViewById(R.id.textView_genre)
        }
        fun bind(item: Movie){
            Glide.with(context).load(item.image).into(itemImage)
            itemTitle.text = item.title
            itemYear.text = item.year
            itemDirector.text = item.director
            itemGenre.text = item.genre
        }
    }

}