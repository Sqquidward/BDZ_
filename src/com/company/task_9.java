package com.company;
import java.util.Scanner;
public class task_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int sum = 0;
        while (true){
            if(n/a!=0){a*=10;sum++;}
            else{break;}
        }
        int iter_1 = 10;
        for(int i = 1; i<(sum/2); i++){
            iter_1*=10;}


        int num_2_1 = n%iter_1;
        int num_2_2 = 0;

        int k = iter_1/10;
        int l = 1;
        for(int j = 0; j<(sum/2); j++){
            num_2_2+=((num_2_1/l)%10)*k;
            k/=10;
            l*=10;
        }
        if(sum%2!=0&&(n/(iter_1*10))==(num_2_2)){System.out.println("Yes");}
        else if(sum%2==0&&(n/(iter_1))==(num_2_2)){System.out.println("Yes");}
        else{System.out.println("No");}

    }
}
