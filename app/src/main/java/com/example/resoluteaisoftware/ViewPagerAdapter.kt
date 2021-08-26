package com.example.resoluteaisoftware

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(

    val images:List<Int>
):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        lateinit var displayImageView: ImageView
        init {
            displayImageView=itemView.findViewById(R.id.viewpagerimage)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.home_view_pager,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
         val curImage=images[position]
        holder.itemView.findViewById<ImageView>(R.id.viewpagerimage).setImageResource(curImage)

    }

    override fun getItemCount(): Int {
        return images.size
    }
}