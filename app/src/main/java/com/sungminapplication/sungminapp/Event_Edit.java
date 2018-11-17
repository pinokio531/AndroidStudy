package com.sungminapplication.sungminapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Event_Edit extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inu_club_event_edit);

        Button submitBtn = findViewById(R.id.btn_submit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Event_Edit.this, "submit 버튼 입니다.", Toast.LENGTH_SHORT).show();
                Log.d("이벤트 수정 화면", "submit 버튼이 눌렸습니다.");
            }
        });

    }
}
