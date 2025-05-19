package com.$03Lambda;

@FunctionalInterface
// 인터페이스는 접근제어자가 생략되어있으면 public. (default : public)
interface Calculator{
    int sum(int a, int b); // 하나 있을때만 아래처럼 람다식으로 사용 가능하다.
    // int mul(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        // 람다식으로 익명객체 생성
        Calculator mc = (int a, int b) -> a+b; 
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
