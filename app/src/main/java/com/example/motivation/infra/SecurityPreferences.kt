package com.example.motivation.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    private val securityPreferences: SharedPreferences =
        context.getSharedPreferences("Motivation",Context.MODE_PRIVATE)

    fun storeString(key: String ,string: String) {
        securityPreferences.edit().putString(key, string).apply()
    }
    fun getString(key: String): String {
        return securityPreferences.getString(key,"") ?: ""
    }

}