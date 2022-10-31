package com.example.layouts_and_views
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var num1:Int = 0
    var num2:Int = 0

    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val score = arrayOf("1", "2", "3")
        val spinner1 = findViewById<Spinner>(R.id.result1)
        val spinner2 = findViewById<Spinner>(R.id.result2)
        var arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, score
        )
        spinner1.adapter = arrayAdapter
        spinner2.adapter = arrayAdapter

        var score1 = findViewById<TextView>(R.id.score1)
        var score2 = findViewById<TextView>(R.id.score2)



        var button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener {
            num1++
           score1.setText("$num1")
        }

        var button2 = findViewById<Button>(R.id.btn2)
        button2.setOnClickListener {
            num2++
            score2.setText("$num2")
        }

//            spinner1.onItemSelectedListener = object :
//
//        AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(
//                    parent: AdapterView<*>?,
//                    view: View?,
//                    position: Int,
//                    id: Long
//                ) {
//                    var position_val = score[position]+"$num1"
//                    score1.text = position_val
//                }
//
//                override fun onNothingSelected(parent: AdapterView<*>?) {
//                    TODO("Not yet implemented")
//                }
//
//            }



            }
       }


