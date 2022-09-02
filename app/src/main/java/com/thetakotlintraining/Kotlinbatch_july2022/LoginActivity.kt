package com.thetakotlintraining.Kotlinbatch_july2022

import android.content.Intent
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        genderGroup.setOnCheckedChangeListener { group, checkedId ->
//            run{
//                when(checkedId){
//                    R.id.rbmale -> {
//                        rbfemale.isChecked=false
//                        rbother.isChecked=false
//                        gender="Male"
//                    }
//                    R.id.rbfemale -> {
//                        rbmale.isChecked=false
//                        rbother.isChecked=false
//                        gender="Female"
//                    }
//                    R.id.rbother -> {
//                        rbfemale.isChecked=false
//                        rbmale.isChecked=false
//                        gender="Other"
//                    }
//                }
//
//            }
//        }
        var country=0
        residentgroup.setOnCheckedChangeListener { group, checkedId ->
            run{
                when(checkedId){
                    R.id.rbPakistan ->{
                        city.isVisible=true
                        country=1
                    }
                    R.id.rbOtherCountry ->{
                        city.isVisible=false
                        country=0
                    }
                }
            }
        }
        SubmitBtn.setOnClickListener {

            var i= Intent(this , MainActivity::class.java)
            i.putExtra("Gender",  genderValue())
            startActivity(i)
        }
    }

    private fun genderValue(): String {
        val radiocheckedID=genderGroup.checkedRadioButtonId
        var gender=""
        if(radiocheckedID==R.id.rbfemale)
        {
            gender="female"
        }
        else if(radiocheckedID==R.id.rbmale)
        {
            gender="male"
        }
        else{
            gender="other"
        }
        return gender
    }
}

