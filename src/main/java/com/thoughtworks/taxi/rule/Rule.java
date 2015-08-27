package com.thoughtworks.taxi.rule;

public interface Rule {
    int MIN_DISTANCE = 2;
    int MIN_DISTANCE_COST = 6;
    double PREMIUM_OF_PER_KILOMETER = 0.5;
    int ZERO = 0;
    double PRICE_OF_PER_KILOMETER = 1.5;
    int BASIC_DISTANCE = 8;

    double getCost(Integer kilometers);

    boolean isApplicable(Integer kilometers);
}
