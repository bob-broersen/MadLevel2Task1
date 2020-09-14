package com.broersen.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.broersen.madlevel2task1.databinding.ItemPlaceBinding


class PlaceAdapter(private val places: List<Place>) : RecyclerView.Adapter<PlaceAdapter.Viewholder>() {
    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place){
            binding.tvPlaceName.text = place.name
            binding.ivPlaceImage.setImageResource(place.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.databind(places[position])
    }

    override fun getItemCount(): Int {
        return places.size
    }
}