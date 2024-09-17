/*
A nonnegative integer is called a palindrome if it reads forward and backward
in the same way. For example, the numbers 5, 121, 3443, and 123454321 are
palindromes. Write a method that takes as input a nonnegative integer and
returns true if the number is a palindrome; otherwise, it returns false.
(When determining whether the number is a palindrome, do not convert
the number into a string.) Also write a program to test your method.
*/

public class Main {
    public static void main(String[] args) {
        
        System.out.println(isPalindrome(121));      
        System.out.println(isPalindrome(3443));     
        System.out.println(isPalindrome(123454321)); 
        System.out.println(isPalindrome(123));      
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
}
