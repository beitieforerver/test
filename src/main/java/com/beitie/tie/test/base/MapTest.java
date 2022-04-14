package com.beitie.tie.test.base;

import java.util.ArrayList;
import java.util.Collection;

public class MapTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.contains(null);
        System.out.println(c.size());
        System.out.println(c.add("1"));
    }
}
