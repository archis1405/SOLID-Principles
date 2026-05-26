package LLD.SOLIDPrinciples.ISP.CreditCardPayments.BetterCode;

public class MasterCard extends CreditCard implements RefundCompatible,InternationalWithPIN{
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    @Override
    public void swipeAndPay(){
        System.out.println("MASTERCARD swipe and PAY");
    }

    @Override
    public void onlinePayment() {
        System.out.println("MASTERCARD Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("MASTERCARD TAP and PAY");
    }

    @Override
    public void doRefund() {
        System.out.println("MasterCard is refund compatible");
    }

    @Override
    public void internationalPaymentwithPIN() {
        System.out.println("Mastercard requires PIN for international Payment");
    }
}
