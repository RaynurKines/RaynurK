package ru.sibadi.shop;
import ru.sibadi.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bread", 25));
        products.add(new Product("Butter", 40));
        System.out.println(products.get(0).getName() + " : " + products.get(0).getPrice());
        System.out.println(products.get(1).getName() + " : " + products.get(1).getPrice());
    }
}
