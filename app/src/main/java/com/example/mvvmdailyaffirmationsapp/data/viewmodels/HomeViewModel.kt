package com.example.mvvmdailyaffirmationsapp.data.viewmodels

import androidx.lifecycle.ViewModel
import com.example.mvvmdailyaffirmationsapp.data.repository.AffirmationRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val repository: AffirmationRepository
) : ViewModel() {

}