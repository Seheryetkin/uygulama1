package com.example.odev1

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.graphics.toColor

class rgb : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rgbdeg = inflater.inflate(R.layout.fragment_rgb, container, false)
        var arkaplan = rgbdeg.findViewById<FrameLayout>(R.id.arkaplan)
        var seekred = rgbdeg.findViewById<SeekBar>(R.id.seekred)
        var seekgreen = rgbdeg.findViewById<SeekBar>(R.id.seekgreen)
        var seekblue = rgbdeg.findViewById<SeekBar>(R.id.seekblue)
        var renkyazi = rgbdeg.findViewById<TextView>(R.id.renkhex)

        var r = 0
        var g = 0
        var b= 0
        var rr ="00"
        var gg ="00"
        var bb ="00"

        seekred.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                r = seekred.progress
                rr = Integer.toHexString(r)
                arkaplan.setBackgroundColor(Color.rgb(r,g,b))
                renkyazi.text = "#$rr$gg$bb"
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
        seekgreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                g = seekgreen.progress
                gg = Integer.toHexString(g)
                arkaplan.setBackgroundColor(Color.rgb(r,g,b))
                renkyazi.text = "#$rr$gg$bb"
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        seekblue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                b = seekblue.progress
                bb = Integer.toHexString(b)
                arkaplan.setBackgroundColor(Color.rgb(r,g,b))
                renkyazi.text = "#$rr$gg$bb"
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })




        return rgbdeg
    }


}