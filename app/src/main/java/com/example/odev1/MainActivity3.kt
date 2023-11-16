package com.example.odev1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.odev1.rgb

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var buton = findViewById<Button>(R.id.button)
        var preferences = getSharedPreferences(dosyayolu, Context.MODE_PRIVATE)
        var editor = preferences.edit()

        buton.setOnClickListener{
            val acilirmenu = PopupMenu(this,buton)
            acilirmenu.menuInflater.inflate(R.menu.menu,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i ->
                when(i.itemId){
                    R.id.rgb ->{
                        fragmentcagir(rgb())
                        true }
                    R.id.snack ->{
                        fragmentcagir(snack())
                        true }
                    R.id.cikis ->{
                        val tasarim = layoutInflater.inflate(R.layout.cikisalert, null)
                        val ozeluyaripenceresi = AlertDialog.Builder(this)
                        ozeluyaripenceresi.setView(tasarim)
                        var isim = tasarim.findViewById<EditText>(R.id.name)
                        var sifre = tasarim.findViewById<EditText>(R.id.password)

                        isim.addTextChangedListener(object : TextWatcher {
                            override fun afterTextChanged(p0: Editable?) {
                            }
                            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            }
                            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                                var isimm = isim.text.toString()
                                var yass = sifre.text.toString()
                                if(isimm=="Seher Yetkin" && yass =="02200201035"){
                                    editor.remove(anahtarisim)
                                    editor.remove(anahtarsifre)
                                    editor.remove(anahtarswitch)
                                        .commit()
                                    var gecis = Intent(this@MainActivity3,MainActivity2::class.java)
                                    startActivity(gecis)
                                }
                            }
                        })
                        sifre.addTextChangedListener(object : TextWatcher {
                            override fun afterTextChanged(p0: Editable?) {
                            }
                            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                            }
                            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                                var isimm = isim.text.toString()
                                var yass = sifre.text.toString()
                                if(isimm=="Seher Yetkin" && yass =="02200201035"){
                                    editor.remove(anahtarisim)
                                    editor.remove(anahtarsifre)
                                    editor.remove(anahtarswitch)
                                        .commit()
                                    var gecis = Intent(this@MainActivity3,MainActivity2::class.java)
                                    startActivity(gecis)
                                }
                            }
                        })
                        ozeluyaripenceresi.create().show()
                        true
                    }
                    else -> false
                }
            }
            acilirmenu.show()
        }

    }

    fun fragmentcagir(bolum : Fragment){
        var gecis = supportFragmentManager.beginTransaction()
        gecis.replace(R.id.fragmentContainerView,bolum)
        gecis.commit()
    }

}