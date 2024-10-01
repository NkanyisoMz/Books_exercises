//  Redo Example 7-3, Chapter 7, so that it uses the class RollDie 
//  to roll a die.
public class RollDie {

    //simulates rolling a single die.
    public int roll() {
        return (int) (Math.random() * 6) + 1;  // Returns a random number between 1 and 6
    }
}


public class RollDice {

    private int number;
    private RollDie die;  //instance of RollDie

    
    public RollDice() {
        setNumber(2);
        die = new RollDie(); 
    }

    
    public RollDice(int num) {
        setNumber(num);
        die = new RollDie();  
    }

    
    public void setNumber(int num) {
        number = num;
    }

    
    public int getNumber() {
        return number;
    }

    
    public int rollDice() {
        int die1;
        int die2;
        int sum;
        int rollCount = 0;

        do {
            die1 = die.roll();  // Use the RollDie class to roll the first die
            die2 = die.roll();  // Use the RollDie class to roll the second die
            sum = die1 + die2;
            rollCount++;
        } while (sum != number);

        return rollCount;  // Return the number of rolls taken to reach the sum
    }

    public static void main(String[] args) {
        RollDice diceGame10 = new RollDice(10);  
        RollDice diceGame6 = new RollDice(6);    

        System.out.println("The number of times the dice are rolled to get the sum 10 = " + diceGame10.rollDice());
        System.out.println("The number of times the dice are rolled to get the sum 6 = " + diceGame6.rollDice());
    }
}
