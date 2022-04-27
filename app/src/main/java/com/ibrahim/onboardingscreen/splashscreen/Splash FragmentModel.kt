package com.ibrahim.onboardingscreen.splashscreen


import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*



class splashModel : ViewModel() {

    val liveData: LiveData<SplashState>
        get() = mutableLiveData
    private val mutableLiveData = MutableLiveData<SplashState>()


    init {
        Handler(Looper.getMainLooper()).postDelayed({

        mutableLiveData.postValue(SplashState.MainAcivity())
        }, 3000)

    }

}
sealed class SplashState{
    class MainAcivity:SplashState()
}