package com.example.databinding2_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding2_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("W123","Alex")
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myData = student
        //binding.tvStudentId.text= student.studentId
        //binding.tvStudentName.text = student.studentName

        binding.btnUpdate.setOnClickListener(){
            student.studentName = "Jack"

            //Apply Binding for Update the data
            binding.apply {
                invalidateAll()
            }


        }
    }
}