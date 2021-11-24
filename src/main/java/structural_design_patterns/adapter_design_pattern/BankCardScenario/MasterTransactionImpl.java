package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public class MasterTransactionImpl implements MasterTransaction {
    @Override
    public void masterCardTransaction(String cardType) {
        System.out.println("Transaction Completed from " + cardType + " card.");
    }
}
