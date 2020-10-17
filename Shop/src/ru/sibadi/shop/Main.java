package ru.sibadi.shop;
import ru.sibadi.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bread", 25));
        products.add(new Product("Butter", 40));
        products.add(new Product("Milk", 70));
        for (Product product: products) {
            System.out.println(product);
        }
    }
}
