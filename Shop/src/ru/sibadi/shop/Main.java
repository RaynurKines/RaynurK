package ru.sibadi.shop;

import ru.sibadi.shop.model.Product;
import ru.sibadi.shop.model.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        for (Product product : shop.getProducts()) {
            System.out.println(product);
        }
    }
}
