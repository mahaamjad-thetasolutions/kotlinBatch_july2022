package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","onCreate")
        val userName=intent.getStringExtra("userName")
        //var userID=intent.getIntExtra()
        //userName="qwerty"
        userNameDisplay.text=userName
    }
    //Show Design of Activity to USer
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    //User can interact with Activity
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }
}