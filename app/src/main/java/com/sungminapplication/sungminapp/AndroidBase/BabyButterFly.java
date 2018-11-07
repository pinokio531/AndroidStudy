package com.sungminapplication.sungminapp.AndroidBase;

public class BabyButterFly extends ButterFly { //상속 받음

    private int exWingSize2 = 60;

    @Override
    public int WingSize() { //날개 오버라이딩
        return exWingSize2;
    }
}
