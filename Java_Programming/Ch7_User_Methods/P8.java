/*
Rewrite the Cable Company Billing programming example (from Chapter 4)
so that it uses the following methods to calculate the billing amount:
    a. residentialCustomer: This method calculates and returns the billing
    amount for the residential customer.
    b. businessCustomer: This method calculates and returns the billing
    amount for the service business customer.
*/

public class Main {
    public static void main(String[] args){

        Billing residence = new Billing();
        Billing business = new Billing();
        System.out.println(business.businessCustomer(10));
        System.out.println(business.businessCustomer(11));

        System.out.println(residence.residentialCustomer(10));

        

    }
    
    }

    
public class Billing {
    public double residentialCustomer(int premium){
        double billProcessingFee = 4.50;
        double basicServiceFee = 20.50;
        double premiumChannels = 7.50;
        double amountDue = 0.0;

        amountDue = billProcessingFee + basicServiceFee + premium * premiumChannels;

        return amountDue;
    }
    public double businessCustomer(int premium){
        double billProcessingFee = 15.00;
        double basicServiceFee = 75.90;
        double premiumChannels = 50.00;
        double additionalFee = 5.00;
        double amountDue = 0.0;


        if(premium > 10)
            amountDue =billProcessingFee + basicServiceFee + (premium - 10)*additionalFee
                    + premium * premiumChannels;
        else
            amountDue = billProcessingFee + basicServiceFee +premium * premiumChannels;
        return amountDue;
    }
}