package com.a5k.ihome.presenter

import com.a5k.ihome.data.AppState
import com.a5k.ihome.view.main.IView


interface IPresenter<T : AppState, V : IView>  {

    fun attachView(view: V)
    fun detachView(view: V)

    fun getData()

}