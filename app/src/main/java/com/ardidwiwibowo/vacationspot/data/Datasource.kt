package com.ardidwiwibowo.vacationspot.data

import com.ardidwiwibowo.vacationspot.R
import com.ardidwiwibowo.vacationspot.model.Spot


class Datasource {

    //membuat fungsi loadSpot yang mana parameter berupa List Spot
    fun loadSpot(): List<Spot> {
        //nilai kembalian adalah list dari spot yang diisikan
        return listOf<Spot>(
            Spot(R.drawable.img1, R.string.spot1, R.string.nation1),
            Spot(R.drawable.img2, R.string.spot2, R.string.nation2),
            Spot(R.drawable.img3, R.string.spot3, R.string.nation3)
        )
    }
}