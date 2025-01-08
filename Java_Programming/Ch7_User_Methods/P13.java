/*
Write a program that takes as input five numbers and outputs the mean
(average) and standard deviation of the numbers. If the numbers are x1, x2,
x3, x4, and x5, then the mean is x ¼ (x1 + x2 + x3+ x4 + x5) / 5 and the
standard deviation is:

s = sqrt(((x1-x)^2 + (x2-x)^2 + (x3-x)^2 + (x4-x)^2 + (x5-x)^2)/5)

Your program must contain at least the following method: A method that
calculates and returns the mean and a method that calculates the standard
deviation.
*/

public class Main {
    public static void main(String[] args){

        
double [] numbers = {1,2,3,4,5,6};
        System.out.println("Mean: " + mean(numbers));
        System.out.println(("Standard deviation: " + stdDev(numbers)));
    }
    public static double mean(double... numbers){
        double sum = 0;
        for(double num : numbers){
            sum +=sum;
        }
        return sum/numbers.length;
    }
    public static double stdDev(double... numbers){
        double meanValue= mean(numbers);
        double sumOfSquares = 0;
        for (double num : numbers) {
            double deviation = num - meanValue;
            sumOfSquares += deviation * deviation;
        }
        return Math.sqrt(sumOfSquares/numbers.length);
        }
}