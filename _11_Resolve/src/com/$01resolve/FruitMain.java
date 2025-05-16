package com.$01resolve;


public class FruitMain {
    public static void main(String[] args) {
        FruitSeller seller = new FruitSeller(20);
        FruitBuyer buyer = new FruitBuyer(10000);

        seller.showSaleResult();
        buyer.showBuyResult();

        seller.saleApple(buyer, 3);

        seller.showSaleResult();
        buyer.showBuyResult();
    }
}
