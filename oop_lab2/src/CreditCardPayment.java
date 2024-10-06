import java.util.Scanner;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(double amount, String cardNumber, String cardHolder, String expiryDate, String cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment() throws Exception {
        System.out.println("Оплата " + amount + " через кредитну картку успішно виконана для " + cardHolder + ".");
    }

    public static CreditCardPayment getCreditCardPayment(Scanner scanner, double amount) {
        String cardNumber = Validator.validateCreditCardNumber(scanner);
        System.out.println("Введіть ім'я власника картки: ");
        String cardHolder = scanner.next();

        String expiryDate = Validator.validateExpiryDate(scanner);
        String cvv = Validator.validateCVV(scanner);

        return new CreditCardPayment(amount, cardNumber, cardHolder, expiryDate, cvv);
    }
}
