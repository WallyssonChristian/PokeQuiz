package com.example.administrador.meuprimeiroquiz;


import android.content.Context;
import android.content.SharedPreferences;

public class Score {

    public Score(){

    }

    private static String pref = "com.example.administrador.meuprimeiroquiz.score";

    public static SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences(pref, Context.MODE_PRIVATE);
    }

    public static void setScore(int score, Context context) {
        SharedPreferences sharedPref = getSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("score", score);
        editor.apply();
    }

    public static int getScore(Context context){
        SharedPreferences sharedPref = getSharedPreferences(context);
        return sharedPref.getInt("score", 0);
    }
}
