package com.example.grid

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_create)
    }

    fun onCancelButtonClick(view: View) {
        this.onBackPressed()
    }

    fun onCreateButtonClick(view: View) {
        // input data processing
    }
}