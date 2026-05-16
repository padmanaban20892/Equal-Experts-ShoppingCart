package com.equalexperts.cart.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class PriceApi {

    private static final String BASE_URL =
            "https://equalexperts.github.io/backend-take-home-test-data/";

    public double getPrice(String productName) {
        try {
            String urlStr = BASE_URL + productName.toLowerCase() + ".json";
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());
            return json.getDouble("price");

        } catch (Exception e) {
            throw new RuntimeException("Error fetching price for " + productName, e);
        }
    }
}
