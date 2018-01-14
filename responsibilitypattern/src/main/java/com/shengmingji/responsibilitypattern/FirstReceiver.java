package com.shengmingji.responsibilitypattern;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by dell on 2018/1/14.
 */

public class FirstReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //获取Intent中附加的限制值
        int limit = intent.getIntExtra("limit", -1001);
        //如果限制值等于1000则处理，否则继续转发给下一个Receiver
        if (limit!=1000) {
            Bundle bundle = new Bundle();
            bundle.putString("new","Message from FirstReceiver");
            setResultExtras(bundle);
        }else {
            String msg = intent.getStringExtra("msg");
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
