package com.example.odev1

import android.animation.ValueAnimator
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.odev1.R


class acilis : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_acilis, container, false)

        var ucgen = view.findViewById<ImageView>(R.id.ucgen)

//        for (i in 1..30){
//            ucgen.visibility = View.INVISIBLE
//            Handler().postDelayed({
//                ucgen.visibility = View.VISIBLE
//            },500)
//        }


//        object : CountDownTimer(10000, 1000) {
//            override fun onTick(p0: Long) {
//                ucgen.visibility = View.INVISIBLE
//                Handler().postDelayed({
//                    ucgen.visibility = View.VISIBLE
//                }, 500)
//            }
//
//            override fun onFinish() {
//            }
//        }

        return inflater.inflate(R.layout.fragment_acilis, container, false)

    }
}