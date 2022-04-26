package com.ibrahim.onboardingscreen.splashscreen


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*



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