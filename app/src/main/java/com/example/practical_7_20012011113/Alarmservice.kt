package com.example.practical_7_20012011113

import android.app.Service
import android.app.Service.START_STICKY
import android.bluetooth.BluetoothClass
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import java.security.Provider

class Alarmservice: Service() {
    var mp: MediaPlayer? =null
    override fun onStartCommand(intent: Intent?,flags:Int ,startId: Int): Int{
        if(intent !=null){
            mp = MediaPlayer.create(this,R.raw.alarm);
            mp?.start()
        }
        return START_STICKY
    }
    override  fun  onDestroy(){
        mp?.stop()
        super.onDestroy()
    }
    override fun onBind(intent: Intent?):IBinder?{
        TODO("Not yet implemented")

    }
}