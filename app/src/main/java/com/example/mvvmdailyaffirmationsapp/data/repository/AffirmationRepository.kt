package com.example.mvvmdailyaffirmationsapp.data.repository

interface AffirmationRepository  {
    suspend fun getAffirmations()
}