package com.tutorialsbuzz.androidcustomspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //custom spinner
        val stringArr: Array<String> = resources.getStringArray(R.array.mode);
        val dataAdapter = ArrayAdapter<String>(this, R.layout.simple_spinner_item, stringArr)
        dataAdapter.setDropDownViewResource(R.layout.simple_spinner_drop_down)
        spinner03.adapter = dataAdapter


        spinner03.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, stringArr[position], Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

    }


}
