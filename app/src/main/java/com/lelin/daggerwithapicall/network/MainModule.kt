package com.lelin.daggerwithapicall.network

import com.lelin.daggerwithapicall.ui.MainRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class MainModule {
    @Provides
    fun provideMainApi(retrofit: Retrofit):MainApi{
        return retrofit.create(MainApi::class.java)
    }

    @Provides
    fun provideMainRepository(mainApi: MainApi):MainRepository{
        return MainRepository(mainApi)
    }
}