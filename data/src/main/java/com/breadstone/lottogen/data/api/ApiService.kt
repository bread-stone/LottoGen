package com.breadstone.lottogen.data.api

import com.breadstone.lottogen.data.number.dto.WinNumberDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/common.do?method=getLottoNumber&drwNo={drwNo}")
    suspend fun getWinNumber(
        @Query("drwNo") drwNo: Int
    ): WinNumberDto


    @GET("/common.do?method=getLottoNumber&drwNo={drwNo}")
    suspend fun getQRCodeInquiry(
        @Query("drwNo") drwNo: Int
    ): WinNumberDto
    //https://mangveloper.com/3

//dataList
//    @GET("75cd336c-4f5e-4d08-9b3e-972c7f20a3ff")
//    suspend fun getSampleDataList(): List<SampleDataModelImpl>

//    //noData
//    @GET("451ddd4d-c6f9-4c15-b0b3-b69cc6fbd411")
//    suspend fun getNoData()
}
