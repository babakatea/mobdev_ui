package com.example.grid

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.project_create.*
import java.util.*

class CreateProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_create)
    }

    fun onChooseStartDateButtonClick(view: View) {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val startDateText = findViewById<TextView>(R.id.create_project_start_date_text)
                    .setText(dayOfMonth.toString() + "." + monthOfYear + "." + year)
            }, year, month, day
        )
        dpd.show()
    }

    fun onChooseEndDateButtonClick(view: View) {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val startDateText = findViewById<TextView>(R.id.create_project_end_date_text)
                    .setText(dayOfMonth.toString() + "." + monthOfYear + "." + year)
            }, year, month, day
        )
        dpd.show()
    }

    fun onCancelButtonClick(view: View) {
        this.onBackPressed()
    }

    fun onCreateButtonClick(view: View) {
        // input data processing
        // input values
        val projectTitle = findViewById<EditText>(R.id.create_project_title_input).text.toString()
        val projectDescription =
            findViewById<EditText>(R.id.create_project_description_input).text.toString()
//        val projectStartDate = findViewById<EditText>(R.id.create_project_start_date_input).text.toString()
//        val projectEndDate = findViewById<EditText>(R.id.create_project_end_date_input).text.toString()
//        val projectColor = findViewById<EditText>(R.id.create_project_color_input).text.toString()
    }

    fun onChooseColorButtonClick(view: View) {

    }
}