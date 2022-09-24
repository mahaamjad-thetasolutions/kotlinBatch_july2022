package com.thetakotlintraining.Kotlinbatch_july2022.StudentList

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.thetakotlintraining.Kotlinbatch_july2022.MainActivity
import com.thetakotlintraining.Kotlinbatch_july2022.Models.Student
import com.thetakotlintraining.Kotlinbatch_july2022.R
import kotlinx.android.synthetic.main.activity_student_list.*
import kotlinx.android.synthetic.main.student_list_item_view.*
import java.io.Serializable


class StudentListActivity : AppCompatActivity(),StudentListClickListener {
    var studentAdapter=StudentListAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
       // dummyImage.setImageResource(R.drawable.ic_baseline_outdoor_grill_24)
        studentRecyclerView.apply {
            //LayoutManager
            layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            //Adapter
            adapter=studentAdapter
        }
        getStudentList()
        //profileImage.setOnClickListener {    Toast.makeText(baseContext,"This item is clicked", Toast.LENGTH_LONG).show() }
    }

    private fun getStudentList() {
        var studentList= arrayListOf<Student>()
        var student1=Student("Ali","1234567890","Computer Science",R.drawable.ic_baseline_outdoor_grill_24)
        studentList.add(student1)
        studentList.add(Student("Rizwan","234567654","Science",R.drawable.ic_baseline_pageview_24))
        studentList.add(Student("Asif","9876543456","BBA",R.drawable.ic_baseline_outdoor_grill_24))
        studentList.add(Student("Shaoib","2345678765432","Computer Science",R.drawable.ic_baseline_pest_control_24))
        studentList.add(Student("Safa","765434567","SE",R.drawable.ic_baseline_outdoor_grill_24))
        studentList.add(Student("Ayesha","765432","IT",R.drawable.ic_baseline_pest_control_24))
        studentList.add(Student("Sana","7654345678765","Zoology",R.drawable.ic_baseline_outdoor_grill_24))
        studentList.add(Student("Toba","8765432","Physics",R.drawable.ic_baseline_pest_control_24))
        studentList.add(Student("Hamid","3456789","Economics",R.drawable.ic_baseline_outdoor_grill_24))
        studentList.add(Student("tofeeq","98765432","Maths",R.drawable.ic_baseline_pageview_24))
        studentList.add(Student("Mehak","45678987654","Chemistry",R.drawable.ic_baseline_outdoor_grill_24))
        studentList.add(Student("Ahmed","87654345678","Biology",R.drawable.ic_baseline_pageview_24))
        studentAdapter.getStudentListFromActivity(studentList)
    }

//    override fun studentClick() {
//       Toast.makeText(baseContext,"This item is clicked", Toast.LENGTH_LONG).show()
//    }

    override fun studentShowNameClick(studentName: String) {
        Toast.makeText(baseContext,"Student anme is" + studentName, Toast.LENGTH_LONG).show()
    }

    override fun studentClick(student: Student) {
//     var i = Intent(baseContext,MainActivity::class.java)
//        i.putExtra("studentObject" , student as Serializable?)
//        startActivity(i)
    }
}