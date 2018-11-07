package com.sungminapplication.sungminapp.AndroidBase;

public class ButterFly implements Insect, BeautifulWing{ //다중 interface 가능

    public int exWingSize = 30;

    @Override
    public void Head() { //오버라이딩으로 재정의 interface 내 추상클래스 완성
        System.out.println("나비 머리 입니다.");
    }

    @Override
    public void Thorax() {
        System.out.println("나비 가슴 입니다.");

    }

    @Override
    public void Abdomen() {
        System.out.println("나비 배 입니다.");

    }

    @Override
    public int WingSize() {
        return exWingSize;
    }
}
