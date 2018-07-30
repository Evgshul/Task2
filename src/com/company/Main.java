package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base's length of the triangle :");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            for (int j = 1; j <= n; j = j + 2) {
                for (int k=1;k<=n-j;k=k+2)
                    System.out.print(" ");
                for (int i = 0; i <= j; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int j = 0; j <= n; j = j + 2) {
                for (int k=0; k<=n-j; k=k+2)
                    System.out.print(" ");
                    for (int i = 0; i <= j; i++) {
                        System.out.printf("*");
                    }
                    System.out.println();

            }
        }
    }
}

//System.out.printf("%s\n %s\n %2s\n", "*****", "***", "*");

///System.out.println();





