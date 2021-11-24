package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public class CreditCardTransactionImpl implements Transaction {
    @Override
    public void debitCardTransaction(String cardType) {
        // nothing do
    }

    @Override
    public void creditCardTransaction(String cardType) {
        System.out.println("Transaction Completed from " + cardType + " card.");
    }
}
