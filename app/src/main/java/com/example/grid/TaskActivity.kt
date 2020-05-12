package com.example.grid

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_task.*
import java.util.Calendar
import javax.xml.datatype.DatatypeConstants.MONTHS

class TaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        start_date.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val calendar = Calendar.getInstance()
                val year = calendar.get(Calendar.YEAR)
                val month = calendar.get(Calendar.MONTH)
                val day = calendar.get(Calendar.DAY_OF_MONTH)


                DatePickerDialog(this@TaskActivity,
                    DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                        start_date.setText("$dayOfMonth/$monthOfYear/$year")
                    }, year, month, day
                ).show()

            }
        })
    }
}
