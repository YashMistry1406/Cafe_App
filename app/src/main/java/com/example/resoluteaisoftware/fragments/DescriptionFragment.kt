package com.example.resoluteaisoftware.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resoluteaisoftware.DescriptionAdapter
import com.example.resoluteaisoftware.MainActivity
import com.example.resoluteaisoftware.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class DescriptionFragment : Fragment() {
    lateinit var adapter: DescriptionAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_description ,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val images= listOf(R.drawable.image_big)
        view.findViewById<RecyclerView>(R.id.description_recycler).apply {
            layoutManager=LinearLayoutManager(activity)
            adapter=DescriptionAdapter(images)
        }
    }
}