package com.hit.examapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_exam_information.*
import kotlinx.android.synthetic.main.activity_main.*

class ExamInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "MyMessage"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_information)
        Log.d(TAG, "onCreate: ")

        button6.setOnClickListener {
            val intent = Intent(this, ProblemActivity::class.java)
            startActivity(intent)
        }
    }
}