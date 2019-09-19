package ru.sberbank;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("VVedite a");
        int a = input.nextInt();

        SQUARE square = new SQUARE(a);
        square.go();
    }
}
