package ru.sibadi.shop.model;

public class Buy {
    private final Customer customer;
    private final Product product;
    private final Sale sale;
    Buy(Customer customer, Product product, Sale sale) {
        this.customer = customer;
        this.product = product;
        this.sale = sale;
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
