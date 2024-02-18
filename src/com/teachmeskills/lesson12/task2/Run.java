package com.teachmeskills.lesson12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {

        String text = "qwerty QWERTY@123.PI.com. //**teachmeskills@gmail.com8**//, ghk doc number DKI2323-1532-75PI phone number sdf e23 L+375(99)000-99-777L";
        String REG = "\\+\\d{3}?.(\\d{2})?.\\d{7}|\\+\\d{3}?.(\\d{2})?.\\d{3}(-\\d{2}){2}|\\+\\d{3}?.(\\d{2})?.\\d{3}(-\\d{4})|[a-z0-9_-]+@[a-z0-9_.-]+\\.([a-z]{3})|(?:\\d{4}-){2}(\\d{2})";

        Pattern pattern = Pattern.compile(REG);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
