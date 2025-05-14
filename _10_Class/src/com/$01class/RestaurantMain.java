package com.$01class;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        
        Restraurant rest = new Restraurant();

        Scanner sc = new Scanner(System.in);

        rest.sc = sc;
        rest.name = "새마을 식당";
        rest.viewMenu();
        rest.selectFood();
        rest.deliveryFood();

        rest.closeRestaurant();
    }
}
