package com.vk.directop.workmanagerexplore

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    //if not work change commented lines
    //@GET("/wp-content/uploads/2022/02/220849-scaled.jpg")
    @GET("/wallpapers/9/6/554705298270736/ssha-shtat-arizona-nacionalnyj-park-grand-kanon-grand-kanon-skaly-gory-pustynya-nebo-zakat.jpg")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object{
        val instance by lazy {
            Retrofit.Builder()
                //.baseUrl("https://pl-coding.com")
                .baseUrl("https://w-dog.ru")
                .build()
                .create(FileApi::class.java)
        }
    }
}
//download not default picture
//https://w-dog.ru/wallpapers/9/6/554705298270736/ssha-shtat-arizona-nacionalnyj-park-grand-kanon-grand-kanon-skaly-gory-pustynya-nebo-zakat.jpg

//MVVM
//Retrofit
//Database
//https://www.youtube.com/watch?v=Psc2xyutE2U&t=1880s
