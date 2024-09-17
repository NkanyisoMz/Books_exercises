/*
Programming Exercise 7 (Chapter 5) asks you to write a program that
determines whether a positive integer is a prime number. Redo this programming exercise by 
writing a method that takes as input a positive integer and returns true if the number is a prime number; 
otherwise, it returns false.
*/

public class Main {
    public static void main(String[] args){

        System.out.println(prime(1));
        System.out.println(prime(2));
        System.out.println(prime(3));
        System.out.println(prime(4));
        System.out.println(prime(5));

        

    }

    public  static boolean prime(int num){

        int square = (int) sqrt(num);
        for(int i = 1;i <= square; i ++ )
            for (int j = 1; j <= square; j++)
                if((i * j) == num)
                    return false;

        return true;


    }
    
    }