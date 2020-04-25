package com.company;
        import java.util.Scanner;
public class Main {

    private static int ListResult;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int N = sc.nextInt();
        System.out.println("Enter the elements themselves");
        ListElement first = null;
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            first = ListUtils.insert(first, value);
        }
        int result = ListUtils.reduce(ListUtils.map(ListUtils.filter(first)));
        System.out.println(result);
    }
}