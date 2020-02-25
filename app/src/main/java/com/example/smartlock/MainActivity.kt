package com.example.smartlock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lock_btn = findViewById<Button>(R.id.lock)

        lock_btn.setOnClickListener {

            // TODO Lock lock via NFC

            val locker = findViewById<ImageView>(R.id.locker)
            locker.setBackgroundResource(R.drawable.ic_lock_outline_black_24dp)
        }

        val unlock_btn = findViewById<Button>(R.id.unlock)

        unlock_btn.setOnClickListener{

            // TODO Unlock lock via NFC

            val locker = findViewById<ImageView>(R.id.locker)
            locker.setBackgroundResource(R.drawable.ic_lock_open_black_24dp)
        }

    }
}
