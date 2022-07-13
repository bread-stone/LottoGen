package com.breadstone.lottogen.presentation.winnum

import com.breadstone.core.BaseViewModel
import com.breadstone.lottogen.domain.number.usecase.WinNumberUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WinNumberViewModel @Inject constructor(
    private val winNumberUseCase: WinNumberUseCase
): BaseViewModel() {

}