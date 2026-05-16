package com.equalexperts.cart.service;

import com.equalexperts.cart.client.PriceApi;
import com.equalexperts.cart.model.CartItem;
import com.equalexperts.cart.model.Product;
import com.equalexperts.cart.util.RoundingUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, CartItem> items = new HashMap<>();
    private final PriceApi priceApi;

    public ShoppingCart(PriceApi priceApi) {
        this.priceApi = priceApi;
    }

    public void addProduct(String name, int quantity) {
        double price = priceApi.getPrice(name);
        Product product = new Product(name, price);

        if (items.containsKey(name)) {
            items.get(name).increaseQuantity(quantity);
        } else {
            items.put(name, new CartItem(product, quantity));
        }
    }

    public double getSubtotal() {
        double subtotal = items.values()
                .stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();
        return RoundingUtil.round(subtotal);
    }

    public double getTax() {
        return RoundingUtil.round(getSubtotal() * 0.125);
    }

    public double getTotal() {
        return RoundingUtil.round(getSubtotal() + getTax());
    }

    public Map<String, CartItem> getItems() {
        return items;
    }
}
