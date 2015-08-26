package com.thoughtworks.taxi;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MeterTest {

    private Meter meter;

    @Before
    public void setUp() {
        meter = new Meter();


    }

    @Test
    public void should_cost_6_yuan_if_it_take_2_kilometers() {
        assertThat(meter.count(2)).isEqualTo(6);

    }

    @Test
    public void should_cost_6_yuan_if_it_take_1_kilometers() {
        assertThat(meter.count(1)).isEqualTo(6);

    }

    @Test
    public void should_cost_22_yuan_if_it_take_11_kilometers() {
        assertThat(meter.count(11)).isEqualTo(22);

    }

    @Test
    public void should_cost_11_yuan_if_it_take_5_kilometers() {
        assertThat(meter.count(5)).isEqualTo(11);

    }

    @Test
    public void should_cost_15_yuan_if_it_take_8_kilometers() {
        assertThat(meter.count(8)).isEqualTo(15);

    }

    @Test
    public void should_cost_0_yuan_if_it_take_0_kilometers() {
        assertThat(meter.count(0)).isEqualTo(0);

    }
}
