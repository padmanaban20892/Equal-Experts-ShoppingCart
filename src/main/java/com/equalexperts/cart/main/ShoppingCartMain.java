package com.equalexperts.cart.main;

import com.equalexperts.cart.client.PriceApi;
import com.equalexperts.cart.service.ShoppingCart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        PriceApi api = new PriceApi();
        ShoppingCart cart = new ShoppingCart(api);

        cart.addProduct("cornflakes", 2);
        cart.addProduct("weetabix", 1);

        System.out.println("Subtotal: " + cart.getSubtotal());
        System.out.println("Tax: " + cart.getTax());
        System.out.println("Total: " + cart.getTotal());
    }
}