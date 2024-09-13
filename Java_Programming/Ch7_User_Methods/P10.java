/*
A nonnegative integer is called a palindrome if it reads forward and backward
in the same way. For example, the numbers 5, 121, 3443, and 123454321 are
palindromes. Write a method that takes as input a nonnegative integer and
returns true if the number is a palindrome; otherwise, it returns false.
(When determining whether the number is a palindrome, do not convert
the number into a string.) Also write a program to test your method.
*/

public class Main {
    public static void main(String[] args){

        System.out.println(Pal("lol"));

    }

     public static boolean Pal(String str){
        int i,j;
        j= str.length()-1;
        for(i=0;i < (str.length()-1/2);i++){
            if(str.charAt(i)!= str.charAt(j))
                return false;
            j--;
        }
        return true;
    }
    
    }