package com.shengmingji.responsibilitypattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroad(View view) {
        Intent intent = new Intent();
        intent.setAction("ORDER_BROADCAST");
        intent.putExtra("limit",100);
        intent.putExtra("msg","Message from MainActivity");
        sendOrderedBroadcast(intent,null);
    }
}
