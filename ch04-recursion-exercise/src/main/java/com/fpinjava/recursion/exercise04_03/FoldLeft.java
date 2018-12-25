package com.fpinjava.recursion.exercise04_03;

import java.util.List;

import com.fpinjava.common.Function;
import com.fpinjava.common.TailCall;

import static com.fpinjava.common.CollectionUtilities.*;
import static com.fpinjava.common.TailCall.*;


public class FoldLeft {

    public static <T, U> U foldLeft(List<T> ts, U identity, Function<U, Function<T, U>> f) {
//    throw new RuntimeException("To be implemented.");
        return foldLeft_(ts, identity, f).eval();
    }

    private static <T, U> TailCall<U> foldLeft_(List<T> ts, U identity, Function<U, Function<T, U>> f) {
        return ts.isEmpty()
                ? ret(identity)
                : sus(() -> foldLeft_(tail(ts), f.apply(identity).apply(head(ts)), f));
    }
}
