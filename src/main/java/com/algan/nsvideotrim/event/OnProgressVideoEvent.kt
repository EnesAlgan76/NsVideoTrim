package com.algan.nsvideotrim.event

interface OnProgressVideoEvent {
    fun updateProgress(time: Float, max: Long, scale: Long)
}