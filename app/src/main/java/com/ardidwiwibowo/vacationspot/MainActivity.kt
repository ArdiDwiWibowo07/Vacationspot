package com.ardidwiwibowo.vacationspot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ardidwiwibowo.vacationspot.adapter.SpotAdapter
import com.ardidwiwibowo.vacationspot.data.Datasource
import com.ardidwiwibowo.vacationspot.data.Datasource1

class MainActivity : AppCompatActivity() {

    lateinit var  recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //memanggil method loadSpot() dari class Datasource -> myDataset
        val myDataset = Datasource().loadSpot()
        //memanggil method loadSpot() dari class Datasource1 -> myDataset1
        val myDataset1 = Datasource1().loadSpot()

        //mecarikan RecyclerView yang ber id horizontalRecyclerView -> recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.horizontalRecyclerView)
        //mecarikan RecyclerView yang ber id gridRecyclerView -> recyclerView1
        val recyclerView1 = findViewById<RecyclerView>(R.id.gridRecyclerView)
        recyclerView.adapter = SpotAdapter(this, myDataset)
        recyclerView1.adapter = SpotAdapter(this, myDataset1)


        // dalam konten tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView1.setHasFixedSize(true)

    }
}