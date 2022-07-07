package com.iot.a20220707_applicationclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        String id = ((MyApp)getApplication()).getId();
        ((TextView)findViewById(R.id.textView1)).setText(id);
        String pw = ((MyApp)getApplication()).getPW();
        ((TextView)findViewById(R.id.textView2)).setText(pw);
    }
}