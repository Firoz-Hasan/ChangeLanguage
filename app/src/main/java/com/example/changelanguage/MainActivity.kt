package com.example.changelanguage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("value", "oncreate")
        setContentView(R.layout.activity_main)

        val lng = LocaleHelper().getLanguage(this)
       LocaleHelper().setLocale(this,lng)
        Log.d("value", "===" + lng)

        try {
            if (lng?.equals("bn", true)!!) {
                btnChangeLangView?.text = "Change Language to English!"

            } else {
                btnChangeLangView?.text = "বাংলা ভাষাতে পরিবর্তন"

            }

        } catch (e: Exception) {
        }
        btnChangeLangView?.setOnClickListener {
            try {
                var lngnew = "bn"
                if (lng?.equals("bn", true)!!) {
                    lngnew = "en"
                }

                LocaleHelper().setLocale(this, lngnew)
     //           Constants.LANGUAGE_SELECTED = lngnew
                val refresh = Intent(this, MainActivity::class.java)
                startActivity(refresh)

            } catch (e: Exception) {

            }


        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("value", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("value", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("value", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("value", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("value", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("value", "onRestart")
    }
}
