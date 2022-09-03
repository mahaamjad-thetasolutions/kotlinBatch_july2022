package com.thetakotlintraining.Kotlinbatch_july2022.StudentList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thetakotlintraining.Kotlinbatch_july2022.R
import kotlinx.android.synthetic.main.activity_student_list.*

class StudentListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        studentRecyclerView.apply {
            //LayoutManager
            layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            //StudentAdapter

        }
    }
}