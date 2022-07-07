package com.iot.a20220707_applicationclass;
import android.app.Application;
import android.util.Log;

public class MyApp extends Application {
    private String id = null;
    private String pw = null;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("test", "Application onCreate() called");
    }
    public String getId(){
        return id;
    }
    public String getPW(){
        return pw;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPW(String pw) {
        this.pw = pw;
    }
}
