package com.breadstone.lottogen.presentation.numlist

import com.breadstone.core.BaseViewModel
import com.breadstone.lottogen.domain.number.usecase.WinNumberUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NumListViewModel @Inject constructor(
    private val winNumberUseCase: WinNumberUseCase
): BaseViewModel() {

}