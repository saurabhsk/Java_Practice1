package com.stackroute.unittest;

import java.util.Scanner;

public class Series {

     public boolean seriesPatt(int n){

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the nth Term: ");
//            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                //System.out.println();
            }
              return true;
            }

        }

