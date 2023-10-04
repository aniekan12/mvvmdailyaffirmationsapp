package com.example.mvvmdailyaffirmationsapp.data.models

sealed class NavItems(val route:String){
    object HomeRoute:NavItems("home_screen")
    object SplashScreen:NavItems("splash_screen")
}
