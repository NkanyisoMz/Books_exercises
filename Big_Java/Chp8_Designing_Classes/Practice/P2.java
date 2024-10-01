//  Modify the giveChange method of the CashRegister class  so that
// it returns the number of coins of a particular type to return:
// int giveChange(Coin coinType)
// The caller needs to invoke this method for each coin type,
//  in decreasing value.

public class CashRegister
{
 . . .
 public void receivePayment(int coinCount, Coin coinType) { . . . }
 {
 payment = payment + coinCount * coinType.getValue();
 }
 public double giveChange()
{
double change = payment - purchase;
 purchase = 0;
 payment = 0;
 return change;
}
}