package com.hit.examapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_exam_list.*
import kotlinx.android.synthetic.main.activity_main.*

class ExamListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_list)



        val auth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword("user@hit.cn", "123456")

        button2.setOnClickListener {
            val intent = Intent(this, ExamInformationActivity::class.java)
            startActivity(intent)
        }


    }



    override fun onStart() {
        super.onStart()
    }
}