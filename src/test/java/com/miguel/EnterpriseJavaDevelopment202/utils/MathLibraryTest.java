package com.miguel.EnterpriseJavaDevelopment202.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {
    private MathLibrary mathLibrary;

    @BeforeEach
    void setUp() {
        mathLibrary = new MathLibrary();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetOddNumbers() {
        int[] expected = {1, 3, 5, 7, 9};
        int[] result = mathLibrary.getOddNumbers(10);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testGetOddNumbers_0() {
        int[] expected = {};
        int[] result = mathLibrary.getOddNumbers(0);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testGetOddNumbers_1() {
        int[] expected = {1};
        int[] result = mathLibrary.getOddNumbers(1);
        assertArrayEquals(expected, result);
    }
}