package com.thetakotlintraining.Kotlinbatch_july2022.StudentList

import com.thetakotlintraining.Kotlinbatch_july2022.Models.Student

interface StudentListClickListener {
    //fun studentClick()
    fun studentShowNameClick(studentName:String)
    fun studentClick(student: Student)
}