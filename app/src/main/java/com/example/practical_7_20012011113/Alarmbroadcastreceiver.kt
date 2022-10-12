package com.example.practical_7_20012011113

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Alarmbroadcastreceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val str1= intent.getStringExtra(name:"Service1")
        if(str1 == "Start" || str1 == "Stop"){
            val intentService =Intent(context, AlarmService::class.java)
            intentService.putExtra(name:"Service1")
            if(str1 == "Start")
                context.startService(intentService)
            else if (str1 == "Stop")
                context.stopService(intentService)

        }
    }
}




