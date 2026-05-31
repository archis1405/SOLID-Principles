package LLD.SOLIDPrinciples.DIP.Payments;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
}
