package com.thoughtworks.taxi.rule;

public class ZeroDistanceRule implements Rule {
    @Override
    public int getCost(Integer kilometers) {
        return ZERO;
    }

    @Override
    public boolean isApplicable(Integer kilometers) {
        return kilometers == ZERO;
    }
}
