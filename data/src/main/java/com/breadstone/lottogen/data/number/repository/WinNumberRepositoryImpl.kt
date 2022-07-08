package com.breadstone.lottogen.data.number.repository

import com.breadstone.lottogen.data.number.datasource.local.WinNumberLocalDataSource
import com.breadstone.lottogen.data.number.datasource.remote.WinNumberRemoteDataSource
import com.breadstone.lottogen.domain.number.entity.WinNumber
import com.breadstone.lottogen.domain.number.repository.WinNumberRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject

class WinNumberRepositoryImpl @Inject constructor(
    private val local : WinNumberLocalDataSource,
    private val remote : WinNumberRemoteDataSource
) : WinNumberRepository {

    private val _latestSharedFlow = MutableStateFlow(listOf(WinNumber()))
    private val latestSharedFlow = _latestSharedFlow.asSharedFlow()
    override suspend fun getLatest(): Flow<WinNumber> {
        var latestNo = local.getLatestDrwNo()

        while(true) {
            latestNo++
            remote.getWinNumber(latestNo).run {
                //remote에서 최신 데이터를 확인한다.
                //최신 데이터가 있으면 해당 값을 반환
                //없으면 local상의 최신값을 반환한다.
            }
        }
    }
}