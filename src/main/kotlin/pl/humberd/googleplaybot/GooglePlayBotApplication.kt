package pl.humberd.googleplaybot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@SpringBootApplication
class GooglePlayBotApplication

fun main(args: Array<String>) {
    SpringApplication.run(GooglePlayBotApplication::class.java, *args)


    val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val service = retrofit.create(Google::class.java)

    service.postPage(MockResponse("foobar"))
            .blockingSubscribe { println(it) }
}