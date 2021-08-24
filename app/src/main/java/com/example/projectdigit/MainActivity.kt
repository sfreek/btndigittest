package com.example.projectdigit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number: Int = 0
    private var btn_plus: Button? = null
    private var inc_incom: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_plus = findViewById(R.id.btn_plus)
        inc_incom = findViewById(R.id.inc_incom)

        btn_plus?.setOnClickListener {
            number++
            inc_incom?.text = number.toString()
        }
    }
}
