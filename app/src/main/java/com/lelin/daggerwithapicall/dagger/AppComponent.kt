package com.lelin.daggerwithapicall.dagger

import com.lelin.daggerwithapicall.network.MainApi
import com.lelin.daggerwithapicall.network.MainModule
import com.lelin.daggerwithapicall.network.NetworkModule
import com.lelin.daggerwithapicall.ui.MainActivity
import com.lelin.daggerwithapicall.ui.MainRepository
import dagger.Component

@Component(modules = [MainModule::class,NetworkModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun getRepo():MainRepository

}