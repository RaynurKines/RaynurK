package ru.sibadi.shop;

import ru.sibadi.shop.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Shop shop = null;
        if(new File("Products.txt").exists() && new File("Customers.txt").exists()){
            System.out.println("File is exists");
            //чтение из файла
            Reader readerProducts = new FileReader("Products.txt");
            BufferedReader bufferedReader = new BufferedReader(readerProducts);
            List<Product> products = new ArrayList<>();
            while(true){
                String line = bufferedReader.readLine();
                if(line == null)
                    break;
                String[] splitedLine = line.split(" ");
                Product product = new Product(splitedLine[0], Double.parseDouble(splitedLine[1]));
                products.add(product);
            }
            Reader readerCustomers = new FileReader("Customers.txt");
            BufferedReader bufferedReaderCustomers = new BufferedReader(readerCustomers);
            List<Customer> customers = new ArrayList<>();
            while(true){
                String line = bufferedReaderCustomers.readLine();
                if(line == null)
                    break;
                String[] splitedLineToCustomers = line.split(" ");
                Customer customer = new Customer(splitedLineToCustomers[0], Double.parseDouble(splitedLineToCustomers[1]));
                customers.add(customer);
            }
            shop = new Shop(products, customers);
        }
        else {
            shop = new Shop();
        }

        for (Product product : shop.getProducts()) {
            System.out.println(product);
        }

        System.out.println(shop.getCustomers().get(0));
        System.out.println(shop.getCustomers().get(1));


        buy(shop.getCustomers().get(0), shop.getProducts().get(0), shop);
        buy(shop.getCustomers().get(1), shop.getProducts().get(2), shop);
        buy(shop.getCustomers().get(1), shop.getProducts().get(1), shop);
        buy(shop.getCustomers().get(1), shop.getProducts().get(1), shop);
        buy(shop.getCustomers().get(1), shop.getProducts().get(1), shop);
        shop.setSale(Sale.BLACK_FRIDAY);
        buy(shop.getCustomers().get(1), shop.getProducts().get(1), shop);
        shop.setSale(Sale.WITHOUT);
        buy(shop.getCustomers().get(1), shop.getProducts().get(1), shop);
        buy(shop.getCustomers().get(1), shop.getProducts().get(1), shop);

        watchPurchases(shop);
        shop.writeInTxtProducts();
        shop.writeInTxtPurchases();
        shop.writeInTxtCustomers();
    }

    private static void buy(Customer c, Product p, Shop shop) {
        System.out.println(shop.createBuy(c, p) + ". Remainder " + c.getMoney());
    }

    public static void watchPurchases(Shop shop) {
        System.out.println("\nPurchases:");
        for (Buy buy : shop.getPurchases()) {
            System.out.println(buy);
        }
    }
}