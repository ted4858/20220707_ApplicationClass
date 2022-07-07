package com.iot.a20220707_applicationclass;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText login_id;
    private EditText login_pw;
    private String PassWord = "12345678";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_id = (EditText)findViewById(R.id.login_id);
        login_pw = (EditText)findViewById(R.id.login_pw);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = login_id.getText().toString();
                String pw = login_pw.getText().toString();

                //if(pw == PassWord){
                    Application app = getApplication();
                    MyApp myApp = (MyApp)app;
                    myApp.setId(id);
                    myApp.setPW(pw);

                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    startActivity(intent);
                /*}else{
                    ((TextView)findViewById(R.id.textView)).setText("Password Error");
                }*/
            }
        });
    }
}