package LLD.SOLIDPrinciples.ISP.StrategyPattern.BetterCode;

public class RupayCreditCard extends CreditCard implements UPICompatibleCreditCard, RefundCompatible {

    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    @Override
    public void swipeAndPay(){
        System.out.println("RUPAY swipe and PAY");
    }

    @Override
    public void onlinePayment() {
        System.out.println("RUPAY Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("RUPAY TAP and PAY");
    }

    @Override
    public void upiPayment() {
        System.out.println("RUPAY is UPI compatible");
    }

    @Override
    public void doRefund() {
        System.out.println("RUPAY is refund compatible");
    }
}
