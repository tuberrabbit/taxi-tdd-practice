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
        assertThat(meter.count(new Distance(2))).isEqualTo(6);

    }

    @Test
    public void should_cost_6_yuan_if_it_take_1_kilometers() {
        assertThat(meter.count(new Distance(1))).isEqualTo(6);

    }

    @Test
    public void should_cost_22_yuan_if_it_take_11_kilometers() {
        assertThat(meter.count(new Distance(11))).isEqualTo(22);

    }

    @Test
    public void should_cost_11_yuan_if_it_take_5_kilometers() {
        assertThat(meter.count(new Distance(5))).isEqualTo(11);

    }

    @Test
    public void should_cost_15_yuan_if_it_take_8_kilometers() {
        assertThat(meter.count(new Distance(8))).isEqualTo(15);

    }

    @Test
    public void should_cost_0_yuan_if_it_take_0_kilometers() {
        assertThat(meter.count(new Distance(0))).isEqualTo(0);

    }

    @Test
    public void should_cost_1_yuan_if_it_wait_2_minutes() {
        assertThat(meter.count(new Time(2))).isEqualTo(1);
    }

    @Test
    public void should_cost_23_yuan_if_it_take_11_kilometers_and_waite_3_minutes() {
        assertThat(meter.count(new Distance(11), new Time(3))).isEqualTo(23);

    }

    @Test
    public void should_cost_8_yuan_if_it_take_3_kilometers_and_waite_2_minutes() {
        assertThat(meter.count(new Distance(3), new Time(2))).isEqualTo(8);

    }
}
