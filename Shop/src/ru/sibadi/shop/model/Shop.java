package ru.sibadi.shop.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Shop{
    private final List<Product> products;
    private final List<Customer> customers;
    private final List<Buy> purchases = new ArrayList<>();
    private Sale sale = Sale.WITHOUT;

    public Shop() {
        this.products = new ArrayList<>();
        products.add(new Product("Bread", 25));
        products.add(new Product("Butter", 40));
        products.add(new Product("Milk", 70));
        this.customers = new ArrayList<>();
        customers.add(new Customer("Danil", 150));
        customers.add(new Customer("Tanya", 300));
    }
    public Shop(List<Product> products, List<Customer> customers){
        this.products=products;
        this.customers=customers;
    }

    public List<Customer> getCustomers() { return customers; }

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
        if (c.score == 3)
            c.setRegular(true);
        Buy buy = new Buy(c, p, sale);
        purchases.add(buy);
        c.score += 1;
        return buy;
    }



    public void writeInTxtProducts(){

        try(FileWriter writer = new FileWriter("Products.txt")) {
            for (Product product : products) {
                String name = product.getName();
                String price = String.valueOf(product.getPrice());
                writer.write(name + " " + price + System.getProperty("line.separator"));

            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void writeInTxtPurchases() {

        try (FileWriter writer2 = new FileWriter("Purchases.txt")) {
            for (Buy buy : purchases) {
                String customer = buy.getCustomer().getName();
                String product = buy.getProduct().getName();
                String price = String.valueOf(buy.getProduct().getPrice());
                writer2.write(customer + " " + product + " " + price + System.getProperty("line.separator"));
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    public void writeInTxtCustomers() {

        try (FileWriter writer3 = new FileWriter("Customers.txt")) {
            for (Customer customer : customers) {
                String name = customer.getName();
                String money = String.valueOf(customer.getMoney());
                writer3.write(name + " " + money + System.getProperty("line.separator"));

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}