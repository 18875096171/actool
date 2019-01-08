package com.example.administiator.actool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * author: SunGuiLan
 * date:2019/1/8
 * descriptin:根据界面判断处于activty;退出app功能(不用层层退出activity)
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
