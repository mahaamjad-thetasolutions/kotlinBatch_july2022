package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_implicit_intent.*
import kotlin.math.log

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)
        implicitIntentBtn.setOnClickListener {
            Log.d("ButtonClickWorking","qwerty")
            val edittextValue=text.text.toString()
           // val i= Intent(Intent.ACTION_VIEW, Uri.parse(edittextValue))

            //val i=Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+edittextValue))

                //val i=Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Islam cneter hospital"))

            val i=Intent(Intent.ACTION_SEND)
            i.type="plain/text"
            i.putExtra(Intent.EXTRA_EMAIL,"maha@thetasolutions@gmail.com")
            i.putExtra(Intent.EXTRA_SUBJECT,"Query regarding Trainings")
            i.putExtra(Intent.EXTRA_TEXT,"We are in kotlin class")
            startActivity(i)
        }
    }
}