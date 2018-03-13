package com.netshoes.problems.problem2.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionImplTest {

    @Test
    public void shouldReturn1_2IsGreaterThan1_1() {
        final String versionOne = "1.2";
        final String versionTwo = "1.1";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(1, output);
    }

    @Test
    public void shouldReturn1_2IsLessThan1_3() {
        final String versionOne = "1.2";
        final String versionTwo = "1.3";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(-1, output);
    }

    @Test
    public void shouldReturn1_1Equals1_1() {
        final String versionOne = "1.1";
        final String versionTwo = "1.1";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(0, output);
    }

    @Test
    public void shouldReturn1_1_1_2_3_4_5Equals() {
        final String versionOne = "1.1.1.2.3.4.5";
        final String versionTwo = "1.1.1.2.3.4.5";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(0, output);
    }

    @Test
    public void shouldReturn2_10_115_2_3Equal() {
        final String versionOne = "2.10.115.2.3";
        final String versionTwo = "2.10.115.2.3";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(0, output);
    }

    @Test
    public void shouldReturn1_1_1IsGreaterThan1_1() {
        final String versionOne = "1.1.1";
        final String versionTwo = "1.1";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(1, output);
    }

    @Test
    public void shouldReturn10_1_20_10_2_3_4IsGreater10_1_20_10_2_3_2() {
        final String versionOne = "10.1.20.10.2.3.4";
        final String versionTwo = "10.1.20.10.2.3.2";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(1, output);
    }

    @Test
    public void shouldReturn10_1_20_50_2_3_4IsGreater10_1_20_10_2_3_4() {
        final String versionOne = "10.1.20.50.2.3.4";
        final String versionTwo = "10.1.20.10.2.3.4";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(1, output);
    }

    @Test
    public void shouldReturn1_1_1_1_2_3_4IsLessThan1_1_1_1_2_3_2() {
        final String versionOne = "1.1.1.1.2.3.4";
        final String versionTwo = "1.1.1.1.2.3.2";

        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(1, output);
    }

    @Test
    public void shouldReturn1_0IsEqualsTo1() {
        final String versionOne = "1";
        final String versionTwo = "1.0";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(0, output);
    }

    @Test
    public void shouldReturn5IsEqualsTo5_0_0_0_0() {
        final String versionOne = "5";
        final String versionTwo = "5.0.0.0.0";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(0, output);
    }

    @Test
    public void shouldReturn1_2IsLessThan2_1() {
        final String versionOne = "1.2";
        final String versionTwo = "2.1";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(-1, output);
    }

    @Test
    public void shouldReturn0_1_2_2470_2IsLessThan1_2_1() {
        final String versionOne = "0.1.2.2470.2";
        final String versionTwo = "1.2.1";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(-1, output);
    }

    @Test
    public void shouldReturn0_1_2_2470_2IsGreaterThan0_0_1_1_1() {
        final String versionOne = "0.1.2.2470.2";
        final String versionTwo = "0.0.1.1.1";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(1, output);
    }

    @Test
    public void shouldReturn0_1_2_2470_0_0_2IsGreaterThan0_0_1_1_1() {
        final String versionOne = "0.1.2.2470.0.0.2";
        final String versionTwo = "0.0.1.1.1";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(1, output);
    }

    @Test
    public void shouldReturn0_0_0_0_01_2_2470_0_0_2IsGreaterThan0_0_0_0_1_1_1() {
        final String versionOne = "0.0.0.0.01.2.2470.0.0.2";
        final String versionTwo = "0.0.0.0.1.1.1";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(1, output);
    }

    @Test
    public void shouldReturn00_0_0_00_010_2_2470_0_00_2Equals() {
        final String versionOne = "00.0.0.00.010.2.2470.0.00.2";
        final String versionTwo = "0.00.0.00.10.2.2470.00.0.2";
        int output = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(0, output);
    }
}