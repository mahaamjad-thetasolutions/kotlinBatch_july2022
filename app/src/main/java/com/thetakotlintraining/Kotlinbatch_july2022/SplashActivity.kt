package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        if (userISLOgin()) {
//
//            Handler().postDelayed(
//                {
//                    movetoMainActivity()
//                },
//                3000
//            )
//        } else {
//            Handler().postDelayed(
//                {
//                    LoginActivity()
//                },
//                3000
//            )
//        }

        Handler().postDelayed(
            {
                movetoMainActivity()
            },
            3000
        )

    }
    private fun movetoMainActivity() {
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}