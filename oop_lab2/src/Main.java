import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = 0;
        do {
            System.out.println("Введіть суму для оплати: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Помилка: введіть числове значення!");
                scanner.next();
            }
            amount = scanner.nextDouble();
        } while (amount <= 0);

        System.out.println("Оберіть метод оплати: ");
        System.out.println("1. Кредитна картка");
        System.out.println("2. PayPal");
        System.out.println("3. Банківський переказ");
        int choice = 0;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Помилка: введіть число від 1 до 3.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);
        Payment payment = null;


        try {
            switch (choice) {
                case 1:
                    payment = CreditCardPayment.getCreditCardPayment(scanner, amount);
                    break;
                case 2:
                    payment = PayPalPayment.getPayPalPayment(scanner, amount);
                    break;
                case 3:
                    payment = BankTransferPayment.getBankTransferPayment(scanner, amount);
                    break;
            }

            if (payment != null) {
                payment.processPayment();
            }
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        scanner.close();
    }
}
