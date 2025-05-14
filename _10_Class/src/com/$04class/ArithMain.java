package com.$04class;

public class ArithMain {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int result = 0;

        Arith arith = new Arith();

        result = arith.add(a,b);
        System.out.println("두 수의 합은 "+ result +"입니다.");
        result = arith.sub(a,b);
        System.out.println("두 수의 차는 "+ result +"입니다.");
        result = arith.mul(a,b);
        System.out.println("두 수의 곱은 "+ result +"입니다.");
        result = arith.div(a,b);
        System.out.println("두 수의 나눗셈은 "+ result +"입니다.");
    }
}
