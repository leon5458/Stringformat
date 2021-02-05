package com.hly.stringformat;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);
        // %s string
        String str =String.format(getString(R.string.year_time),"10","4","50");
        textView.setText(str);
        // %d int
        String str2 =String.format(getString(R.string.old_time),20);
        textView2.setText(str2);
        // %s string and  %d int
        String str3 =String.format(getString(R.string.xiang_time),"秋香",20);
        textView3.setText(str3);


    }
}
