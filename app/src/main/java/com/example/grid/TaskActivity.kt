package com.example.grid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.tlaabs.timetableview.Schedule
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_task.*
import java.util.*
import java.util.Calendar

class TaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        val calendar : Calendar = Calendar.getInstance()
        val year = Calendar.YEAR
        val month = Calendar.MONTH
        val day = Calendar.DAY_OF_MONTH


    }

}
