package com.ibrahim.onboardingscreen.splashscreen

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class splashModel : ViewModel() {

    val liveData: LiveData<SplashState>
        get() = mutableLiveData
    private val mutableLiveData = MutableLiveData<SplashState>()


    init {
        GlobalScope.launch {
            delay(3000)
            mutableLiveData.postValue(SplashState.MainAcivity())
        }
    }

}
sealed class SplashState{
    class MainAcivity:SplashState()
}