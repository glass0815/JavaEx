package com.$01Interface;

/* 
 * 구현/추상 클래스는 상속시 extends 키워드 사용
 * 인터페이스는 implements 사용
 * 
*/
public class Marine implements StarUnit {

    @Override
    public void walk() {
        System.out.println("아장아장장");
    }

    @Override
    public void attack() {
        System.out.println("두두두두");
    }
    
    @Override
    public void die() {
        System.out.println("으악");
    }

}
