/*
a. Write the definition of method one so that it returns the sum of
x and y if x is greater than y; otherwise, it should return x minus 2
times y.

b. Write the definition of method two as follows:
    i. Read a number and store it in z.
    ii. Update the value of z by adding the value of a to its previous value.
    iii. Assign the variable first the value returned by method one with
    the parameters 6 and 8.
    iv. Update the value of first by adding the value of x to its previous
    value.
    v. If the value of z is more than twice the value of first, return z;
    otherwise, return 2 times first minus z.

c. Write a Java program that tests parts a and b. (Declare additional variables in the method main, if necessary.)

*/
import java.util.Scanner;
public class Ch7_PrExercise3
{
public static void main(String[] args)
{
int num, num2;
double dec;

Scanner console = new Scanner(System.in);
System.out.print("Input first integer number: ")
num = console.nextInt();
System.out.print("Input second integer number: ")
num2 = console.nextInt();
System.out.print("Input a double number: ")
dec = console.nextDouble();

// Call method one and store the result
int resultOne = one(num1, num2);
System.out.println("Result of method one: " + resultOne);

// Call method two and print the result
double resultTwo = two(dec, num1);
System.out.println("Result of method two: " + resultTwo);

console.close();

}
public static int one(int x, int y)
{
if(x > y){
    return x + y;
}
else{
    return x - 2 * y;
}
}
public static double two(int x, double a)
{
int first;
double z;
Scanner console = new Scanner(System.in);
z = console.nextDouble();
z +=a;
first = one(6,8);
first += x;

if(z > 2*first){
    return z;
}else {
    return 2*first - z;
}

}
}