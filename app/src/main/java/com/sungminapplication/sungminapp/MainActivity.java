package com.sungminapplication.sungminapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView sm;

    public int aa;
    private int ss;
    static int dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sm = (TextView) findViewById(R.id.tv1);
        sm.setText("나는 김성민이다");

        aaa();
        finish();
    }

    public void  aaa(){
        sm.setText("나는 김성민이다.2");
    }

    public void aaa(int v){

    }
}
