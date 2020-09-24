package com.mortagecalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loan amount");
        int amount = scanner.nextInt();
        System.out.print("Enter annual interest rate");
        float interest = scanner.nextFloat();
        System.out.print("Enter loan period");
        byte years = scanner.nextByte();
        float morgage = amount * (interest * (1 + interest)) / ((1 + interest) - 1);
        System.out.print(morgage);
    }
}
