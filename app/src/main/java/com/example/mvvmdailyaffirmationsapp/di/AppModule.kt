package com.example.mvvmdailyaffirmationsapp.di

import com.example.mvvmdailyaffirmationsapp.data.repository.AffirmationRepository
import com.example.mvvmdailyaffirmationsapp.data.repository.AffirmationRepositoryImpl
import com.example.mvvmdailyaffirmationsapp.data.services.AffirmationsApiService
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {

    fun provideAffirmationRepository(apiService: AffirmationsApiService): AffirmationRepository {
        return AffirmationRepositoryImpl(apiService)
    }
}