package com.lelin.daggerwithapicall.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lelin.daggerwithapicall.R
import com.lelin.daggerwithapicall.dagger.DaggerAppComponent
import com.lelin.daggerwithapicall.ui.model.Post
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent=DaggerAppComponent.create()
        appComponent.inject(this)
        appComponent.getRepo().getUser().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(this::onUserSussess,this::onError)
    }


    fun onUserSussess(users:List<Post>){
        Log.e("tag","${users.size}")

    }

    fun onError(t:Throwable){
        Log.e("tag","${t.localizedMessage}")
    }
}
