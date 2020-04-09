package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter count of points");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter x,y");
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        list.forEach((obj) -> {
            System.out.println("Point: "+ obj.toString());
        });
    }

}
