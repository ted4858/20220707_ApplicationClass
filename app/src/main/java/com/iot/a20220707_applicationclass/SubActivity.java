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
        ((TextView)findViewById(R.id.textView)).setText(id);
    }
}