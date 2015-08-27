package com.thoughtworks.taxi.rule;

public class BasicDistanceRule implements Rule {
    @Override
    public double getCost(Integer kilometers) {
        return MIN_DISTANCE_COST + (kilometers - MIN_DISTANCE) * PRICE_OF_PER_KILOMETER;
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return MIN_DISTANCE < kilometers && kilometers <= BASIC_DISTANCE;
    }
}
