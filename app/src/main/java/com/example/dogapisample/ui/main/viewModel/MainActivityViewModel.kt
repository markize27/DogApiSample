package com.example.dogapisample.ui.main.viewModel

import com.example.dogapisample.data.repository.DogApiSampleRepositoryImpl
import com.example.dogapisample.ui.base.viewModel.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val repositoryImpl: DogApiSampleRepositoryImpl
) : BaseViewModel() {



}