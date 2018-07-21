package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base's length of the triangle :");
        int n = scanner.nextInt();
        for (int k = 0; k <= n; k = k + 2) {
            for (int i = n; i <= n + k; i++) {
                for (int j = 2; j<=2; j--){
                System.out.printf("%js","*");}
            }
           System.out.println();
        }
    }
}
