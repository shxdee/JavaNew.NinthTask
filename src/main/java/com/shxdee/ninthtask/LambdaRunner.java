package com.shxdee.ninthtask;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaRunner {
    public static <T,R> R getFunctionResult(Function<T,R> f, T t) {
        return f.apply(t);
    }

    public static <T> boolean getPredicateResult(Predicate<T> p, T t) {
        return p.test(t);
    }

    public static <T> boolean getBiPredicateResult(BiPredicate<T, T> p, T t1, T t2) {
        return p.test(t1, t2);
    }

    public static boolean getLambdaInterfaceResult(ILambda lf, Human h1, Human h2, Human h3, int i) {
        return lf.check(h1, h2, h3, i);
    }
}