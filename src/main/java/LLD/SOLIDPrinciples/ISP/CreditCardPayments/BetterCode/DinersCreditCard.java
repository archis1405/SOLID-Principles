package LLD.SOLIDPrinciples.ISP.CreditCardPayments.BetterCode;

public class DinersCreditCard extends CreditCard implements InternationalWithoutPIN{
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    @Override
    public void swipeAndPay(){
        System.out.println("DinersCreditCard swipe and PAY");
    }

    @Override
    public void onlinePayment() {
        System.out.println("DinersCreditCard Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("DinersCreditCard TAP and PAY");
    }

    @Override
    public void internationalPayment() {
        System.out.println("VISA supports international without pin");
    }
}
