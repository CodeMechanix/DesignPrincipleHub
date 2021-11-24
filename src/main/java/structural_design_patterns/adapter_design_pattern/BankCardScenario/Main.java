package structural_design_patterns.adapter_design_pattern.BankCardScenario;

public class Main {
    public static void main(String[] args) {
        new CombineAdapter("credit");
        new CombineAdapter("debit");
        new CombineAdapter("master");
        new CombineAdapter("test");
    }
}
