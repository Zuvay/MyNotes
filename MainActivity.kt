package com.yavuz.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var numberOneText: TextView
    private lateinit var numberTwoText: TextView
    private lateinit var sonucText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        numberOneText = findViewById<TextView>(R.id.numberOneText)
        numberTwoText = findViewById<TextView>(R.id.numberTwoText)
        sonucText = findViewById<TextView>(R.id.sonucText)
    }
    fun toplama(viev : View){
        var sayiBir = numberOneText.text.toString().toDoubleOrNull()
        var sayiIki = numberTwoText.text.toString().toDoubleOrNull()

        if (sayiBir==null ||sayiIki==null){
            sonucText.text = "Sayı girmelisiniz"
        }else{
            sonucText.text = "Sonuç : ${sayiBir+sayiIki}"
        }
    }

    fun cikarma(viev : View){
        var sayiBir = numberOneText.text.toString().toDoubleOrNull()
        var sayiIki = numberTwoText.text.toString().toDoubleOrNull()

        if (sayiBir==null ||sayiIki==null){
            sonucText.text = "Sayı girmelisiniz"
        }else{
            sonucText.text = "Sonuç : ${sayiBir - sayiIki}"
        }
    }

    fun carpma(viev : View){
        var sayiBir = numberOneText.text.toString().toDoubleOrNull()
        var sayiIki = numberTwoText.text.toString().toDoubleOrNull()

        if (sayiBir==null ||sayiIki==null){
            sonucText.text = "Sayı girmelisiniz"
        }else{
            sonucText.text = "Sonuç : ${sayiBir * sayiIki}"
        }
    }

    fun bolme(viev : View){
        var sayiBir = numberOneText.text.toString().toDoubleOrNull()
        var sayiIki = numberTwoText.text.toString().toDoubleOrNull()

        if (sayiIki == 0.toDouble()){
            sonucText.text = "Sayıyı 0'a bölemezsiniz"
        }else if (sayiBir==null ||sayiIki==null){
            sonucText.text = "Sayı girmelisiniz"
        }else{
            sonucText.text = "Sonuç : ${sayiBir / sayiIki}"
        }
    }
}