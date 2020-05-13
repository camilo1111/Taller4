package com.uan.taller4

import android.content.Context

class MyPreferences (context : Context){

    val PREFERENCE_NAME_H="SharePreferencesRate_h"
    val PREFERENCE_NAME_B="SharePreferencesRate_b"
    val PREFERENCE_RATE_H ="Rate"
    val PREFERENCE_RATE_B ="Rate"

    val preferencesH =context.getSharedPreferences(PREFERENCE_NAME_H,Context.MODE_PRIVATE)
    val preferencesB =context.getSharedPreferences(PREFERENCE_NAME_B,Context.MODE_PRIVATE)

    fun getRateHomer(): Float {
        return  preferencesH.getFloat(PREFERENCE_RATE_H,5f)
    }

    fun setRateHomer(rate:Float){
        val editor = preferencesH.edit()
        editor.putFloat(PREFERENCE_RATE_H,rate)
        editor.apply()
    }
    fun getRateBart(): Float {
        return  preferencesB.getFloat(PREFERENCE_RATE_B,4f)
    }

    fun setRateBart(rate:Float){
        val editor = preferencesB.edit()
        editor.putFloat(PREFERENCE_RATE_B,rate)
        editor.apply()
    }

    fun getRateMarge(): Float {
        return  preferencesH.getFloat(PREFERENCE_RATE_H,3f)
    }

    fun setRateMarge(rate:Float){
        val editor = preferencesH.edit()
        editor.putFloat(PREFERENCE_RATE_H,rate)
        editor.apply()
    }

    fun getRateLisa(): Float {
        return  preferencesH.getFloat(PREFERENCE_RATE_H,2f)
    }

    fun setRateLisa(rate:Float){
        val editor = preferencesH.edit()
        editor.putFloat(PREFERENCE_RATE_H,rate)
        editor.apply()
    }
    fun getRateMaggie(): Float {
        return  preferencesH.getFloat(PREFERENCE_RATE_H,1f)
    }

    fun setRateMaggie(rate:Float){
        val editor = preferencesH.edit()
        editor.putFloat(PREFERENCE_RATE_H,rate)
        editor.apply()
    }
    fun getRateAbraham(): Float {
        return  preferencesH.getFloat(PREFERENCE_RATE_H,0f)
    }

    fun setRateAbraham(rate:Float){
        val editor = preferencesH.edit()
        editor.putFloat(PREFERENCE_RATE_H,rate)
        editor.apply()
    }



}