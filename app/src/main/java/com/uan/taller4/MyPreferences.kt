package com.uan.taller4

import android.content.Context

class MyPreferences (context : Context){

    val PREFERENCE_NAME_H="SharePreferencesRate_h"
    val PREFERENCE_NAME_B="SharePreferencesRate_b"
    val PREFERENCE_NAME_M="SharePreferencesRate_m"
    val PREFERENCE_NAME_L="SharePreferencesRate_l"
    val PREFERENCE_NAME_MA="SharePreferencesRate_ma"
    val PREFERENCE_NAME_A="SharePreferencesRate_a"
    val PREFERENCE_RATE_H ="Rate"
    val PREFERENCE_RATE_B ="Rate"
    val PREFERENCE_RATE_M ="Rate"
    val PREFERENCE_RATE_L ="Rate"
    val PREFERENCE_RATE_MA ="Rate"
    val PREFERENCE_RATE_A ="Rate"

    val preferencesH =context.getSharedPreferences(PREFERENCE_NAME_H,Context.MODE_PRIVATE)
    val preferencesB =context.getSharedPreferences(PREFERENCE_NAME_B,Context.MODE_PRIVATE)
    val preferencesM =context.getSharedPreferences(PREFERENCE_NAME_M,Context.MODE_PRIVATE)
    val preferencesL =context.getSharedPreferences(PREFERENCE_NAME_L,Context.MODE_PRIVATE)
    val preferencesMA =context.getSharedPreferences(PREFERENCE_NAME_MA,Context.MODE_PRIVATE)
    val preferencesA =context.getSharedPreferences(PREFERENCE_NAME_A,Context.MODE_PRIVATE)

    fun getRateHomer(): Float {
        return  preferencesH.getFloat(PREFERENCE_RATE_H,0f)
    }

    fun setRateHomer(rate:Float){
        val editor = preferencesH.edit()
        editor.putFloat(PREFERENCE_RATE_H,rate)
        editor.apply()
    }
    fun getRateBart(): Float {
        return  preferencesB.getFloat(PREFERENCE_RATE_B,0f)
    }

    fun setRateBart(rate:Float){
        val editor = preferencesB.edit()
        editor.putFloat(PREFERENCE_RATE_B,rate)
        editor.apply()
    }

    fun getRateMarge(): Float {
        return  preferencesM.getFloat(PREFERENCE_RATE_M,0f)
    }

    fun setRateMarge(rate:Float){
        val editor = preferencesM.edit()
        editor.putFloat(PREFERENCE_RATE_M,rate)
        editor.apply()
    }

    fun getRateLisa(): Float {
        return  preferencesL.getFloat(PREFERENCE_RATE_L,0f)
    }

    fun setRateLisa(rate:Float){
        val editor = preferencesL.edit()
        editor.putFloat(PREFERENCE_RATE_L,rate)
        editor.apply()
    }
    fun getRateMaggie(): Float {
        return  preferencesMA.getFloat(PREFERENCE_RATE_MA,0f)
    }

    fun setRateMaggie(rate:Float){
        val editor = preferencesMA.edit()
        editor.putFloat(PREFERENCE_RATE_MA,rate)
        editor.apply()
    }
    fun getRateAbraham(): Float {
        return  preferencesA.getFloat(PREFERENCE_RATE_A,0f)
    }

    fun setRateAbraham(rate:Float){
        val editor = preferencesA.edit()
        editor.putFloat(PREFERENCE_RATE_A,rate)
        editor.apply()
    }



}