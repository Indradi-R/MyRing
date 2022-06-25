package com.tubesuas.myring.ui.order.detailsorders

import com.tubesuas.myring.base.BasePresenter
import com.tubesuas.myring.base.BaseView

interface OrdersDetailContract {
    interface View : BaseView {
        fun onUpdateTransactionSuccess(message: String)
        fun onUpdateTransactionFailed(message: String)
    }

    interface Presenter : OrdersDetailContract, BasePresenter {
        fun getUpdateTransaction(id:String, status:String)
    }
}