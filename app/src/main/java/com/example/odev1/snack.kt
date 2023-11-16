package com.example.odev1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class snack : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var snackf = inflater.inflate(R.layout.fragment_snack, container, false)
        var spinner = view?.findViewById<Spinner>(R.id.spinner)
        var actionisim = view?.findViewById<EditText>(R.id.actionismi)
        var yazi = view?.findViewById<EditText>(R.id.mesaj)


        var girilenmesaj = yazi?.text.toString()
        var girilenaction = actionisim?.text.toString()

        var zaman = arrayOf("Süre Seçiniz", "2 sn", "2.5 sn", "3 sn", "3.5 sn", "4 sn")

        var adapter =
            ArrayAdapter(snackf.context, android.R.layout.simple_dropdown_item_1line, zaman)
        spinner?.adapter = adapter



        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2==0){

                }
                else if (p2==1){
                    Snackbar.make(snackf,"$girilenmesaj", 2000)
                        .setAction("$girilenaction"){
                            Toast.makeText(it.context,"$girilenaction",Toast.LENGTH_SHORT).show()
                        }.show()
                }
                else if(p2==2) {
                    Snackbar.make(snackf,"$girilenmesaj", 2500)
                        .setAction("$girilenaction"){
                            Toast.makeText(it.context,"$girilenaction",Toast.LENGTH_SHORT).show()
                        }.show()
                }
                else if(p2==3) {
                    Snackbar.make(snackf,"$girilenmesaj", 3000)
                        .setAction("$girilenaction"){
                            Toast.makeText(it.context,"$girilenaction",Toast.LENGTH_SHORT).show()
                        }.show()
                }
                else if(p2==4) {
                    Snackbar.make(snackf,"$girilenmesaj", 3500)
                        .setAction("$girilenaction"){
                            Toast.makeText(it.context,"$girilenaction",Toast.LENGTH_SHORT).show()
                        }.show()
                }
                else{
                    Snackbar.make(snackf,"$girilenmesaj", 4000)
                        .setAction("$girilenaction"){
                            Toast.makeText(it.context,"$girilenaction",Toast.LENGTH_SHORT).show()
                        }.show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        return inflater.inflate(R.layout.fragment_snack, container, false)
    }

}