package com.thoughtworks.taxi;

import com.thoughtworks.taxi.rule.BasicDistanceRule;
import com.thoughtworks.taxi.rule.LongDistanceRule;
import com.thoughtworks.taxi.rule.MinDistanceRule;
import com.thoughtworks.taxi.rule.Rule;
import com.thoughtworks.taxi.rule.ZeroDistanceRule;

import java.util.Arrays;
import java.util.List;

public class Meter {

    private final List<Rule> rules = Arrays.asList(new ZeroDistanceRule(), new MinDistanceRule(), new BasicDistanceRule(), new LongDistanceRule());

    public int count(Distance distance) {
        for (Rule rule : rules) {
            if (rule.isApplicable(distance.getKilometers())) {
                return rule.getCost(distance.getKilometers());
            }
        }
        return 0;
    }

    public int count(Time time) {
        return (int) Math.round(0.25 * time.getMinutes());
    }

    public int count(Distance distance, Time time) {
        return count(distance) + count(time);
    }
}
