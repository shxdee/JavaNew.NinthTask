package com.shxdee.ninthtask;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StreamApiDemo extends LambdaDemo {
    public static UnaryOperator<List<Object>> deleteNull = list ->
            list.stream().filter(Objects::nonNull).collect(Collectors.toList());

    public static Function<Set<Integer>, Integer> countPositive = set ->
            Math.toIntExact(set.stream().filter(item -> item > 0).count());

    /*public static UnaryOperator<List<Object>> getLastThreeElem = list ->
            List.of(list.stream().filter(Objects::nonNull).skip(Math.max(0, list.size() - 3)).toArray());*/

    public static UnaryOperator<List<Object>> getLastThreeElem = list ->
            list.stream().skip(Math.max(0, list.size() - 3)).collect(Collectors.toList());

    public static Function<List<Integer>, Integer> getFirstEven = list ->
            list.stream().filter(i -> i % 2 == 0).findFirst().orElse(null);

    public static Function<int[], List<Integer>> getSquareList = arr ->
            Arrays.stream(arr).boxed().distinct().map(n -> n*n).collect(Collectors.toList());

    public static UnaryOperator<List<String>> getSortedStringList = list ->
            list.stream().filter(s -> (s != null && !"".equals(s))).sorted().collect(Collectors.toList());

    public static Function<Set<String>, List<String>> getSortedReversStringList = set ->
            set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    public static Function<Set<Integer>, Integer> getSquareSum = set -> set.stream().mapToInt(n -> n*n).sum();

    public static Function<Collection<Human>, Integer> getMaxAgeFromCollection = coll ->
            coll.stream().mapToInt(Human::getAge).max().orElse(0);

    public final static UnaryOperator<Collection<Human>> sortCollection = coll ->
            coll.stream().sorted(Comparator.comparing(Human::getGender).thenComparing(Human::getAge)).collect(Collectors.toList());
}
