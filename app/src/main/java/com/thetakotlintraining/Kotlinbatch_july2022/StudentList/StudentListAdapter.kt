package com.thetakotlintraining.Kotlinbatch_july2022.StudentList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thetakotlintraining.Kotlinbatch_july2022.Models.Student
import com.thetakotlintraining.Kotlinbatch_july2022.R
import kotlinx.android.synthetic.main.student_list_item_view.view.*

class StudentListAdapter: RecyclerView.Adapter<StudentListAdapter.studentVH>() {
    lateinit var finalStudentList:ArrayList<Student>
    class studentVH(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): studentVH {
        val studentview=LayoutInflater.from(parent.context).inflate(R.layout.student_list_item_view,parent,false)
        return studentVH(studentview)
    }

    override fun onBindViewHolder(holder: studentVH , position: Int) {
       val student=finalStudentList[position]
        holder.itemView.Name.text=student.studentName
        holder.itemView.studentDepartment.text=student.Department
        holder.itemView.studentPhoneNumber.text=student.studentPhone
    }

    override fun getItemCount(): Int {
        return finalStudentList.count()
    }
    fun getStudentListFromActivity(studentList: ArrayList<Student>)
    {
        finalStudentList=studentList
    }
}