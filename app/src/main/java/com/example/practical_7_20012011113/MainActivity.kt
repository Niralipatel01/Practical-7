package com.example.practical_7_20012011113

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import androidx.core.view.WindowCompat
import com.example.practical_7_20012011113.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreatealarm.setOnClickListener{

            shoTimerDialog()

        }


    }

    private fun shoTimerDialog() {
        val cldr:Calendar= Calendar.getInstance()
        val hour:Int=cldr.get(Calendar.HOUR_OF_DAY)
        val min:Int=cldr.get(Calendar.MINUTE)
        val picker=TimePickerDialog(this,{tp,sHour,sMinute->sendDataToActivity(sHour,sMinute)},hour,min,false)


    }

    private fun sendDataToActivity(sHour: Int, sMinute: Int) {


    }


}