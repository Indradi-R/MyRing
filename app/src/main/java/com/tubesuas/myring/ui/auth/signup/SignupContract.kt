package com.tubesuas.myring.ui.auth.signup

import android.net.Uri
import com.tubesuas.myring.base.BasePresenter
import com.tubesuas.myring.base.BaseView
import com.tubesuas.myring.model.request.RegisterRequest
import com.tubesuas.myring.model.response.login.LoginResponse

interface SignupContract {

    interface View: BaseView {
        fun onRegisterSuccess(loginResponse: LoginResponse, view:android.view.View)
        fun onRegisterPhotoSuccess(view:android.view.View)
        fun onRegisterFailed(message:String)

    }

    interface Presenter : SignupContract, BasePresenter {
        fun submitRegister(registerRequest: RegisterRequest, view:android.view.View)
        fun submitPhotoRegister(filePath:Uri, view:android.view.View)
    }
}