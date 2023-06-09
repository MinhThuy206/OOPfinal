package com.vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = data;
    }

    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        /* TODO */
        data.remove(index);
    }

    @Override
    public int length() {
        /* TODO */
        return data.size();
    }

    @Override
    public double magnitude() {
        /* TODO */
        double sum = 0;
        for (Double datum : data) {
            sum += datum * datum;
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < length(); i++) {
            sum += (data.get(i) - another.data.get(i)) * (data.get(i) - another.data.get(i));
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] result = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i);
        }
        return result;
    }

    public double element(int index) {
        /* TODO */
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return null;
        }
        List<Double> temp = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            temp.add(data.get(i) - another.data.get(i));
        }
        return new ListVector(temp);
    }

    public ListVector plus(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return null;
        }
        List<Double> temp = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            temp.add(data.get(i) + another.data.get(i));
        }
        return new ListVector(temp);
    }

    public ListVector scale(double factor) {
        /* TODO */
        List<Double> temp = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            temp.add(data.get(i) * factor);
        }
        return new ListVector(temp);

    }

    public double dot(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < length(); i++) {
            sum += data.get(i) * another.data.get(i);
        }
        return sum;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < length(); i++) {
            s.append(data.get(i));
            if (i != length() - 1) {
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }
}
