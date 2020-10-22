package com.julive.wanandroid.baselibs.base

import android.view.View
import com.julive.wanandroid.baselibs.ext.showToast
import com.julive.wanandroid.mvp.IPresenter
import com.julive.wanandroid.mvp.IView

/**
 * @author chenxz
 * @date 2018/11/19
 * @desc BaseMvpFragment
 */
abstract class BaseMvpFragment<in V : IView, P : IPresenter<V>> : BaseFragment(), IView {

    /**
     * Presenter
     */
    protected var mPresenter: P? = null

    protected abstract fun createPresenter(): P

    override fun initView(view: View) {
        mPresenter = createPresenter()
        mPresenter?.attachView(this as V)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter?.detachView()
        this.mPresenter = null
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun showError(errorMsg: String) {
        showToast(errorMsg)
    }

    override fun showDefaultMsg(msg: String) {
        showToast(msg)
    }

    override fun showMsg(msg: String) {
        showToast(msg)
    }

}