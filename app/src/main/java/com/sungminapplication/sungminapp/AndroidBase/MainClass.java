package com.sungminapplication.sungminapp.AndroidBase;

public class MainClass {

    public static void main(String args[]){ //main 함수 실행


        exButterFly();
        exStaticValue();
        calculate(2,3);
        calculate(2,3,4);

    }

    static void exButterFly(){ //오버라이딩, public, private 예제
        ButterFly bf = new ButterFly();
        bf.Head();
        bf.Thorax();
        bf.Abdomen();
        System.out.println("일반 나비의 날개 사이즈는 " + bf.WingSize() + " 입니다."); //오버라이딩의 결과

        bf.exWingSize = 40; //public 값 변경
        System.out.println("일반 나비의 날개 사이즈는 " + bf.WingSize() + " 입니다.");

        BabyButterFly bbf = new BabyButterFly();
        bbf.Head();
        bbf.Thorax();
        bbf.Abdomen();
        System.out.println("이 나비의 날개 사이즈는 " + bbf.WingSize() + " 입니다.");

        //bbf.exWingSize2 = 50; exWingSize2는 private 이기 때문에 정의 못함
    }



    static void exStaticValue(){ //final, static 예제
        System.out.println("static fianl int num1 의 값은 " + StaticValue.num1 + "입니다.");
        //StaticValue.num1 = 30; final 이기 때문에 변경 불가

        System.out.println("static fianl int num2 의 값은 " + StaticValue.num2 + "입니다.");

        StaticValue.num2 = 123456; //변경 가
        System.out.println("static fianl int num2 의 값은 " + StaticValue.num2 + "입니다.");
    }

    //오버로딩 예
    static void calculate(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    static void calculate(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }

}
