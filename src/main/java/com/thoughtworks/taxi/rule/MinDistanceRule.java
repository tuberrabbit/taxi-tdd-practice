package com.thoughtworks.taxi.rule;

import com.thoughtworks.taxi.Constants;

public class MinDistanceRule implements Rule {
    @Override
    public boolean isApplicable(Integer kilometers) {
        return 0 < kilometers && kilometers <= Constants.MIN_DISTANCE;
    }

    @Override
    public double getCostBy(Integer kilometers) {
        return Constants.MIN_DISTANCE_COST;
    }
}
