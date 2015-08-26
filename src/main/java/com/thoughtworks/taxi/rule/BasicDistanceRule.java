package com.thoughtworks.taxi.rule;

public class BasicDistanceRule implements Rule {
    @Override
    public int getCost(Integer kilometers) {
        return (int) Math.round(MIN_DISTANCE_COST + (kilometers - MinDistanceRule.MIN_DISTANCE) * MinDistanceRule.PRICE_OF_PER_KILOMETER);
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return kilometers <= BASIC_DISTANCE;
    }
}
