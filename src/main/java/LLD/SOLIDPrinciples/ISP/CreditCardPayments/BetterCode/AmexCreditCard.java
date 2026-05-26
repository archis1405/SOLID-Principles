package LLD.SOLIDPrinciples.ISP.CreditCardPayments.BetterCode;

public class AmexCreditCard extends CreditCard implements RefundCompatible,InternationalWithoutPIN{
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    @Override
    public void swipeAndPay(){
        System.out.println("AmexCreditCard swipe and PAY");
    }

    @Override
    public void onlinePayment() {
        System.out.println("AmexCreditCard Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("AmexCreditCard TAP and PAY");
    }

    @Override
    public void doRefund() {
        System.out.println("AMEX is refund compatible");
    }

    @Override
    public void internationalPayment() {
        System.out.println("VISA supports international without pin");
    }
}
