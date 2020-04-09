package com.company;

public class ListUtils {
    public static ListElement insert(ListElement first, int value) {
        if (first == null) {
            return new ListElement(value);
        } else {
            ListElement p = first;
            while (p.getNext() != null) p = p.getNext();
            p.setNext(new ListElement(value));
            return first;
        }
    }
    public static ListElement filter(ListElement first) {
        ListElement p = null;
        while (first != null) {
            if (first.getValue()%3 == 0) p = insert(p, first.getValue());
            first = first.getNext();
        }
        return p;
    }
    public static ListElement map(ListElement first) {
        ListElement p = null;
        while (first != null) {
            int value = first.getValue();
            p = insert(p, value*value*value);
            first = first.getNext();
        }
        return p;
    }
    public static int reduce(ListElement first) {
        int sum = 0;
        while (first != null) {
            sum += first.getValue();
            first = first.getNext();
        }
        return sum;
    }
}
