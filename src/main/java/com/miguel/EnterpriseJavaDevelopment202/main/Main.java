package com.miguel.EnterpriseJavaDevelopment202.main;

import java.util.Arrays;
import java.util.List;
import com.miguel.EnterpriseJavaDevelopment202.utils.MathLibrary;
import com.sun.jdi.IntegerValue;

public class Main {
    //Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n. Write your tests first!
    public static void main(String[] args) {
        System.out.println("Hello World this is MAVEN !!!");
        MathLibrary mathLibrary = new MathLibrary();
        int[] oddNumbers = mathLibrary.getOddNumbers(3);
        System.out.println(Arrays.toString(oddNumbers));
        for (int number : oddNumbers) {
            System.out.println(number);
        }

    }
}
