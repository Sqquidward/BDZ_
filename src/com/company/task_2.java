package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int k = 0;
        for (int i = 0; i<n; i++){a[i] = in.nextInt(); k+=a[i];}
        Arrays.sort(a);
        System.out.println("Минимальное: "+a[0]+"\nМаксимальное: "+a[n-1]+"\nСреднее арифметическое: "+ k/(n*1.0));
    }
}