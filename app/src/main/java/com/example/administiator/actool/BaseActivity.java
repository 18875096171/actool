package com.example.administiator.actool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * author: Administiator
 * date:2019/1/8
 * descriptin:让类继承baseactivity则在 重写oncreat会打印处在activity
 * 目的：清楚明了运行的哪一个ctivity，便于代码维护
 */
public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Log.i(TAG,getClass().getName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.reMoveActivity(this);
    }
}
