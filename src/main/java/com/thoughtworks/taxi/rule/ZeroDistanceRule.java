package com.thoughtworks.taxi.rule;

import com.thoughtworks.taxi.Constants;

public class ZeroDistanceRule implements Rule {
    @Override
    public boolean isApplicable(Integer kilometers) {
        return kilometers == Constants.ZERO;
    }

    @Override
    public double getCostBy(Integer kilometers) {
        return Constants.ZERO;
    }
}
