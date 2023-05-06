package org.example.api_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)

        btn1.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent = Intent(this, SubActivity2::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent = Intent(this, SubActivity3::class.java)
            startActivity(intent)
        }
    }
}