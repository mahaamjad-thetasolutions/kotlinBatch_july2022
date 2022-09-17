package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","onCreate")
        val userName=intent.getStringExtra("userName")
        val usergender=intent.getStringExtra("Gender")
        //var userID=intent.getIntExtra()
        //userName="qwerty"
        userNameDisplay.text=usergender

        SubmitBtn.setOnClickListener {
            var i =Intent(this, SignUpActivity::class.java)
            i.putExtra("Fruits",foodValue())
            startActivity(i)
        }
      //  macroni.setOnClickListener { Toast.makeText(this,"This is starter",Toast.LENGTH_LONG).show() }
//        macroni.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                //Do Whatever you want in isChecked
//            }
//            else{
//
//            }
//            Toast.makeText(this,"This is starter",Toast.LENGTH_LONG).show()
//        }
    }

    private fun foodValue(): String {
        var fruitList:String=""
        if(apple.isChecked==true)
        {
            fruitList= "Apple"
        }
        if(macroni.isChecked==true)
        {
            fruitList=fruitList +", Macroni"
        }
        if(grapes.isChecked==true)
        {
            fruitList=fruitList +", grapes"
        }
        return fruitList
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