package com.ardidwiwibowo.vacationspot.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.ardidwiwibowo.vacationspot.R
import com.ardidwiwibowo.vacationspot.model.Spot

class SpotAdapter(
    //membuat member
    private val context: Context,
    private val dataset: List<Spot>
) : RecyclerView.Adapter<SpotAdapter.ItemViewHolder>() {

    //menguraikan kumponen yang ada di recyle view
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        //view dengan id spot_name denga tipe TextView ->spotName
        val spotName: TextView = view.findViewById(R.id.spot_name)
        //view dengan id spot_nation denga tipe TextView ->spotNation
        val spotNation : TextView = view.findViewById(R.id.spot_nation)
        //view dengan id spot_image denga com.makeramen.roundedimageview.RoundedImageView ->spotPhoto
        val spotPhoto: com.makeramen.roundedimageview.RoundedImageView = view.findViewById(R.id.spot_image)

    }


    //ketika membuat viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // membuat view baru yaitu layout list_spot -> adapterLayout
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_spot, parent, false)
        //kembalikan nilai dari ItemViewHolder(adapterLayout)
        return ItemViewHolder(adapterLayout)
    }

   //menimpa onBindViewHolder atau mengisikan nilai setiap holder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       //dataset yang berdasarkan position yang disikan
        val item = dataset[position]
       //mengisikan holder spotName text dengan berdasarkan item posisi name
        holder.spotName.text = context.resources.getString(item.name)
       //mengisikan holder spotNation text dengan berdasarkan item posisi nation
        holder.spotNation.text = context.resources.getString(item.nation)
       //mengisikan holder spotPhoto img resource dengan berdasarkan item posisi photo
        holder.spotPhoto.setImageResource(item.photo)
    }


    //tampilkan ukuran data set
    override fun getItemCount() = dataset.size
}