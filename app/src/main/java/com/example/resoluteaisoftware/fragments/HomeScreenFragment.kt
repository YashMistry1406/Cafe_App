package com.example.resoluteaisoftware.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.viewpager.widget.ViewPager
import com.example.resoluteaisoftware.R
import com.example.resoluteaisoftware.ShoppingCartAdapter
import com.example.resoluteaisoftware.ViewPagerAdapter

class HomeScreenFragment : Fragment() {

    lateinit var  adapter: ViewPagerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val images= listOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image_01,R.drawable.image_02,R.drawable.image_01)
        view.findViewById<RecyclerView>(R.id.home_view_page).apply {
            layoutManager=LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)

            adapter=ViewPagerAdapter(images)

        }
        val images1= listOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image1,
            R.drawable.image2,R.drawable.image3,R.drawable.image1,R.drawable.image2,R.drawable.image3)
        view.findViewById<RecyclerView>(R.id.shopping_cart_recycler).apply {
            layoutManager=LinearLayoutManager(activity)
            adapter=ShoppingCartAdapter(images1)
        }



    }


}