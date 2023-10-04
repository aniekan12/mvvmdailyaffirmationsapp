package com.example.mvvmdailyaffirmationsapp.data.services

import android.provider.ContactsContract.Data

sealed class ApiResponse<out T> {
    data class Success<out T>(val data: T) : ApiResponse<T>()
    data class Error<T>(val message: String) : ApiResponse<Nothing>()

    override fun toString(): String {
        when (this) {
            is Success -> "success: $data"
            is Error<*> -> "error $message"
        }
        return super.toString()
    }
}
