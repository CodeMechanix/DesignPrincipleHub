package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public class DebitClassTransactionImpl implements Transaction {
    @Override
    public void debitCardTransaction(String cardType) {
        System.out.println("Transaction Completed from " + cardType + " card.");
    }

    @Override
    public void creditCardTransaction(String cardType) {
        // do nothing
    }
}
