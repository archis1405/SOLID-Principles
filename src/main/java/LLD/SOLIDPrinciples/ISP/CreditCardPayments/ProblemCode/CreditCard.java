package LLD.SOLIDPrinciples.ISP.CreditCardPayments.ProblemCode;

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    public abstract void swipeAndPay();

    /*
        Refund is not supported by the Diners Credit Card , So the diners credit card must nor implement
        this method in Diners Credit Card will throw an error
     */
    public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void tapAndPay();

    /*
        International payment is only supported by VISA Card, Master-Card, AMEX and Diners
        so RUPAY Card cannot use the method and it will throw an error

        Another Scenarion :
        For International Payments, MasterCard expects a PIN but no outer card needs a PIN

        so International payments work similarly in VISA, Diners and AMEX Credit Card, but has a diiferent
        algorithm for Master card and will throw exception in RUPAY
     */
    public abstract void intlPayment();

    /*
        UPI credit card payments is only supported by RUPAY Card so only rupay card needs to implement the method.
        So we only implement this additional method in the rupay credit card class not here

        There are issues with this approach :
           What if Government of India makes it mandatory for all credit cards to make UPI payment then the base
           class i.e. this class will be changed or we need to implement the upiPayment in all the
           credit card classes
     */
    // public abstract void upiPayment();


}
