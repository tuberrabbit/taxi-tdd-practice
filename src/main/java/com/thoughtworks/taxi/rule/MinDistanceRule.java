package com.thoughtworks.taxi.rule;

public class MinDistanceRule implements Rule {
    @Override
    public double getCost(Integer kilometers) {
        return MIN_DISTANCE_COST;
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return 0 < kilometers && kilometers <= MIN_DISTANCE;
    }
}
