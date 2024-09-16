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
    of the circle and returns the circle’s area. (If r is the radius, the area is 2*pi*r^2.)
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

        Circle circle = new Circle();
        double dis = circle.distance(x1,y1,x2,y2);
        System.out.println(dis);
        double rad = circle.radius(x1,y1,x2,y2);
        System.out.println(rad);
        double cir = circle.circumference(rad);
        System.out.println(cir);
        double area = circle.area(rad);
        System.out.println(area);

        

    }
    
    }

import static java.lang.Math.*;

public class Circle {
    static double PI = 3.1416;
   public static double distance(int x1, int y1, int x2, int y2){
        return sqrt((x2-x1)^2 + (y2-y1)^2);
    }
    public static double radius(int a, int b, int c, int d){

        return distance( a, b, c, d);

    }
    public static double circumference(double r){
        return 2 * PI * r;
    }
    public static double area(double r){
        return 2 * PI * pow(r,2);
   }
}
