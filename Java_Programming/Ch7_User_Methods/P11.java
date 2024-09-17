/*
Programming Exercise 7 (Chapter 5) asks you to write a program that
determines whether a positive integer is a prime number. Redo this programming exercise by 
writing a method that takes as input a positive integer and returns true if the number is a prime number; 
otherwise, it returns false.
*/
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args){

        System.out.println(prime(1));
        System.out.println(prime(2));
        System.out.println(prime(3));
        System.out.println(prime(4));
        System.out.println(prime(5));

        

    }

   public static boolean isPrime(int num) {
    if (num <= 1) {
        return false; 
    }
    if (num == 2) {
        return true; 
    }
    if (num % 2 == 0) {
        return false; 
    }

    int squareRoot = (int) Math.sqrt(num);
    for (int i = 3; i <= squareRoot; i += 2) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}

    
    }