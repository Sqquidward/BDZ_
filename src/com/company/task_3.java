package com.company;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int a = in.nextInt();
            if(a == 0){break;}
            else{sum+=a;}
        }
        for (int i = sum; i > 0; i--) {
            if(i*i<sum){System.out.println(i);break;}
    }
}}
