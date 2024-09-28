//  Write a program that converts a number entered in Roman numerals to
// decimal. Your program should consist of a class, say, Roman. An object of
// type Roman should do the following:
// a. Store the number as a Roman numeral.
// b. Convert and store the number into decimal.
// c. Print the number as a Roman numeral or decimal number as requested
// by the user.
// The decimal values of the Roman numerals are:
// M 1000
// D 500
// C 100
// L 50
// X 10
// V 5
// I 1
// d. Test your program using the following Roman numerals: MCXIV,
// CCCLIX, and MDCLXVI.

public class Main {
    public static void main(String[] args){

        Roman roman1 = new Roman("MCXIV");
        roman1.print(); 

        Roman roman2 = new Roman("CCCLIX");
        roman2.print(); 

        Roman roman3 = new Roman("MDCLXVI");
        roman3.print(); 

    }}

    public class Roman {
    private String romanNumeral;
    char[] romanic = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

    // Constructor to initialize the Roman numeral
    public Roman(String roman) {
        this.romanNumeral = roman.toUpperCase();
    }

    // Convert Roman numeral to decimal value
    public int romanConverter() {
        String roman = this.romanNumeral;
        int sum = 0;

        for (int i = 0; i < roman.length(); i++) {
            char letter = roman.charAt(i);

            // Check if the next character is larger, meaning subtractive notation
            if (i + 1 < roman.length() && decimalValues(letter) < decimalValues(roman.charAt(i + 1))) {
                sum -= decimalValues(letter);
            } else {
                sum += decimalValues(letter);
            }
        }

        return sum;
    }

    // Print the Roman numeral and its decimal equivalent
    public void print() {
        System.out.println("Roman numeral: " + this.romanNumeral);
        System.out.println("Decimal equivalent: " + romanConverter());
    }

    // Map Roman numeral characters to their decimal values
    public int decimalValues(char value) {
        switch (value) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0; // Handle unexpected characters
        }
    }

    // Check if a character is a valid Roman numeral
    public boolean contains(char[] array, char value) {
        for (char element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}