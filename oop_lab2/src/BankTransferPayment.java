import java.util.Scanner;

public class BankTransferPayment extends Payment {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(double amount, String accountNumber, String bankName) {
        super(amount);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment() throws Exception {
        System.out.println("Оплата " + amount + " через банківський переказ успішно виконана для рахунку " + accountNumber + " у банку " + bankName + ".");
    }

    public static BankTransferPayment getBankTransferPayment(Scanner scanner, double amount) {
        String accountNumber = Validator.validateBankAccountNumber(scanner);
        System.out.println("Введіть назву банку: ");
        String bankName = scanner.next();
        return new BankTransferPayment(amount, accountNumber, bankName);
    }
}
