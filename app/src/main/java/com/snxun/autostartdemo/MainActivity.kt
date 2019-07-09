package com.snxun.autostartdemo

import com.lodz.android.corekt.anko.toastShort
import com.lodz.android.corekt.log.PrintLog
import com.lodz.android.pandora.base.activity.AbsActivity

class MainActivity : AbsActivity() {


    override fun getAbsLayoutId(): Int = R.layout.activity_main

    override fun initData() {
        super.initData()
        // 华为手机需要在设置->电池->启动管理里面打开该APP的自启动开关
        toastShort("开机启动")
        PrintLog.e("testtag", "开机启动")
    }
}
