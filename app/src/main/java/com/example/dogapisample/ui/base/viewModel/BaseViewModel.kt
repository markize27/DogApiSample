package com.example.dogapisample.ui.base.viewModel

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.Disposable

open class BaseViewModel : ViewModel() {

    var disposable: Disposable = Disposable.empty()

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}