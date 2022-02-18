package com.example.pranksnapchat

import android.graphics.Color

data class Snap
    (val username: String,
     val time: Int,
     val senderPFPResourceID : String,
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

        val iconStatusResourceID: String
        get() =
            if(opened){
                "@drawable/receivedSnapIcon.png"
            }
            else{
                "@drawable/newSnapIcon.png"
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