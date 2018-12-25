package com.fpinjava.recursion.exercise04_07;

import java.util.List;

import com.fpinjava.common.Function;

import static com.fpinjava.recursion.exercise04_03.FoldLeft.foldLeft;
import static com.fpinjava.recursion.exercise04_05.FoldRight.foldRight;

public class ComposeAll {

    public static <T> Function<T, T> composeAll(List<Function<T, T>> list) {

        //throw new RuntimeException("To be implemented.");
        return x -> {
            T y = x;
            for (Function<T, T> f : list) {
                y = f.apply(y);
            }
            return y;
        };

    }

    public static <T> Function<T, T> composeAllViaFoldLeft(List<Function<T, T>> list) {
//        throw new RuntimeException("To be implemented.");
        return x -> foldLeft(list, x, a -> b -> b.apply(a));
    }

    public static <T> Function<T, T> composeAllViaFoldRight(List<Function<T, T>> list) {
//        throw new RuntimeException("To be implemented.");
        return x -> foldRight(list, x, a -> b -> a.apply(b));
    }
}
