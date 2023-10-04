package com.example.mvvmdailyaffirmationsapp.data.services

import com.example.mvvmdailyaffirmationsapp.data.models.Affirmations
import retrofit2.Response
import retrofit2.http.GET

interface AffirmationsApiService {

    @GET("")
    suspend fun getAffirmations() : ApiResponse<Affirmations>
}