/*
 Write a program that prompts the user to input a sequence of characters
 and outputs the number of vowels. (Use the method isVowel written in
 Programming Exercise 1.)
 */

public class Main {
    public static void main(String[] args){

        System.out.print("Input a string: ");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        str.toLowerCase();

        

        int sum=0;

       for(int count= 0; count < str.length();count++){
           if(isVowel(str.charAt(count)))
               sum = sum + 1;
           else
               continue;

       }
        System.out.println(sum);

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