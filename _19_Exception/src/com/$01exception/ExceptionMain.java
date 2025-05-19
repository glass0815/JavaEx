package com.$01exception;

public class ExceptionMain {
    public static void printLength(String data){
        int len = data.length();
        System.out.println("문자열의 길이는 " + len);
    }
    public static void main(String[] args) {
        printLength("Albert");
        try {
            printLength(null);          // 예외 exception
            
        } catch (Exception e) {
            System.out.println();
        }
    }
}
