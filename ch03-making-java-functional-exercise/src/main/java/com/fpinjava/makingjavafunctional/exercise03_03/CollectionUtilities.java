package com.fpinjava.makingjavafunctional.exercise03_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionUtilities {

    public static <T> List<T> list() {
//    throw new RuntimeException("To be implemented");
        return Collections.emptyList();
    }

    public static <T> List<T> list(T t) {
//    throw new RuntimeException("To be implemented");
        return Collections.singletonList(t);
    }

    public static <T> List<T> list(List<T> ts) {
//    throw new RuntimeException("To be implemented");
        return Collections.unmodifiableList(ts);
    }

    @SafeVarargs
    public static <T> List<T> list(T... t) {
//        throw new RuntimeException("To be implemented");
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t,t.length)));
    }
}
