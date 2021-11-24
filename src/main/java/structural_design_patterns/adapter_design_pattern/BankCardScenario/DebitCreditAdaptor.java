package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public class DebitCreditAdaptor {
    DebitClassTransactionImpl debitClassTransaction;
    CreditCardTransactionImpl creditCardTransaction;


    public DebitCreditAdaptor(String cardType) {
        if (cardType.equalsIgnoreCase("credit")) {
            creditCardTransaction = new CreditCardTransactionImpl();
            creditCardTransaction.creditCardTransaction(cardType);
        } else if (cardType.equalsIgnoreCase("debit")) {
            debitClassTransaction = new DebitClassTransactionImpl();
            debitClassTransaction.debitCardTransaction(cardType);
        } else {
            System.out.println("Invalid card type.");
        }
    }
}
