package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 实时天气信息
 */
data class RealtimeResponse(val status: String, val result: Result){

    data class Result(val realtime: Realtime)

    /**
     * @param skycon      天气状况
     * @param temperature 温度
     * @param airQuality  空气质量
     */
    data class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)

    /**
     * AQI空气质量
     * @param chn 污染物浓度
     */
    data class AQI(val chn: Float)

}