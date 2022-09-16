package com.thetakotlintraining.Kotlinbatch_july2022.StudentList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thetakotlintraining.Kotlinbatch_july2022.Models.Student
import com.thetakotlintraining.Kotlinbatch_july2022.R
import kotlinx.android.synthetic.main.activity_student_list.*

class StudentListActivity : AppCompatActivity() {
    var studentAdapter=StudentListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        studentRecyclerView.apply {
            //LayoutManager
            layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            //Adapter
            adapter=studentAdapter
        }
        getStudentList()
    }

    private fun getStudentList() {
        var studentList= arrayListOf<Student>()
        var student1=Student("Ali","1234567890","Computer Science")
        studentList.add(student1)
        studentList.add(Student("Rizwan","234567654","Science"))
        studentList.add(Student("Asif","9876543456","BBA"))
        studentList.add(Student("Shaoib","2345678765432","Computer Science"))
        studentList.add(Student("Safa","765434567","SE"))
        studentList.add(Student("Ayesha","765432","IT"))
        studentList.add(Student("Sana","7654345678765","Zoology"))
        studentList.add(Student("Toba","8765432","Physics"))
        studentList.add(Student("Hamid","3456789","Economics"))
        studentList.add(Student("tofeeq","98765432","Maths"))
        studentList.add(Student("Mehak","45678987654","Chemistry"))
        studentList.add(Student("Ahmed","87654345678","Biology"))
        studentAdapter.getStudentListFromActivity(studentList)
    }
}