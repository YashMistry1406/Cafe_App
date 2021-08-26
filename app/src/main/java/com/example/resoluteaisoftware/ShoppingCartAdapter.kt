package com.example.resoluteaisoftware

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ShoppingCartAdapter(
    val images:List<Int>
):RecyclerView.Adapter<ShoppingCartAdapter.ShopppingCartViewHolder>() {


     val prices= arrayOf(56.99,25.99,12.99,56.99,25.99,12.99,56.99,25.99,12.99)
     val quantity= arrayOf(1,1,1,1,1,1,1,1,1)
     val product= arrayOf("Bubble Tea","Purple Tea","Green Tea","Bubble Tea","Purple Tea","Green Tea","Bubble Tea","Purple Tea","Green Tea")

    inner class ShopppingCartViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {


        lateinit var  productName:TextView
        lateinit var  productSub:TextView
        lateinit var  productAdd:TextView
        lateinit var  productQuantity:TextView
        lateinit var  productPrice:TextView
        lateinit var  productImage:ImageView
        init {
            productName=itemView.findViewById(R.id.order_name)
            productQuantity=itemView.findViewById(R.id.quantity)
            productPrice=itemView.findViewById(R.id.price)
            productImage=itemView.findViewById(R.id.product_image)




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopppingCartViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.shopping_cart_list,parent,false)
        return ShopppingCartViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShopppingCartViewHolder, position: Int) {
        val curImage=images[position]
        holder.apply {
            productName.text=product[position]
            productQuantity.text= quantity[position].toString()
            productPrice.text= prices[position].toString()
            productImage.setImageResource(curImage)
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }
}