package com.thoughtworks.taxi.rule;

import com.thoughtworks.taxi.Constants;

public class BasicDistanceRule implements Rule {
    @Override
    public boolean isApplicable(Integer kilometers) {
        return Constants.MIN_DISTANCE < kilometers && kilometers <= Constants.BASIC_DISTANCE;
    }

    @Override
    public double getCostBy(Integer kilometers) {
        return Constants.MIN_DISTANCE_COST + (kilometers - Constants.MIN_DISTANCE) * Constants.PRICE_OF_PER_KILOMETER;
    }
}
