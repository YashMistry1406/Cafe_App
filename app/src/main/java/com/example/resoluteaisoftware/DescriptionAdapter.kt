package com.example.resoluteaisoftware

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.processNextEventInCurrentThread

class DescriptionAdapter(
    val images:List<Int>)
    : RecyclerView.Adapter<DescriptionAdapter.DescriptionViewHolder>()  {

    inner class DescriptionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        lateinit var productImageView: ImageView
        init {
            productImageView=itemView.findViewById(R.id.image_des)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DescriptionViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.description_fragment_recycler,parent,false)
        return DescriptionViewHolder(view)
    }

    override fun onBindViewHolder(holder: DescriptionViewHolder, position: Int) {

        val curImage=images[position]
        holder.apply{
            productImageView.setImageResource(curImage)

        }
    }

    override fun getItemCount(): Int {
        return images.size
    }
}