package com.shouexample.k.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)



        button1.setOnClickListener() {
            var text = editText1.text.toString()
            var num1 = text.toDouble()
            var text2 = editText2.text.toString()
            var num2 = text.toDouble()

        button2.setOnClickListener() {
            var text = editText1.text.toString()
            var num1 = text.toDouble()
            var text2 = editText2.text.toString()
            var num2 = text.toDouble()

        button3.setOnClickListener() {
            var text = editText1.text.toString()
            var num1 = text.toDouble()
            var text2 = editText2.text.toString()
            var num2 = text.toDouble()

        button4.setOnClickListener() {
            var text = editText1.text.toString()
            var num1 = text.toDouble()
            var text2 = editText2.text.toString()
            var num2 = text.toDouble()

         setOnClickListener{ v ->
            var TextView = 0
            if (v.id == R.id.button1) {
                var TextView = num1 + num2
            } else if (v.id == R.id.button2) {
                var TextView = num1 - num2
            } else if (v.id == R.id.button3) {
                var TextView = num1 * num2
            } else if (v.id == R.id.button4) {
                var TextView = num1 / num2
            }
        }}
    }}}}

    override fun onClick(v:View?){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)


    }



}
