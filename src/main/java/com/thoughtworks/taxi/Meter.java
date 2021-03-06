package com.thoughtworks.taxi;

import com.thoughtworks.taxi.rule.BasicDistanceRule;
import com.thoughtworks.taxi.rule.LongDistanceRule;
import com.thoughtworks.taxi.rule.MinDistanceRule;
import com.thoughtworks.taxi.rule.Rule;
import com.thoughtworks.taxi.rule.ZeroDistanceRule;

import java.util.Arrays;
import java.util.List;

public class Meter {

    private final List<Rule> rules =
            Arrays.asList(new ZeroDistanceRule(), new MinDistanceRule(), new BasicDistanceRule(), new LongDistanceRule());

    public int count(Distance distance) {
        return count(distance, new Time(0));
    }

    public int count(Time time) {
        return count(new Distance(0), time);
    }

    public int count(Distance distance, Time time) {
        double cost = 0;

        for (Rule rule : rules) {
            if (rule.isApplicable(distance.getKilometers())) {
                cost += rule.getCostBy(distance.getKilometers());
            }
        }
        cost += getCostBy(time);

        return round(cost);
    }

    private int round(double cost) {
        return (int) Math.round(cost);
    }

    private double getCostBy(Time time) {
        return time.getMinutes() * Constants.PRICE_OF_PER_MINUTE_FOR_WAITING;
    }
}
