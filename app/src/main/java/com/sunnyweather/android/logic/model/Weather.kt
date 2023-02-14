package com.sunnyweather.android.logic.model

/**
 * 天气信息
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)