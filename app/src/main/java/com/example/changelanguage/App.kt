package com.example.changelanguage

import android.app.Application
import android.util.Log

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val language = LocaleHelper().getLanguage(this@App)
        LocaleHelper().setLocale(this,language)
//        Log.d("value", "===1"+language)
 //       Constants.LANGUAGE_SELECTED = language
    }
}