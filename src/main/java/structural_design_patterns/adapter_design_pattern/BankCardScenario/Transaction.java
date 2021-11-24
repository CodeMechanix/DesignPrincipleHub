package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public interface Transaction {
    void debitCardTransaction(String cardType);
    void creditCardTransaction(String cardType);
}
