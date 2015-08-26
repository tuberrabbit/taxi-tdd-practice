package com.thoughtworks.taxi;

public class Meter {

    public Integer count(Integer kilometers) {
        if (kilometers == 0) {
            return 0;
        }
        if (kilometers <= 2) {
            return 6;
        }
        if (kilometers <= 8) {
            return (int) Math.round(6 + (kilometers - 2) * 1.5);
        }
        return (int) Math.round(6 + (8 - 2) * 1.5 + (kilometers - 8) * 1.5 * 1.5);
    }
}
