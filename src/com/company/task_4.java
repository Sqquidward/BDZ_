package com.company;

import java.util.Arrays;;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] A = new int[100];
        int a = 0;
        for(int i = 0; i<100; i++){
                A[i] = in.nextInt();
                a++;
            if(A[i]==0){break;}
        }
        int [] B = new int[a];
        for(int j = 0; j<a; j++){B[j]=A[j];}
        Arrays.sort(B);
        for(int i = B.length-5; i<B.length; i++){System.out.print(B[i]+" ");}
        // Я пытался сделать в функцией ArrayList, но там ьыло тяжело сортировать список и в общем проводить с ним операции
    }
}
