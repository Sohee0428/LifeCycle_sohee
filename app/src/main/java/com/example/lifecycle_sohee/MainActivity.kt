package com.example.lifecycle_sohee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인 화면", "onCreate 실행됨")

        moveToOtherBtn.setOnClickListener {

            val myIntent = Intent(this, OtherActivity::class.java)

            startActivity(myIntent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("메인 화면", "onResume 실행 됨")
    }
}