package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_life_cycle.*

class LifeCycleActivity : AppCompatActivity() {
    //Attach XML Design with activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.d("LifeCycleActivity", "onCreate")

//        btn.setOnClickListener {
////            val i=Intent(Intent.ACTION_DIAL, Uri.parse("tel:03331874843"))
////            startActivity(i)
//            val i=Intent(Intent.ACTION_VIEW, Uri.parse("hy"))
//            startActivity(i)
////            val i=Intent(Intent.ACTION_SEND)
////            i.putExtra(Intent.EXTRA_EMAIL,"maha.thetasolutions@gmail.com")
////            i.putExtra(Intent.EXTRA_SUBJECT,"Query")
////            i.putExtra(Intent.EXTRA_TEXT,"We are in android kotlin class")
////            i.type="text/plain"
////            startActivity(i)
////            var dialog: AlertDialog.Builder = AlertDialog.Builder(this)
////            dialog.setTitle("Confirmation")
////            dialog.setMessage("Are you sure?")
////            dialog.setPositiveButton("Yes") { dialog, which -> exitApplication() }
////            dialog.setNegativeButton("No") { dialog, which -> }
////            dialog.setIcon(R.drawable.ic_baseline_login_24)
////            //dialog.setMultiChoiceItems("apple")
////            //dialog.setItems()
////            dialog.setNeutralButton("Cancel"){dialog, which ->dialog.dismiss()}
////            dialog.show()
//        }
    }
    //Show Design of Activity to USer
    override fun onStart() {
        super.onStart()
        Log.d("LifeCycleActivity","onStart")
    }

    //User can interact with Activity
    override fun onResume() {
        super.onResume()


        Log.d("LifeCycleActivity","onResume")

        //audio.play
    }


    override fun onPause() {
        super.onPause()
        Log.d("LifeCycleActivity","onPause")

    }


    override fun onStop() {
        super.onStop()
        //music.play
        Log.d("LifeCycleActivity","onPause")
    }


}

    private fun exitApplication() {
        TODO("Not yet implemented")
    }
