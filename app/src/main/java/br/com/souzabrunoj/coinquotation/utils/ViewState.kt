package br.com.souzabrunoj.coinquotation.utils

import br.com.souzabrunoj.coinquotation.utils.Status.*

data class ViewState<D>(val status: Status, val data: D? = null, val throwable: Throwable? = null, val showLoading: Boolean = true) {
    companion object {

        fun <D> success(data: D? = null) = ViewState(status = SUCCESS, data = data)

        fun <D> error(throwable: Throwable) = ViewState<D>(status = ERROR, throwable = throwable)

        fun <D> loading(showLoading: Boolean) = ViewState<D>(status = LOADING, showLoading = showLoading)

        fun <D> initializing() = ViewState<D>(status = NEUTRAL)
    }
}

enum class Status { SUCCESS, ERROR, LOADING, NEUTRAL }
