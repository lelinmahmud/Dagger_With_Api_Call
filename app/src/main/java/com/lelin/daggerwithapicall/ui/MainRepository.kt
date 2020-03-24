package com.lelin.daggerwithapicall.ui

import com.lelin.daggerwithapicall.network.MainApi
import com.lelin.daggerwithapicall.ui.model.Post
import io.reactivex.Flowable

class MainRepository(private val mainApi: MainApi) {

    fun getUser():Flowable<List<Post>>{
        return mainApi.getAllUser()
    }
}