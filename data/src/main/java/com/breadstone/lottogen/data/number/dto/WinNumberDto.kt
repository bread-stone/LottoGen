package com.breadstone.lottogen.data.number.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.annotation.Nonnull

@Entity(tableName = "WinNumber")
data class WinNumberDto(
    @PrimaryKey
    @Nonnull
    val drwNo: Int,   //회차
    val drwNoDate: String, //추첨일
    val totSellamnt: Long,  //총 상금
    val firstWinamnt: Int,  //1등 상금
    val firstPrzwnerCo: Int,  //1등 숫자
    val drwtNo1: Int,
    val drwtNo2: Int,
    val drwtNo3: Int,
    val drwtNo4: Int,
    val drwtNo5: Int,
    val drwtNo6: Int,
    val bnusNo: Int,  //보너스
    val firstAccumamnt: Long, //?
    val returnValue: String
)
