package com.company;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        while(true)
        {
            int c = a & b;
            a ^= b;
            b = c << 1;
            if(b==0){break;}
        }

        System.out.println(a);
    }
}
