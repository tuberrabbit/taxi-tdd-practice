package com.thoughtworks.taxi.rule;

import com.thoughtworks.taxi.Constants;

public class LongDistanceRule implements Rule {
    @Override
    public boolean isApplicable(Integer kilometers) {
        return Constants.BASIC_DISTANCE < kilometers;
    }

    @Override
    public double getCostBy(Integer kilometers) {
        return Constants.MIN_DISTANCE_COST + (Constants.BASIC_DISTANCE - Constants.MIN_DISTANCE) * Constants.PRICE_OF_PER_KILOMETER
                + (kilometers - Constants.BASIC_DISTANCE) * Constants.PRICE_OF_PER_KILOMETER * (1 + Constants.PREMIUM_OF_PER_KILOMETER);
    }
}
