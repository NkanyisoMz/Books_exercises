/*
Write a program to test the method isPalindrome discussed in Example 7-4.
*/

public class Main {
    public static void main(String[] args){

        System.out.println(isPalindrome("123l321"));

    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        int i;
        int j = len - 1;


        for(i=0; i<=(len-1)/2;i++){
            if(str.charAt(i) != str.charAt(j))
                return false;
            j--;}

        return true;
    }
    
    }