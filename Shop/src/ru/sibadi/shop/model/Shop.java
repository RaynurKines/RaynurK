package ru.sibadi.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Product> products = new ArrayList<>();

    public Shop() {
        products.add(new Product("Bread", 25));
        products.add(new Product("Butter", 40));
        products.add(new Product("Milk", 70));
    }

    public List<Product> getProducts() {
        return products;
    }
}
