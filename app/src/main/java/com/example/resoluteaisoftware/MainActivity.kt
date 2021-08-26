package com.example.resoluteaisoftware

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.resoluteaisoftware.fragments.HomeScreenFragment
import com.example.resoluteaisoftware.fragments.ShoppingCart
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    lateinit var toggle:ActionBarDrawerToggle
    lateinit var adapter:ShoppingCartAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Getting the layouts
        val dl: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.drawer_navigation)
        val header = layoutInflater.inflate(R.layout.headerlayout, RelativeLayout(this))
//        val shopfragment:FrameLayout=findViewById(R.id.shopping_cart_fragment)



        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navController=findNavController(R.id.main_screen)
        bottomNavigationView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when(destination.id){
                R.id.descriptionFragment->navView?.visibility=View.GONE
                else->navView?.visibility=View.VISIBLE
            }

        }


        //Setting up the drawer view
        toggle = ActionBarDrawerToggle(this, dl, R.string.open, R.string.close)
        dl.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //for menu item click's
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.categories -> Toast.makeText(
                    applicationContext,
                    "Clicked categories",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.orders -> Toast.makeText(
                    applicationContext,
                    "Clicked order",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.wishlist -> Toast.makeText(
                    applicationContext,
                    "Clicked wishlist",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.faq -> Toast.makeText(applicationContext, "Clicked faq", Toast.LENGTH_SHORT)
                    .show()
                R.id.log_out -> Toast.makeText(applicationContext, "log out", Toast.LENGTH_SHORT)
                    .show()

            }
            true

        }


    }
/*        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flfragment,shoppingCart).commit()
//
        }*/




    private fun setFragmentView(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, fragment)
            //Will return to previous page when tap "Back Button" on the phone

            commit()
        }
    }

    private fun setBottomNavigationVisibilty(visibility: Int)
    {
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.visibility=View.GONE

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
        {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
//https://developer.android.com/guide/navigation/navigation-navigate