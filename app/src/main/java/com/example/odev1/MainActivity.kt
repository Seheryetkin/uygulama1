package com.example.odev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.SeekBar
import androidx.core.os.postDelayed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seek = findViewById<SeekBar>(R.id.seek)
        var progress = findViewById<ProgressBar>(R.id.progress)


        seek.setOnSeekBarChangeListener(object  : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if (p1==100){
                    progress.visibility = View.VISIBLE
                    Handler().postDelayed({
                        seek.setProgress(0,true)
                    },200)
                    Handler().postDelayed({
                        var ikiyegecis = Intent(applicationContext,MainActivity2::class.java)
                        startActivity(ikiyegecis)
                    },2000)
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                var seekdurum = seek.progress
                if(seekdurum != 100){
                    Handler().postDelayed({
                        seek.setProgress(0,true)
                    },200)
                }
            }
        })

    }
}