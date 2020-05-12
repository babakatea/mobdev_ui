package com.example.grid

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import android.content.Intent
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.github.tlaabs.timetableview.Schedule
import com.github.tlaabs.timetableview.Time
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.app_toolbar.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init toolbar
        initializeToolbar()

        // schedule work
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

    // toolbar initializing
    fun initializeToolbar() {
        setSupportActionBar(toolbar as Toolbar?)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId;
        if (id == R.id.create_project_btn) {
            onCreateProjectButtonClick()
        }
        else if (id == R.id.archived_projects_btn) {
            // move to archived projects view
        }
        return super.onOptionsItemSelected(item)
    }

    fun onCreateProjectButtonClick() {
        val createProjectIntent = Intent(this, CreateProjectActivity::class.java)
        startActivity(createProjectIntent)
    }

}


