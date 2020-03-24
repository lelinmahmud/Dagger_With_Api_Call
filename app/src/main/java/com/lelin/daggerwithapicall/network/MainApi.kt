package com.lelin.daggerwithapicall.network

import com.lelin.daggerwithapicall.ui.model.Post
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.POST

interface MainApi {

    @GET("/posts")
     fun getAllUser():Flowable<List<Post>>
}