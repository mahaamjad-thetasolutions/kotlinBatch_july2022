package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        Handler().postDelayed({moveToMainActivity()},3000)
    }

    private fun moveToMainActivity() {
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}