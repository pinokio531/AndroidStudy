package com.sungminapplication.sungminapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MakeLayout extends AppCompatActivity {

    TextView sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sm = (TextView) findViewById(R.id.tv1);
        sm.setText("나는 김성민이다");
        MakeLayout makeLayout = new MakeLayout();

    }

    private void setValue(){
        String strValue = sm.getText().toString();
        Integer integer = Integer.parseInt(strValue);
        int numInt = integer;

        //string 가져오기
        String strValue2 = getResources().getString(R.string.app_name);

        //색 적용하기
        int color = R.color.colorAccent;
        sm.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        sm.setBackgroundColor(getResources().getColor(color));
        sm.setBackgroundColor(Color.BLUE);
        sm.setBackgroundColor(Color.parseColor("#FFFFFF"));

        //dp 적용하기
        int normalDimen = R.dimen.normal;
        int a = R.dimen.normal;
        int makeDimen = (int) getResources().getDisplayMetrics().density * 16;


    }
    public static void asdf(){

    }

    public void aaa(){
        String a;
    }

}
