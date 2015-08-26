package com.thoughtworks.taxi.rule;

public class LongDistanceRule implements Rule {
    @Override
    public int getCost(Integer kilometers) {
        return (int) Math.round(MIN_DISTANCE_COST + (BASIC_DISTANCE - MIN_DISTANCE) * PRICE_OF_PER_KILOMETER
                + (kilometers - BASIC_DISTANCE) * PRICE_OF_PER_KILOMETER * (1 + PREMIUM_OF_PER_KILOMETER));
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return true;
    }
}
