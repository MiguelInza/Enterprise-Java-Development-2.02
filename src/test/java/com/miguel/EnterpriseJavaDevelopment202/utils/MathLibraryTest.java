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
    void getOddNumbers_array_integer() {
        int[] test = new int[]{1};
        assertArrayEquals(test, mathLibrary.getOddNumbers(1));
        int[] test2 = new int[]{1, 3};
        assertArrayEquals(test2, mathLibrary.getOddNumbers(4));

    }
}