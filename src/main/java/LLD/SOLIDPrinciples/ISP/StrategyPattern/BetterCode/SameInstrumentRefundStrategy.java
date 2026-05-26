package LLD.SOLIDPrinciples.ISP.StrategyPattern.BetterCode;

public class SameInstrumentRefundStrategy implements RefundStrategy{
    @Override
    public void doRefund() {
        System.out.println("Refunding to the same payment card");
    }
}
