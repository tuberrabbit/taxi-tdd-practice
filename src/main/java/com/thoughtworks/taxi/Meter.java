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

    public Integer count(Integer kilometers) {
        for (Rule rule : rules) {
            if (rule.isApplicable(kilometers)) {
                return rule.getCost(kilometers);
            }
        }
        return 0;
    }

}
