package com.$02Interface;

/*
    인터페이스 == 모든 메서드가 추상메서드인 추상클래스
    => 즉, 구현부는 없이 선언부만 존재하는 것.

    상속을 전제로 한다.
    자식 클래스르 ㄹ묶어서 관리하는 유용성이 있다.(코드 양을 줄여준다.)

*/ 
// 위와 아래는 동일한 의미의 코드.
// public abstract class StarUnit {
//     public abstract void walk();
//     public abstract void attack();
//     public abstract void die();
// }

public interface StarUnit {
    public void walk();
    public void attack();
    public void die();
}


