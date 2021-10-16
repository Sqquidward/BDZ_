package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] a = new int[N];
        for(int i = 0; i<N; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int j = N; j>0; j--){
            if(a[j-1]%100==11){System.out.println(a[j-1]);break;}
        }
    }
}

