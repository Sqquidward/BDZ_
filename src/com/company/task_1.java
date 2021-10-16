package com.company;

import java.util.Scanner;

public class task_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = a; i > 0; i--) {
            if(i*i<a){System.out.println(i);break;}
        }
    }
}