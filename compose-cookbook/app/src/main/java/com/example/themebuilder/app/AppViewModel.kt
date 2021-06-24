package com.example.themebuilder.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.themebuilder.app.navigation.Screens

class AppViewModel: ViewModel() {
    private val _currentScreen = MutableLiveData<Screens>(Screens.MainScreens.Home)
    val currentScreen: LiveData<Screens> = _currentScreen

    fun setCurrentScreen(screen: Screens) {
        _currentScreen.value = screen
    }
}