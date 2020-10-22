package com.julive.wanandroid.rx.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by chenxz on 2018/4/21.
 */
class SingleMainScheduler<T> private constructor() :
    BaseScheduler<T>(Schedulers.single(), AndroidSchedulers.mainThread())
