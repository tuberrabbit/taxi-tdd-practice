package com.thoughtworks.taxi.rule;

public interface Rule {

    boolean isApplicable(Integer kilometers);

    double getCostBy(Integer kilometers);
}
