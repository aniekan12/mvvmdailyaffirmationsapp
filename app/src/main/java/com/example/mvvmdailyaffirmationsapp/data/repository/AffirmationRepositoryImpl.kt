package com.example.mvvmdailyaffirmationsapp.data.repository

import com.example.mvvmdailyaffirmationsapp.data.services.AffirmationsApiService
import javax.inject.Inject

class AffirmationRepositoryImpl @Inject constructor(
    apiService: AffirmationsApiService
) : AffirmationRepository {
    override suspend fun getAffirmations() {
        TODO("Not yet implemented")
    }
}