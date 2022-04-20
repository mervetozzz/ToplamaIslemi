package com.tozzz.toplamaislemi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tozzz.toplamaislemi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.btnBir.setOnClickListener { tasarim.sonuc.append("1") }
        tasarim.btnIki.setOnClickListener { tasarim.sonuc.append("2") }
        tasarim.btnUc.setOnClickListener { tasarim.sonuc.append("3") }
        tasarim.btnDort.setOnClickListener { tasarim.sonuc.append("4") }
        tasarim.btnBes.setOnClickListener { tasarim.sonuc.append("5") }
        tasarim.btnAlti.setOnClickListener { tasarim.sonuc.append("6") }
        tasarim.btnYedi.setOnClickListener { tasarim.sonuc.append("7") }
        tasarim.btnSekiz.setOnClickListener { tasarim.sonuc.append("8") }
        tasarim.btnDokuz.setOnClickListener { tasarim.sonuc.append("9") }
        tasarim.btnSifir.setOnClickListener { tasarim.sonuc.append("0") }
        tasarim.btnTopla.setOnClickListener { tasarim.sonuc.append("+") }
        tasarim.btnTemizle.setOnClickListener { tasarim.sonuc.setText("") }


        tasarim.btnSonuc.setOnClickListener {
            val sonuc = tasarim.sonuc.text.toString()
            val bol = sonuc.split("+")
            var toplam = 0
            for(i in 0 until bol.size){
                toplam += bol[i].toInt()
            }
            tasarim.sonuc.text = toplam.toString()

        }
    }
}