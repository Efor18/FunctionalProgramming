package com.efor18;


import java.math.BigDecimal;

import static com.efor18.Prices.prices;

/**
 * Created by Erne on 8/10/16.
 */
public class DiscountImperative {
    public static void main(final String[] args) {
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountedPrices =
                        totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
