package ru.sibadi.shop;

import ru.sibadi.shop.model.Customer;
import ru.sibadi.shop.model.Product;
import ru.sibadi.shop.model.Sale;
import ru.sibadi.shop.model.Shop;

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


        System.out.println(shop.createBuy(danil, shop.getProducts().get(0)));
        shop.setSale(Sale.BLACK_FRIDAY);
        System.out.println(shop.createBuy(tatyana, shop.getProducts().get(2)));
    }
}
