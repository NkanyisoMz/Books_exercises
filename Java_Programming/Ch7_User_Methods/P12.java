/*
Write a program that determines whether a positive is a prime number. If
the number is a prime number, then the program also outputs whether the
number is a palindrome. Use the methods developed in Programming
Exercises 10 and 11 of this chapter.
*/
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int num = console.nextInt();

        if (num <= 0) {
            System.out.println("Number must be positive.");
            return;
        }

        if (isPrime(num)) {
            if (isPalindrome(num)) {
                System.out.println("Number is a prime and palindrome.");
            } else {
                System.out.println("Number is a prime but not a palindrome.");
            }
        } else {
            System.out.println("Number is not a prime.");
        }
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
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
