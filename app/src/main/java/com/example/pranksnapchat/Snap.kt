package com.example.pranksnapchat

import android.graphics.Color

data class Snap
    (val username: String,
     val time: Int,
     val senderPFPResourceID : Int,
     val opened: Boolean)
    {
        val status: String
        get() =
            if(opened){
                "Received"
            }
            else{
                "New Snap"
            }

        val iconStatusResourceID: Int
        get() =
            if(opened){
                R.drawable.receivedsnapicon
            }
            else{
                R.drawable.newSnapIcon
            }

        val textColorStatus: Int
        get() =
            if(opened){
                Color.GRAY
            }
            else{
                Color.parseColor("#F60047")
            }

    }