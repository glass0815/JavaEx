package com.$01Lambda;

// 인터페이스는 접근제어자가 생략되어있으면 public. (default : public)
interface Calculator{
    int sum(int a, int b);
}

class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
