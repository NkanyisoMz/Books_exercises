// Implement the Coin class described in Section 8.2. 
// Modify the CashRegister class so that coins can be added to the cash register, 
// by supplying a method void receivePayment(int coinCount, Coin coinType)
// The caller needs to invoke this method multiple times, 
// once for each type of coin that is present in the payment.

public class Coin
{
 . . .
 public Coin(double aValue, String aName) { . . . }
 public double getValue() { . . . }
 . . .
} 

public class CashRegister
{
 . . .
 public void receivePayment(int coinCount, Coin coinType) { . . . }
 {
 payment = payment + coinCount * coinType.getValue();
 }
 . . .
}