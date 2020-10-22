package com.julive.wanandroid.rx

import com.julive.wanandroid.rx.scheduler.IoMainScheduler

/**
 * Created by chenxz on 2018/4/21.
 */
object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> = IoMainScheduler()

}