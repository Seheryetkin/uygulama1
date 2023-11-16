package com.example.odev1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Switch
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.odev1.MainActivity3
import com.example.odev1.R

val dosyayolu = "com.example.sharedpreferences"
var anahtarisim = "isim"
var anahtarsifre = "sifre"
var anahtarswitch = "switch"

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var isim = findViewById<EditText>(R.id.isim)
        var sifre = findViewById<EditText>(R.id.sifre)
        var benihatirla = findViewById<Switch>(R.id.benihatirla)
        var progress = findViewById<ProgressBar>(R.id.progress)
        var preferences = getSharedPreferences(dosyayolu, Context.MODE_PRIVATE)
        var editor = preferences.edit()
        var swdurum = benihatirla.isChecked



        Toast.makeText(
            applicationContext,
            "Kaydedilmiş \n" +
                    "İsim : ${preferences.getString(anahtarisim, "Değer Yok")} \n" +
                    "Şifre : ${preferences.getString(anahtarsifre, "Değer Yok")}\n" +
                    "Unutma : ${swdurum}", Toast.LENGTH_SHORT
        ).show()

        isim.addTextChangedListener{
            var isimm = isim.text.toString()
            var sifree = sifre.text.toString()
            if(isimm == "Seher Yetkin" && sifree == "02200201035" ){
                if (swdurum==true){
                    editor.putString(anahtarisim, isimm)
                    editor.putString(anahtarsifre, sifree)
                    editor.apply()
                }
                Handler().postDelayed({
                    progress.visibility = View.VISIBLE
                    var ucegecis = Intent(applicationContext, MainActivity3::class.java)
                    startActivity(ucegecis)
                }, 1000)
            }
        }
        sifre.addTextChangedListener{
            var isimm = isim.text.toString()
            var sifree = sifre.text.toString()
            if(isimm == "Seher Yetkin" && sifree == "02200201035" ){
                if (swdurum==true){
                    editor.putString(anahtarisim, isimm)
                    editor.putString(anahtarsifre, sifree)
                    editor.apply()
                }
                Handler().postDelayed({
                    progress.visibility = View.VISIBLE
                    var ucegecis = Intent(applicationContext, MainActivity3::class.java)
                    startActivity(ucegecis)
                }, 1000)
            }
        }


  }


    }