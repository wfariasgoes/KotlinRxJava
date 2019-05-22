package br.com.amedigital.kotlinrxjava.retrofit

import br.com.amedigital.kotlinrxjava.model.Post
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST

interface IMyAPI {

    @get:GET("post")
    val posts: Observable<List<Post>>

}