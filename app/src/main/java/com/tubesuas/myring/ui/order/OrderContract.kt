package com.tubesuas.myring.ui.order

import com.tubesuas.myring.base.BasePresenter
import com.tubesuas.myring.base.BaseView
import com.tubesuas.myring.model.response.transaction.TransactionResponse

interface OrderContract {

    interface View: BaseView {
        fun onTransactionSuccess(transactionResponse: TransactionResponse)
        fun onTransactionFailed(message:String)

    }

    interface Presenter : OrderContract, BasePresenter {
        fun getTransaction()
    }
}