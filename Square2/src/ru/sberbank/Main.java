package ru.sberbank;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("VVedite r");
        int r = input.nextInt();

        CIRCLE circle = new CIRCLE(r);
        circle.go();
    }
}
