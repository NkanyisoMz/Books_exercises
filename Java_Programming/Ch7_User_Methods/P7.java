/*
The following formula gives the distance between two points (x1, y1) and
(x2, y2) in the Cartesian plane:
sqrt((x2-x1)^2 + (y2-y1)^2)
Given the center and a point on a circle, you can use this formula to find the
radius of the circle. Write a program that prompts the user to enter the
center and a point on the circle. The program should then output the circle’s
radius, diameter, circumference, and area. Your program must have at least
the following methods:
    a. distance: This method takes as its parameters four numbers that
    represent two points in the plane and returns the distance between them.
    b. radius: This method takes as its parameters four numbers that represent
    the center and a point on the circle, calls the method distance to find
    the radius of the circle, and returns the circle’s radius.
    c. circumference: This method takes as its parameter a number that
    represents the radius of the circle and returns the circle’s circumference.
    (If r is the radius, the circumference is 2pr.)
    d. area: This method takes as its parameter a number that represents the radius
    of the circle and returns the circle’s area. (If r is the radius, the area is 2*pi*r.)
    e. Assume that pi = 3.1416.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the two centre coordinates separated by space: ");
        x1 = console.nextInt();
        y1 = console.nextInt();

        System.out.print("Enter the point two coordinates separated by space: ");
        x2 = console.nextInt();
        y2 = console.nextInt();

        

    }

    public static double radius(){

    }

    public static double distance(){
        
    }

    public static double circumference(){
        
    }

    public static double area(){
        
    }
    
    }