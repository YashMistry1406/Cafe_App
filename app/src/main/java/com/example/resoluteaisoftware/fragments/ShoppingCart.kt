package com.example.resoluteaisoftware.fragments

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.resoluteaisoftware.R
import com.example.resoluteaisoftware.R.drawable
import com.example.resoluteaisoftware.ShoppingCartAdapter

class ShoppingCart : Fragment() {

    lateinit var adapter: ShoppingCartAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this

        return inflater.inflate(R.layout.fragment_shopping_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val images= listOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image1,
            R.drawable.image2,R.drawable.image3,R.drawable.image1,R.drawable.image2,R.drawable.image3)
        view.findViewById<RecyclerView>(R.id.shopping_cart_recycler).apply {
            layoutManager=LinearLayoutManager(activity)
            adapter=ShoppingCartAdapter(images)
        }
        val hamburger:ImageView=view.findViewById(R.id.hamburger)
        hamburger.setOnClickListener {
            Toast.makeText(activity,"Menu clicked",Toast.LENGTH_SHORT).show()

        }

    }


}