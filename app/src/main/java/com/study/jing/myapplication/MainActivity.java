package com.study.jing.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(this);
    }
    int count = 0;

    @Override
    public void onClick(View v) {
        ShowToast.showToast(this, String.valueOf(count++));
//        Toast.makeText(this,"nihao",Toast.LENGTH_SHORT).show();
        LogUtils.Log("haoba"+count);
    }
}
