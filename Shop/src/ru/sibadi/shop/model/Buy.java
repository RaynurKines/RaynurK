package ru.sibadi.shop.model;

public class Buy {
    private final Customer customer;
    private final Product product;
    private final double finalPrice;

    private static double calcFinalPrice(Customer customer, Product product, Sale sale) {
        double price = product.getPrice();
        if (sale == Sale.BLACK_FRIDAY)
            price = price * 0.8;
        else if (customer.isRegular())
            price = price * 0.9;
        return price;
    }

    Buy(Customer customer, Product product, Sale sale) {
        this.customer = customer;
        this.product = product;

        this.finalPrice = calcFinalPrice(customer, product, sale);

        customer.setMoney(customer.getMoney() - finalPrice);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Customer - " + customer.getName() +
                " buy " + product.getName() +
                " by price " + finalPrice;
    }
}