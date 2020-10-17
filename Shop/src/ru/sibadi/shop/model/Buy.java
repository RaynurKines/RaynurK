package ru.sibadi.shop.model;

public class Buy {
    private final Customer customer;
    private final Product product;

    public Buy(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
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
                " by price " + product.getPrice();
    }
}
