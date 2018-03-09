package com.netshoes.problems.problem2.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionImplTest {

    @Test
    public void shouldReturn1_2IsGreaterThan1_1() {
        final String versionOne = "1.2";
        final String versionTwo = "1.1";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 1);
    }

    @Test
    public void shouldReturn1_2IsLessThan1_3() {
        final String versionOne = "1.2";
        final String versionTwo = "1.3";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, -1);
    }

    @Test
    public void shouldReturn1_1Equals1_1() {
        final String versionOne = "1.1";
        final String versionTwo = "1.1";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 0);
    }

    @Test
    public void shouldReturn1_1_1_2_3_4_5Equals1_1_1_2_3_4_5() {
        final String versionOne = "1.1.1.2.3.4.5";
        final String versionTwo = "1.1.1.2.3.4.5";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 0);
    }

    @Test
    public void shouldReturn2_10_115_2_3Equal() {
        final String versionOne = "2.10.115.2.3";
        final String versionTwo = "2.10.115.2.3";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 0);
    }

    @Test
    public void shouldReturn1_1_1IsGreaterThan1_1() {
        final String versionOne = "1.1.1";
        final String versionTwo = "1.1";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 1);
    }

    @Test
    public void shouldReturn10_1_20_10_2_3_4IsGreater10_1_20_10_2_3_2() {
        final String versionOne = "10.1.20.10.2.3.4";
        final String versionTwo = "10.1.20.10.2.3.2";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 1);
    }

    @Test
    public void shouldReturn10_1_20_50_2_3_4IsGreater10_1_20_10_2_3_4() {
        final String versionOne = "10.1.20.50.2.3.4";
        final String versionTwo = "10.1.20.10.2.3.4";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 1);
    }

    @Test
    public void shouldReturn1_1_1_1_2_3_3IsLessThan1_1_1_1_2_3_2() {
        final String versionOne = "1.1.1.1.2.3.4";
        final String versionTwo = "1.1.1.1.2.3.2";

        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);

        assertEquals(expectedOutput, 1);
    }

    @Test
    public void shouldReturn1_0IsEqualsTo1() {
        final String versionOne = "1";
        final String versionTwo = "1.0";
        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(expectedOutput, 0);
    }

    @Test
    public void shouldReturn5IsEqualsTo5_0_0_0_0() {
        final String versionOne = "5";
        final String versionTwo = "5.0.0.0.0";
        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(expectedOutput, 0);
    }

    @Test
    public void shouldReturn1_2IsLessThan2_1() {
        final String versionOne = "1.2";
        final String versionTwo = "2.1";
        int expectedOutput = CompareVersionImpl.compareVersion(versionOne, versionTwo);
        assertEquals(expectedOutput, -1);
    }
}