package com.efor18;

import java.math.BigDecimal;

import static com.efor18.Prices.prices;

/**
 * Created by Erne on 8/10/16.
 */
public class DiscountFunctional {
    public static void main(final String[] args) {
        final BigDecimal totalOfDiscountedPrices = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
