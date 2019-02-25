package com.venky;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        int small = 0;
        int large = 0;
        int count =0;
        Scanner scanner = new Scanner(System.in);
        while ( true ) {

            System.out.println("enter number: ");
            count++;

            boolean value = scanner.hasNextInt();

            if(value) {

                int number = scanner.nextInt();


//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(count==1){

                    small = number;
                    large =number;
                }

                if(number > large) {
                    large = number;
                }

                if(number < small) {
                    small = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println(small +"large" + large);
        scanner.close();
    }

}
