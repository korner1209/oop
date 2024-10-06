import java.util.Scanner;

public class PayPalPayment extends Payment {
    private String email;
    private String password;

    public PayPalPayment(double amount, String email, String password) {
        super(amount);
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment() throws Exception {
        System.out.println("Оплата " + amount + " через PayPal успішно виконана для " + email + ".");
    }

    public static PayPalPayment getPayPalPayment(Scanner scanner, double amount) {
        String email = Validator.validateEmail(scanner);
        String password = Validator.validatePassword(scanner);
        return new PayPalPayment(amount, email, password);
    }
}
