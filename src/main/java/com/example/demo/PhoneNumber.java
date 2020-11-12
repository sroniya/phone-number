package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author : sroniya
 * @Description : Given an integer array containing digits from [0, 9], the task is to print all possible letter combinations that the numbers could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is being followed. Note that 0 and 1 do not map to any letters.
 *
 * Example:
 * Input: arr[] = {2, 3}
 * Output: ad ae af bd be bf cd ce cf
 * Input: arr[] = {9}
 * Output: w x y z
 *
 * @Date : 2020-11-11 23:35
 */
public class PhoneNumber {

    /**
     * number change to letter function
     * @param digits
     * @return
     */
    static List<String> numberToLetter(String digits) {
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> result = new LinkedList<>();

        if(StringUtils.isEmpty(digits)){
            return result;
        }

        result.add("");
        for(int i = 0; i < digits.length(); i++){
            String digitLetters = mapping[digits.charAt(i)-'0'];
            LinkedList<String> temp = result
                    .stream()
                    .flatMap(str1 -> digitLetters.chars().mapToObj(j -> (char)j).map(str2 -> str1 + str2))
                    .collect(Collectors.toCollection(LinkedList::new));
            result = temp;
        }
        return result;
    }

}
