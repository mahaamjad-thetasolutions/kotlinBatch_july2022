package com.thetakotlintraining.Kotlinbatch_july2022

import android.R.attr
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.regex.Matcher
import java.util.regex.Pattern


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var fruit=intent.getStringExtra("Fruits")
        screen_Label.text=fruit
        signUpbtn.setOnClickListener {
            var firstName=edtusername.text.toString()
            var password=edtpassword.text.toString()
            var email=edtUserEmail.text.toString()
            validateForm(firstName,password,email)

        }
    }

    private fun validateForm(firstName: String, password: String, email: String) {
        if(firstName.isNullOrEmpty())
        {
            edtusername.error="PleaseEnter Username."
            Log.d("Validation","Firstname")
            return
        }
        else
        {
            if(firstName.length<8)
            {
                edtusername.error="Please Enter atleast 8 chracters."
                Log.d("Validation","Firstname")
                return
            }
        }
        if(email.isNullOrEmpty())
        {
            edtUserEmail.error="Please Enter Email."
            Log.d("Validation","email")
            return
        }
        else
        {
            if(email.length<8)
            {
                edtUserEmail.error="Please Enter correct email."
                Log.d("Validation","email")
                return
            }
        }
        if(password.isNullOrEmpty())
        {
            edtpassword.error="Please Enter Password."
            Log.d("Validation","password")
            return
        }
        else
        {
            val patterForPasswordRegex=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{4,}\$")
            if(!patterForPasswordRegex.matcher(password).matches())
            {
                edtpassword.error="Please Enter chracters between 8 and 15."
                Log.d("Validation","password")
                return
            }
        }
        movetoMainActivity(email)
    }

    private fun movetoMainActivity(email: String) {
            val i=Intent(this,MainActivity::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            i.putExtra("UserEmail",email)
            i.putExtra("userName",edtusername.text.toString())
            startActivity(i)
    }
}