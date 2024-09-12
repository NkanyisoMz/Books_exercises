/*
Write a value-returning method, isVowel, that returns the value true if a
given character is a vowel, and otherwise returns false. Also write a
program to test your method.

*/ 

public class Main {
    public static void main(String[] args){

        System.out.println(isVowel('b'));
        System.out.println(isVowel('a'));

    }

    public static boolean isVowel(char a){



        if(a=='a')
            return true;
        else if(a=='e')
            return true;
        else if(a=='i')
            return true;
        else if(a=='o')
            return true;
        else if(a=='u')
            return true;
        else
            return false;
//
//
    }
}