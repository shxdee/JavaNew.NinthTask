package com.shxdee.ninthtask;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static Function<String, Integer> getLength = String::length;
    public static Function<String, Character> getFirstChar = str -> { if (str == null || "".equals(str)) return null; return str.charAt(0); };
    public static Predicate<String > isWithSpace = str -> str.contains(" ");
    public static Function<String, Integer> countWords = str -> {
        if (str == null || "".equals(str)) {
            return 0;
        }
        String[] buf = str.split(",");
        int count = 0;
        for (int i = 0; i < buf.length; i++) {
            if (!"".equals(buf[i])) {
                count++;
            }
        }
        return count;
    };
    public static Function<Human, Integer> getAgeOfHuman = Human::getAge;
    public static BiPredicate<Human, Human> isEqualLastName = (human, human2) -> human.getLastName().equals(human2.getLastName());
    public static Function<Human, String> getFullName = h -> h.getLastName() + " " + h.getFirstName() + " " + h.getPatronymic();
    public static Function<Human, Human> increaseAge = h -> new Human(h.getLastName(), h.getFirstName(),  h.getPatronymic(), h.getAge() + 1, h.getGender());
    public static ILambda isYoungerThan = (h1, h2, h3, maxAge) -> h1.getAge() < maxAge && h2.getAge() < maxAge && h3.getAge() < maxAge;
}
