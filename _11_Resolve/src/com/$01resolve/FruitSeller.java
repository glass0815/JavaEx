package com.$01resolve;

public class FruitSeller {
    private int numOfApple;         // 사과개수
    private int saleMoney;          // 판매금액
    final int APPLE_PRICE = 1000;   // 사과가격(상수)

    public FruitSeller(int numOfApple){
        this.numOfApple = numOfApple;
    }
    public void saleApple(FruitBuyer buyer, int numOfApple){
        int totalPrice = numOfApple * APPLE_PRICE;
        int money = buyer.buyApple(numOfApple, totalPrice);
        this.numOfApple -= numOfApple;
        saleMoney += money;
    }
    public void showSaleResult(){
        System.out.println("*** 과일 판매자의 현재 상황***");
        System.out.println("남은 사과 : " + numOfApple);
        System.out.println("판매 수익 : " + saleMoney);
    }

}
