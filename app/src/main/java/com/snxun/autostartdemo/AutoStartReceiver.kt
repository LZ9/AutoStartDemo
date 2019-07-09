package com.snxun.autostartdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * 自启动广播接收器
 * @author zhouL
 * @date 2019/7/9
 */
class AutoStartReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action
        if (action.isNullOrEmpty() || context == null) {
            return
        }
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            val starter = Intent()
            starter.setClass(context, MainActivity::class.java)
            starter.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(starter)
        }
    }
}