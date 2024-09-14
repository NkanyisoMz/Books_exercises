/*
Modify the RollDice program, Example 7-3, so that it allows the user to
enter the desired sum of the numbers to be rolled. Also allow the user to call
the rollDice method as many times as the user desires.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

         System.out.println(rollDice());

    }

    public static int rollDice(){
        Scanner console = new Scanner(System.in);
        System.out.print("Input your desired number: ");
        int num = console.nextInt();
        int sum = 0;
        int count = 0;

        if(num >12 || num <2){
            System.out.println("Two dices rolled simultaneously cannot sum" +
                    "any number less than 2 or above 12");
        }
        else
            do{
            int num1 = (int) (Math.random()*6)+1;
            int num2 = (int) (Math.random()*6)+1;
            sum = num1 + num2;
            count ++;
        }while(sum != num);
        return count;
    }
    
    }