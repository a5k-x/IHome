package com.a5k.ihome.presenter


import com.a5k.ihome.data.AppState
import com.a5k.ihome.view.main.IView

class MainPresenter<T : AppState, V : IView>:IPresenter<T,V> {

    private var currentView: V? = null

    override fun attachView(view: V) {
        if (view != currentView) {
            currentView = view
        }
}

    override fun detachView(view: V) {
        if (view == currentView) {
            currentView = null
        }
    }

    override fun getData() {

    }
}