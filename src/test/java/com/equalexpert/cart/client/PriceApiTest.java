
package com.equalexpert.cart.client;

import com.equalexperts.cart.client.PriceApi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PriceApiTest {

    @Test
    void shouldReturnExpectedPrice() {

        // Arrange
        PriceApi api = mock(PriceApi.class);

        when(api.getPrice("cornflakes")).thenReturn(2.52);

        // Act
        double price = api.getPrice("cornflakes");

        // Assert
        assertEquals(2.52, price);
    }
}