package com.xiaomei.launch;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.xiaomei.BaseActiviy;
import com.xiaomei.R;
import com.xiaomei.launch.control.LaunchControl;

public class LaunchActivity extends BaseActiviy<LaunchControl> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

}
