package com.shgmn.aacexercise

import android.arch.lifecycle.Lifecycle
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.d("onCreate " + lifecycle.currentState.name)

        Handler().postDelayed({
            Timber.d("onCreate " + lifecycle.currentState.name)
        }, 1000)
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart " + lifecycle.currentState.name)
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume " + lifecycle.currentState.name)
    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause " + lifecycle.currentState.name)
    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop " + lifecycle.currentState.name)
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy " + lifecycle.currentState.name)
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("onRestart " + lifecycle.currentState.name)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Timber.d("onSaveInstanceState " + lifecycle.currentState.name)
        super.onSaveInstanceState(outState)
        Timber.d("onSaveInstanceState " + lifecycle.currentState.name)
    }
}
