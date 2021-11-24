package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public class CombineAdapter {
    MasterTransactionImpl masterTransaction;

    public CombineAdapter(String cardType) {
        if (cardType.equalsIgnoreCase("credit") || cardType.equalsIgnoreCase("debit")) {
            new DebitCreditAdaptor(cardType);
        } else if (cardType.equalsIgnoreCase("master")) {
            masterTransaction = new MasterTransactionImpl();
            masterTransaction.masterCardTransaction(cardType);
        } else {
            System.out.println("Invalid Card Type.");
        }
    }
}
