package com.example.exm

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    val textView: TextView=findViewById(R.id.textView)
    val textView1: TextView=findViewById(R.id.textView3)
    val textView2:TextView=findViewById(R.id.textView2)
    val textView3:TextView=findViewById(R.id.textView4)
    val textView11:TextView=findViewById(R.id.textView11)
    val button:Button=findViewById(R.id.button)
    val buttonStart:Button=findViewById(R.id.button2)
    val editText:EditText=findViewById(R.id.editTextNumber)

    val a=(0..100).random()
    val b=(0..100).random()
    val dest= arrayOf("/","*","+","-")
    val v=dest.random();
    var chetv=0
    var chetn=0
    var vern=0
    var result=editText.toString()
    fun butStart(){
        textView.setText(a.toString())
        textView1.setText((b.toString()))
        textView2.setText(v)

    }

    fun buttonCheck(view: View){
        when(v){
            "*"->vern=a*b
            "-"->vern=a-b
            "+"->vern=a+b
            "/"->vern=a/b
        }
        if(result.toInt()==vern){
            chetv++
        }
        else {
            chetn++
        }
        var proc=(chetn/(chetn+chetv)*100).toString()
        textView11.setText(proc)
    }
    }






