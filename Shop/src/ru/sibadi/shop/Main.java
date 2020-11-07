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
        Customer tatyana = new Customer("Tatyana", 300);
        System.out.println(danil);
        System.out.println(tatyana);


        buy(danil, shop.getProducts().get(0), shop);
        buy(tatyana, shop.getProducts().get(2), shop);
        buy(tatyana, shop.getProducts().get(1), shop);
        buy(tatyana, shop.getProducts().get(1), shop);
        buy(tatyana, shop.getProducts().get(1), shop);
        shop.setSale(Sale.BLACK_FRIDAY);
        buy(tatyana, shop.getProducts().get(1), shop);
        shop.setSale(Sale.WITHOUT);
        buy(tatyana, shop.getProducts().get(1), shop);
        buy(danil, shop.getProducts().get(1), shop);

        shop.watchPurchases();
    }

    private static void buy(Customer c, Product p, Shop shop) {
        System.out.println(shop.createBuy(c, p) + ". Remainder " + c.getMoney());
    }
}