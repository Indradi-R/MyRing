package com.tubesuas.myring.ui.detail

import com.tubesuas.myring.base.BasePresenter
import com.tubesuas.myring.base.BaseView
import com.tubesuas.myring.model.response.checkout.CheckoutResponse

interface PaymentContract {

    interface View: BaseView {
        fun onCheckoutSuccess(checkoutResponse: CheckoutResponse, view: android.view.View)
        fun onCheckoutFailed(message:String)

    }

    interface Presenter : PaymentContract, BasePresenter {
        fun getCheckout(foodId:String, userId:String, quantity:String, total:String, view: android.view.View)
    }
}