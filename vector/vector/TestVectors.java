package com.vector;

import java.util.*;

public class TestVectors {
    public static void main(String[] args) {
        /* TODO */
        double[] i = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayVector a = new ArrayVector(i);
        ArrayVector b = new ArrayVector(new double[]{});
        for (double j: a.elements()) {
            b.append(-j);
        }
        System.out.println(b.magnitude());
        System.out.println(a.distanceTo(b));
        System.out.println(a.plus(b));
        System.out.println(a.minus(b));
        System.out.println(a.dot(b));
        a.insert(3,0);
        a.remove(3);
        System.out.println(a);
        System.out.println(b.scale(2));

        ArrayList<Double> j = new ArrayList<>();
        for (double k: i) {
            j.add(k);
        }
        ListVector c = new ListVector(j);
        ListVector d = new ListVector();
        for (double k: c.elements()) {
            d.append(-k);
        }
        System.out.println(d.magnitude());
        System.out.println(c.distanceTo(d));
        System.out.println(c.plus(d));
        System.out.println(c.minus(d));
        System.out.println(c.dot(d));
        c.insert(3,0);
        c.remove(3);
        System.out.println(c);
        System.out.println(d.scale(2));

    }
}
