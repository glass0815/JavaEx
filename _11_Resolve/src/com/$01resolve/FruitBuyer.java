package com.$01resolve;

public class FruitBuyer {
    private int money;
    private int numOfApple;

    public FruitBuyer(int money){
        this.money = money;
        this.numOfApple = 0;
    }
    public int buyApple(int nunOfApple, int totalPrice){
        this.numOfApple += nunOfApple;
        this.money -= totalPrice;
        return totalPrice;
    }
    public void showBuyResult(){
        System.out.println("*** 과일 구매자의 현재 상황***");
        System.out.println("현재 잔액 : " + money);
        System.out.println("사과 개수 : " + numOfApple);
    }
}
