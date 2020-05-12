package com.example.grid

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.updateLayoutParams
import com.github.tlaabs.timetableview.Schedule
import com.github.tlaabs.timetableview.Time
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val projectNames = arrayOf("", "MAP", "MobDev", "SQR", "gpdd", "dfbdktohdkt")
        val numDays = 30

        timetable.updateHeaderTitle(projectNames)

//        val builder = ProjectTableView.Builder(timetable_linear.context)
//        builder.setRowCount(numDays)
//        builder.setHeaderTitle(projectNames)
//        val timetable = builder.build()
//        timetable_linear.addView(timetable)



        val schedules = ArrayList<Schedule>()
        val schedule = Schedule()
        schedule.classTitle = "Data Structure" // sets subject

        schedule.classPlace = "IT-601" // sets place

        schedule.professorName = "Won Kim" // sets professor

        schedule.startTime = Time(10, 0) // sets the beginning of class time (hour,minute)

        schedule.endTime = Time(13, 30) // sets the end of class time (hour,minute)

        schedules.add(schedule)
//.. add one or more schedules
        timetable.add(schedules)

        val taskIntent = Intent(this, TaskActivity::class.java)


        timetable.setOnStickerSelectEventListener(object : ProjectTableView.OnStickerSelectedListener {
            override fun OnStickerSelected(idx: Int, schedules: java.util.ArrayList<Schedule>?){
                startActivity(taskIntent)
            }
        })
    }




}


