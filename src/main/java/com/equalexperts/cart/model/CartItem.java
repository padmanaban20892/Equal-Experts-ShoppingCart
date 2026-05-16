package com.equalexperts.cart.model;

public class CartItem {
    private final Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void increaseQuantity(int qty) {
        this.quantity += qty;
    }

    public double getTotalPrice() {
        return product.price() * quantity;
    }

    public String getName() {
        return product.name();
    }

    public int getQuantity() {
        return quantity;
    }
}