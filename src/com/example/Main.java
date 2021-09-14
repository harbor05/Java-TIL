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
    }
}
