package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code her
        System.out.println("Hello java-til");
        System.out.println("Hello Variables");
        // 고정 소수점 방식은 부동 소수점 방식보다 정확한 값을 표현할 수 있지만 큰수를 표현하려면 더 많은 bit 를 사용해서 표현해야한다.

        //부동 소수점 방식은 근사값으로 저장
        float numFloat = 32.12345678F;
        // numFloat 변수에 실제 저장된 값 : 3.2123455047607421875E1
        System.out.println(numFloat);
        double numDouble = 32.12345678;
        // numDouble 변수에 실제 저장된 값 : 3.212345567799999979342828737572E1
        System.out.println(numDouble);

        System.out.println("Hello Constant");
        int num = 100;
        System.out.println(num);
        // 심볼릭 상수
        final int num1 = 21;
        System.out.println(num1);
        // float 작은 범위의 실수
        final float num2 = 21.1234F;
        System.out.println(num2);
        // double 더 많은 표현 범위의 실수
        final double num3 = 21.1234;
        System.out.println(num3);
        final long num4= 210000000000L;
        System.out.println(num4);

        // 형 변환
        byte byteNum = 32;
        short shortNum = byteNum;
        System.out.println(shortNum);

        int intNum = 26;
        double doubleNum = intNum;
        System.out.println(doubleNum);

        // 명시적 형변환
        double doubleNum2 = 32.123456781234;
        float floatNum = (float)doubleNum2;
        System.out.println(floatNum);
    }
}
