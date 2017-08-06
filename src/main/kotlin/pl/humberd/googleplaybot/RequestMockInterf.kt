package pl.humberd.googleplaybot

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RequestMockInterf {
    @GET("/posts/1")
    fun getPage(): Observable<MockResponse>

    @POST("/posts")
    fun postPage(@Body body: MockResponse): Observable<MockResponse>
}

data class MockResponse(val body: String)