package com.equalexpert.cart.util;

import com.equalexperts.cart.util.RoundingUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoundingUtilTest {

    @Test
    void shouldRoundToTwoDecimalPlaces() {
        double result = RoundingUtil.round(10.1234);
        assertEquals(10.12, result);
    }

    @Test
    void shouldRoundUpCorrectly() {
        double result = RoundingUtil.round(10.126);
        assertEquals(10.13, result);
    }


    @Test
    void shouldHandleExactTwoDecimals() {
        double result = RoundingUtil.round(10.12);
        assertEquals(10.12, result);
    }

    @Test
    void shouldHandleZero() {

        double result = RoundingUtil.round(0.0);
        assertEquals(0.0, result);
    }

    @Test
    void shouldRoundLargeNumbers() {
        double result = RoundingUtil.round(12345.6789);
        assertEquals(12345.68, result);
    }
}
