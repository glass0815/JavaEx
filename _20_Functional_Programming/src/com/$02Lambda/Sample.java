package com.$02Lambda;

// 인터페이스는 접근제어자가 생략되어있으면 public. (default : public)
interface Calculator{
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        // 람다식으로 익명객체 생성
        Calculator mc = (int a, int b) -> a+b; 
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
