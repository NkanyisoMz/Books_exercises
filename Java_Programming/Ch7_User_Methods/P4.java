/*
Write a method, reverseDigit, that takes an integer as a parameter and
returns the number with its digits reversed. For example, the value of
reverseDigit(12345) is 54321. Also, write a program to test your method
*/

public class Main {
    public static void main(String[] args){

        System.out.println(reverseDigit(126788));

    }

    public static int reverseDigit(int num){
        String strInt = String.valueOf(num);
        int len = strInt.length();
        String temp = "";
        for(int count =0;count < len;count++){
            temp += strInt.charAt(strInt.length() - count-1);
            //System.out.println(temp);
            //temp += temp;
            //System.out.print(temp);
        }
        int rev = Integer.parseInt(temp);
        return rev;
    }
    
    }