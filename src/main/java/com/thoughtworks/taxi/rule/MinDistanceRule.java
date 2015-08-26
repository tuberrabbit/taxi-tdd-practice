package com.thoughtworks.taxi.rule;

public class MinDistanceRule implements Rule {
    @Override
    public int getCost(Integer kilometers) {
        return MIN_DISTANCE_COST;
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return kilometers <= MIN_DISTANCE;
    }
}
