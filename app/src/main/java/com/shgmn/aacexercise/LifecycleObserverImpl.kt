package com.shgmn.aacexercise

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import timber.log.Timber

class LifecycleObserverImpl : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun calledOnCreate(source: LifecycleOwner) {
        Timber.d("calledOnCreate " + "Lifecycle.Event.ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun calledOnStart(source: LifecycleOwner) {
        Timber.d("calledOnStart " + "Lifecycle.Event.ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun calledOnResume(source: LifecycleOwner) {
        Timber.d("calledOnResume " + "Lifecycle.Event.ON_RESUME")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun calledOnPause(source: LifecycleOwner) {
        Timber.d("calledOnPause " + "Lifecycle.Event.ON_PAUSE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun calledOnStop(source: LifecycleOwner) {
        Timber.d("calledOnStop " + "Lifecycle.Event.ON_STOP")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun calledOnDestroy(source: LifecycleOwner) {
        Timber.d("calledOnDestroy " + "Lifecycle.Event.ON_DESTROY")
//        source.lifecycle.removeObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun calledOnAny(source: LifecycleOwner) {
        Timber.d("calledOnAny " + "Lifecycle.Event.ON_ANY")
    }
}