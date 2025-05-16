package com.$02Interface;

/*
            StarUnit
                |
    Marine     Scv      Zealot

*/ 
/*
 * [객체지향의 3대속성]
 * 1) 캡슐화 (Encapsulation)
 * 2) 상속성 (Inheritance)
 * 3) 다형성 (polymorphism)
 */

/*
  * 새로운 Hydra 클래스는 StarUnit을 상속시킴으로써
    기존의 관리시스템(StarUnit배열)에 합류가 가능하고
    기존 Unit을 위해 만들어놓은 메서드를 바로 사용할 수 있다.
    => 코드 양이 줄어든다.
  */
public class StarMain {

    public static void allUnitWalk(StarUnit[] units){
        for (StarUnit unit : units) {
            unit.walk();
        }
    }
    
    public static void allUnitAttack(StarUnit[] units){
        for (StarUnit unit : units) {
            unit.attack();
        }
    }
    
    public static void allUnitDie(StarUnit[] units){
        for (StarUnit unit : units) {
            unit.die();
        }
    }

    public static void main(String[] args) {
        StarUnit[] units = new StarUnit[]{
            new Marine(),
            new Scv(),
            new Zealot(),
            new Hydra()
        };
    
    
        allUnitWalk(units);
        System.out.println("-------------------------");
        allUnitAttack(units);
        System.out.println("-------------------------");
        allUnitDie(units);
    }
}
