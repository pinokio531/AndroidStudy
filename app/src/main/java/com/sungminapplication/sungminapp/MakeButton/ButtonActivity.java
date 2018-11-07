package com.sungminapplication.sungminapp.MakeButton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sungminapplication.sungminapp.R;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_activity);

        ComponentInitialize();
        setBt1();
        setBt2();
        setBt3();
        setBt4();
    }

    public void ComponentInitialize(){
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
    }

    public void setBt1(){ //익명클래스로 만들기
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "익명클래스, 콜백메소드로 구현", Toast.LENGTH_SHORT).show();
                Toast.makeText(ButtonActivity.this, "익명클래스, 콜백메소드로 구현", Toast.LENGTH_SHORT).show();
                Toast.makeText(v.getContext(), "익명클래스, 콜백메소드로 구현", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setBt2(){ //imterface로 만들기
        bt2.setOnClickListener(this);
    }

    public void setBt3(){ //따로 클래스 만들어서 만들기
        MyButtonListener mbl = new MyButtonListener();
        bt3.setOnClickListener(mbl);
        bt3.setOnClickListener(new MyButtonListener());
    }

    public void setBt4(){ //즉석에서 리스너 정의해서 만들기, 사실은 bt3와 같은 것임
        Button.OnClickListener lis = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "클래스 없이 만들기", Toast.LENGTH_SHORT).show();
            }
        };

        bt4.setOnClickListener(lis);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(ButtonActivity.this, "인터페이스로 구현", Toast.LENGTH_SHORT).show();
    }
}
