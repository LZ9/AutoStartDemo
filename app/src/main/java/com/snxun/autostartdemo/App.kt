package com.snxun.autostartdemo

import com.lodz.android.corekt.log.PrintLog
import com.lodz.android.pandora.base.application.BaseApplication

/**
 *
 * @author zhouL
 * @date 2019/7/9
 */
class App :BaseApplication(){

    override fun onStartCreate() {
        PrintLog.setPrint(true)
    }

    override fun onExit() {


    }
}