package com.sungminapplication.sungminapp.MakeButton;

import android.view.View;
import android.widget.Toast;

public class MyButtonListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "커스텀 리스너", Toast.LENGTH_SHORT).show();
    }
}
