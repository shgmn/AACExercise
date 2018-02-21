package com.shgmn.aacexercise

import android.app.Application
import android.arch.lifecycle.GenericLifecycleObserver
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.ProcessLifecycleOwner
import timber.log.Timber

class MyApplication : Application(), GenericLifecycleObserver {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        ProcessLifecycleOwner.get().lifecycle.addObserver(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        ProcessLifecycleOwner.get().lifecycle.removeObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner?, event: Lifecycle.Event?) {
        Timber.d("MyApplication onStateChanged " + event?.name)
    }

}