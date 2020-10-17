package ru.sibadi.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Product> products = new ArrayList<>();
    private final List<Buy> purchases = new ArrayList<>();
    private Sale sale = Sale.WITHOUT;

    public Shop() {
        products.add(new Product("Bread", 25));
        products.add(new Product("Butter", 40));
        products.add(new Product("Milk", 70));
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Buy> getPurchases() {
        return purchases;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Buy createBuy(Customer c, Product p) {
        Buy buy = new Buy(c, p, sale);
        purchases.add(buy);
        return buy;
    }

}
