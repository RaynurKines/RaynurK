package ru.sibadi.shop;

import ru.sibadi.shop.model.Buy;
import ru.sibadi.shop.model.Customer;
import ru.sibadi.shop.model.Product;
import ru.sibadi.shop.model.Shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        for (Product product : shop.getProducts()) {
            System.out.println(product);
        }

        Customer danil = new Customer("Danil", 150);
        Customer tatyana = new Customer("Tatyana", 100);
        System.out.println(danil);
        System.out.println(tatyana);

        List<Buy> purchases = new ArrayList<>();
        purchases.add(new Buy(danil, shop.getProducts().get(0)));
        purchases.add(new Buy(tatyana, shop.getProducts().get(2)));
        for (Buy buy: purchases) {
            System.out.println(buy);
        }
    }
}
