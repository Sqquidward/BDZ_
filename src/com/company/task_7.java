package com.company;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int [][] array = new int[a][b];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                array[i][j] = (i+1)*(j+1);
                System.out.print(" "+array[i][j]+" ");
            }
        System.out.println("\n");
        }
    }
}