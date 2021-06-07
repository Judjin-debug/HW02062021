package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the test string: ");
        String test = scan.nextLine().toString();

        Pattern pattern = Pattern.compile("[\\!\\.\\?\\,\\;]");
        Matcher matcher = pattern.matcher(test);
        int count = 0;
        while (matcher.find()) {
            count++;
        };
        System.out.println("Count of punctuation signs " + count);
    }


}
