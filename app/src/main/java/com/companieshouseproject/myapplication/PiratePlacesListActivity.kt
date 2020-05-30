package com.companieshouseproject.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders

private const val KEY_INDEX = "index"
private const val REQUEST_CODE_CHECK_IN = 0

class PiratePlacesListActivity : AppCompatActivity() {

    private lateinit var nameTextView : TextView
    private lateinit var visitedWithTextView : TextView
    private lateinit var nextButton: Button
    private lateinit var prevButton: Button

//    private val PiratePlacesViewModel : PiratePlacesViewModel by lazy {
//        ViewModelProviders.of(this).get(PiratePlacesViewModel::class.java)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pirate_places_list)


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
//        outState.putInt(KEY_INDEX, PiratePlacesViewModel.currentIndex)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode != Activity.RESULT_OK) {
            return
        }

//        if (requestCode == REQUEST_CODE_CHECK_IN) {
//            Toast.makeText(this, R.string.checked_in_message, Toast.LENGTH_SHORT).show()
//        }
    }

    private fun updateUI() {

    }
}