package com.miguel.EnterpriseJavaDevelopment202.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MathLibrary {
//Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n. Write your tests first!
    public int[] getOddNumbers(int n) {
        int[] oddNumbers = new int[(n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i+= 2) {
            oddNumbers[index++] = i;
        }
        return oddNumbers;
    }

}
