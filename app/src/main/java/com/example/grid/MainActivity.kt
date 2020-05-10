package com.example.grid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.islandparadise14.mintable.model.ScheduleDay
import com.islandparadise14.mintable.model.ScheduleEntity
import com.islandparadise14.mintable.tableinterface.OnScheduleClickListener
import com.islandparadise14.mintable.tableinterface.OnScheduleLongClickListener
import com.islandparadise14.mintable.tableinterface.OnTimeCellClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        schedule.setOnClickListener(View.OnClickListener {
            //do something
        })

        table.setOnScheduleClickListener(
            object : OnScheduleClickListener {
                override fun scheduleClicked(entity: ScheduleEntity) {
                    //do something
                }
            }
        )

        table.setOnTimeCellClickListener(object : OnTimeCellClickListener {
            override fun timeCellClicked(scheduleDay: Int, time: Int) {
                //do something
            }
        })

        table.setOnScheduleLongClickListener(
            object : OnScheduleLongClickListener {
                override fun scheduleLongClicked(entity: ScheduleEntity) {
                    //do something
                }
            }
        )
    }

    private val day = arrayOf("Mon", "Tue", "Wen", "Thu", "Fri")

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        table.initTable(day)
        table.updateSchedules(scheduleList)
        scheduleList.add(schedule)
    }

    private val scheduleList: ArrayList<ScheduleEntity> = ArrayList()

    val schedule = ScheduleEntity(
        32, //originId
        "Database", //scheduleName
        "IT Building 301", //roomInfo
        ScheduleDay.TUESDAY, //ScheduleDay object (MONDAY ~ SUNDAY)
        "8:20", //startTime format: "HH:mm"
        "10:30", //endTime  format: "HH:mm"
        "#73fcae68", //backgroundColor (optional)
        "#000000" //textcolor (optional)
    )


}


