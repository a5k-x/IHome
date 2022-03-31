package com.a5k.ihome.view.main

import com.a5k.ihome.data.AppState

interface IView {
    fun renderData(appState: AppState)
    fun initButtomNavigations()

    fun singInFragment()
    fun singOutFragment()
}