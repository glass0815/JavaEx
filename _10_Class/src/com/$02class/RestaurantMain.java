package com.$02class;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        // 클래스도 자료형
        // 클래스를 사용하려면 변수를 선언해야 한다.
        // 클래스의 변수 == 객체(변수) 
        // 클래스를 객체로 생성한 것 == 인스터스화 했다. (= 메모리에 올렸다.)
        // 클래스는 Heap 메모리에 실체가 올라간다.
        // Stack 변수에는 Hashcode값이 저장된다.
        Restraurant rest = new Restraurant();

        Scanner sc = new Scanner(System.in);

        rest.sc = sc;
        rest.name = "새마을 식당";
        rest.food1 = new String[]{"열탄불고기", "한돈생삼겹살", "한돈수제양념구이", "제주생소세지"};
        rest.viewMenu();
        rest.selectFood();
        rest.deliveryFood();

        rest.closeRestaurant();
    }
}
