package com.company;

public class Main {

    public static void main(String[] args) {
        // if multiple of 3, print "Fizz"
        // if multiple of 5, print "Buzz"
        // if multiple of  both 3 and 5, print "FizzBuzz"

        for(int i = 1; i<=100; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}
