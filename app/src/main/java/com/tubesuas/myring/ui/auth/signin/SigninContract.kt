package com.tubesuas.myring.ui.auth.signin

import com.tubesuas.myring.base.BasePresenter
import com.tubesuas.myring.base.BaseView
import com.tubesuas.myring.model.response.login.LoginResponse

interface SigninContract {

    interface View: BaseView {
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailed(message:String)

    }

    interface Presenter : SigninContract, BasePresenter {
        fun subimtLogin(email:String, password:String)
    }
}