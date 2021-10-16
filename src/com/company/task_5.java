package com.company;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] b = new int[N];
        int sum = 0;
        for(int i = 0; i<N; i++){
            b[i] = in.nextInt();
        }
        for(int j =0; j<N; j++){
            int B = b[j];
            int umn = 1;
            while (B != 0) {
                B /= 10.0;
                umn *= 10;
            }
            System.out.print(b[j] / (umn / 10)+"");
        }
    }
}
