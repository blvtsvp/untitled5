package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = (int)(in.nextDouble()*1000.0);
        int a = x / 1000;
        int b = x % 1000;
        System.out.println("New number is " + b + "," + a);
    }
}
