package com.example.ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(String(), "create");
    }

    override fun onStart() {
        super.onStart()
        Log.i(String(), "start");
    }

    override fun onResume() {
        super.onResume()
        Log.i(String(), "resume");
    }

    override fun onPause() {
        super.onPause()
        Log.i(String(), "paused");
    }

    override fun onStop() {
        super.onStop()
        Log.i(String(), "stopped");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(String(), "destroyed");
    }

}