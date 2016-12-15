package com.example.yangr.brdadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by yangr on 2016/12/13.
 */

public class MyBroadReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String data = intent.getStringExtra("data");
        Toast.makeText(context, data ,Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
