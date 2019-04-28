package com.example.changelanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mLanguageCode = "bn"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnChangeLangView?.setOnClickListener {
            LocaleHelper().setLocale(this, mLanguageCode)
            recreate()
        }
    }
}
