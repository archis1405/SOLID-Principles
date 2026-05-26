package LLD.SOLIDPrinciples.ISP.StrategyPattern.BetterCode;

public class BankAccountRefundStrategy implements RefundStrategy{
    @Override
    public void doRefund() {
        System.out.println("Returns to the bank account");
    }
}
