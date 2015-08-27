package com.thoughtworks.taxi.rule;

public class LongDistanceRule implements Rule {
    @Override
    public double getCost(Integer kilometers) {
        return MIN_DISTANCE_COST + (BASIC_DISTANCE - MIN_DISTANCE) * PRICE_OF_PER_KILOMETER
                + (kilometers - BASIC_DISTANCE) * PRICE_OF_PER_KILOMETER * (1 + PREMIUM_OF_PER_KILOMETER);
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return BASIC_DISTANCE < kilometers;
    }
}
