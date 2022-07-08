package com.breadstone.lottogen.domain.number.entity

data class WinNumber(
    val drwNo: Int = 0,   //회차
    val drwNoDate: String = "", //추첨일
    val totSellamnt: Long = 0L,  //총 상금
    val firstWinamnt: Int = 0,  //1등 상금
    val firstPrzwnerCo: Int = 0,  //1등 숫자
    val drwtNo1: Int = 0,
    val drwtNo2: Int = 0,
    val drwtNo3: Int = 0,
    val drwtNo4: Int = 0,
    val drwtNo5: Int = 0,
    val drwtNo6: Int = 0,
    val bnusNo: Int = 0,  //보너스
    val firstAccumamnt: Long = 0, //?
    val returnValue: String = "fail"
)
