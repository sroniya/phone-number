package com.example.demo;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @Author : sroniya
 * @Description : test case of phone number to letter
 * @Date : 2020-11-12 9:57
 */
class PhoneNumberTest {

    /**
     *  Input: arr[] = {2, 3}
     *  Output: ad ae af bd be bf cd ce cf
     */
    @Test
    void multipleNumberToLetter() {
        // create test params
        int[] arr = {2, 3};
        // create verify data
        final List<String> verifyList = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        // call test function
        String str = Arrays.stream(arr).boxed().map(i -> i.toString()).reduce("", String::concat);
        List<String> result = PhoneNumber.numberToLetter(str);

        // verify
        assertEquals(result, verifyList);
    }

    /**
     * Input: arr[] = {9}
     * Output: w x y z
     */
    @Test
    void oneNumberToLetter() {
        // create test params
        int[] arr = {9};
        // create verify data
        final List<String> verifyList = Arrays.asList("w", "x", "y", "z");

        // change int array to string
        String str = Arrays.stream(arr).boxed().map(i -> i.toString()).reduce("", String::concat);
        // call test function
        List<String> result = PhoneNumber.numberToLetter(str);

        // verify
        assertEquals(result, verifyList);
    }

    /**
     * Input: arr[] = {22,33}
     * Output: aad aae aaf abd abe abf acd ace acf bad bae baf bbd bbe bbf bcd bce bcf cad cae caf cbd cbe cbf ccd cce ccf
     */
    @Test
    void umberToLetter() {
        // create test params
        int[] arr = {22,3};
        // create verify data
        final List<String> verifyList = Arrays.asList(
                "aad", "aae", "aaf", "abd", "abe", "abf", "acd", "ace", "acf",
                "bad", "bae", "baf", "bbd", "bbe", "bbf", "bcd", "bce", "bcf",
                "cad", "cae", "caf", "cbd", "cbe", "cbf", "ccd", "cce", "ccf"
        );

        // change int array to string
        String str = Arrays.stream(arr).boxed().map(i -> i.toString()).reduce("", String::concat);
        // call test function
        List<String> result = PhoneNumber.numberToLetter(str);

        // verify
        assertEquals(result, verifyList);
    }
}