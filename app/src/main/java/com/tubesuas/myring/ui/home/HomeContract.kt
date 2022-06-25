package com.tubesuas.myring.ui.home

import com.tubesuas.myring.base.BasePresenter
import com.tubesuas.myring.base.BaseView
import com.tubesuas.myring.model.response.home.HomeResponse

interface HomeContract {

    interface View: BaseView {
        fun onHomeSuccess(homeResponse: HomeResponse)
        fun onHomeFailed(message:String)

    }

    interface Presenter : HomeContract, BasePresenter {
        fun getHome()
    }
}