package LLD.SOLIDPrinciples.ISP.CreditCardPayments.BetterCode;

public class VisaCreditCard extends CreditCard implements RefundCompatible,InternationalWithoutPIN{
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    @Override
    public void swipeAndPay(){
        System.out.println("VISA swipe and PAY");
    }

    @Override
    public void onlinePayment() {
        System.out.println("VISA Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("VISA TAP and PAY");
    }

    @Override
    public void doRefund() {
        System.out.println("Visa is REFUND Compatible");
    }

    @Override
    public void internationalPayment() {
        System.out.println("VISA supports international without pin");
    }
}
