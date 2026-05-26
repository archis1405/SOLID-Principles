package LLD.SOLIDPrinciples.ISP.CreditCardPayments.BetterCode;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    /*
        Now in this abstract class we are only having those behaviours that are absolutely mandatory
        for every card.
        Example: UPI is not supported by all cards so we did not keep it in the abstract class
     */

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
}
