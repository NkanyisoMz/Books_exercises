// Design and implement the class Day that implements the day of the week
// in a program. The class Day should store the day, such as Sun for Sunday.
// The program should be able to perform the following operations on an
// object of type Day:
// a. Set the day.
// b. Print the day.
// c. Return the day.
// d. Return the next day.
// e. Return the previous day.
// f. Calculate and return the day by adding certain days to the current day.
// For example, if the current day is Monday and we add four days, the day
// to be returned is Friday. Similarly, if today is Tuesday and we add 13
// days, the day to be returned is Monday.
// g. Add the appropriate constructors.
// h. Write the definitions of the methods to implement the operations for the
// class Day, as defined in a through g.
// i. Write a program to test various operations on the class Day

public class Day {
    private String day;

    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    // Constructor with parameter to set day
    public Day(String d) {
        setDay(d);
    }

    // Default constructor sets day to Monday
    public Day() {
        day = "Monday";
    }

    // Method to set the day
    public void setDay(String d) {
        for (String validDay : days) {
            if (validDay.equals(d)) {
                day = d;
                return;
            }
        }
        System.out.println("Invalid day provided. Setting to default (Monday).");
        day = "Monday"; // Default to Monday if invalid day
    }

    // Method to print the current day
    public void printDay() {
        System.out.println(day);
    }

    // Method to return the current day
    public String getDay() {
        return day;
    }

    // Method to get the index of the current day
    private int getDayIndex() {
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                return i;
            }
        }
        return -1;
    }

    // Method to return the previous day
    public String getPreviousDay() {
        int index = getDayIndex();
        int prevIndex = (index - 1 + days.length) % days.length; // previous day index (with wrap-around)
        return days[prevIndex];
    }

    // Method to return the next day
    public String getNextDay() {
        int index = getDayIndex();
        int nextIndex = (index + 1) % days.length;
        return days[nextIndex];
    }

    // Method to calculate the day after adding a number of days
    public String dayCalculation(int num) {
        int index = getDayIndex();
        int newIndex = (index + num) % days.length;
        setDay(days[newIndex]);
        return days[newIndex];
    }

}


public class Main {

    public static void main(String[] args) {

        Day today = new Day("Wednesday");

        today.printDay();

        System.out.println("Next day: " + today.getNextDay());
        System.out.println("Previous day: " + today.getPreviousDay());

        System.out.println("Day after 4 days: " + today.dayCalculation(4));
        today.setDay("Monday");
        today.printDay();
        System.out.println("Day after 13 days: " + today.dayCalculation(13));
    }
}