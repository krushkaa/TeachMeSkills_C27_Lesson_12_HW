package com.teachmeskills.lesson12.task1.runner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson12.task1.service.Constants.reg;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}

