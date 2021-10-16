package com.company;
import java.util.Scanner;
public class task_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 2;
        while (n != 1) {
            if (n % b == 0) {
                System.out.print(b + "*");
                n /= b;
            } else if (b == 2) {
                b++;
            } else {
                b += 2;
            }

    }
}}
