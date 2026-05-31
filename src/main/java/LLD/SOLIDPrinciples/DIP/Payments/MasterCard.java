package LLD.SOLIDPrinciples.DIP.Payments;

public class MasterCard extends CreditCard implements RefundCompatibleCreditCard{

    public SameInstrumentRefund refundAlgorithm;

    @Override
    public void onlinePayment() {
        System.out.println("VISA Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("VISA TAP and PAY");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Visa Swipe and pay");
    }

    @Override
    public void refundAmount() {
        System.out.println("ALGO-1");
        refundAlgorithm.doRefund();
    }
}
