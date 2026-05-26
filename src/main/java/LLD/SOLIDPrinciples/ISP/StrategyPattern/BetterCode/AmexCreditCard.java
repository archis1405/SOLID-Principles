package LLD.SOLIDPrinciples.ISP.StrategyPattern.BetterCode;

public class AmexCreditCard extends CreditCard implements RefundCompatible, InternationalWithoutPIN {
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private int cvv;

    private RefundStrategy refundStrategy;

    public AmexCreditCard(){
        //AMEX Credit card can have only bank refunds
        this.refundStrategy = new BankAccountRefundStrategy();
    }

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
        this.refundStrategy.doRefund();
    }

    @Override
    public void internationalPayment() {
        System.out.println("VISA supports international without pin");
    }
}
