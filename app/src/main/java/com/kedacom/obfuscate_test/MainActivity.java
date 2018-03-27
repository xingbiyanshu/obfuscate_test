package com.kedacom.obfuscate_test;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PcTrace.p("obfuscate test!");
        setContentView(R.layout.activity_main);
    }
}
