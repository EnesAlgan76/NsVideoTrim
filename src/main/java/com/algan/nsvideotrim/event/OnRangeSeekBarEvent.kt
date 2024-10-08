package com.algan.nsvideotrim.event

import com.algan.nsvideotrim.view.RangeSeekBarView


interface OnRangeSeekBarEvent {
    fun onCreate(rangeSeekBarView: RangeSeekBarView, index: Int, value: Float)
    fun onSeek(rangeSeekBarView: RangeSeekBarView, index: Int, value: Float)
    fun onSeekStart(rangeSeekBarView: RangeSeekBarView, index: Int, value: Float)
    fun onSeekStop(rangeSeekBarView: RangeSeekBarView, index: Int, value: Float)
}