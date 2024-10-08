package com.algan.nsvideotrim.event

import android.net.Uri

interface OnVideoEditedEvent {
    //    fun onTrimStarted()
    fun getResult(uri: Uri)

    //    fun cancelAction()
    fun onError(message: String)
    fun onProgress(percentage: Int)
}