import java.util.Scanner;

public class Validator {
    // Метод для перевірки номера кредитної картки
    public static String validateCreditCardNumber(Scanner scanner) {
        String cardNumber;
        while (true) {
            System.out.println("Введіть номер кредитної картки (16 цифр): ");
            cardNumber = scanner.next();
            if (cardNumber.matches("\\d{16}")) {
                return cardNumber;
            } else {
                System.out.println("Невірний номер кредитної картки. Спробуйте ще раз.");
            }
        }
    }

    // Метод для перевірки терміна дії картки
    public static String validateExpiryDate(Scanner scanner) {
        String expiryDate;
        while (true) {
            System.out.println("Введіть термін дії картки (MM/YY): ");
            expiryDate = scanner.next();
            if (expiryDate.matches("(0[1-9]|1[0-2])/\\d{2}")) {
                return expiryDate;
            } else {
                System.out.println("Невірний термін дії картки. Спробуйте ще раз.");
            }
        }
    }

    // Метод для перевірки CVV
    public static String validateCVV(Scanner scanner) {
        String cvv;
        while (true) {
            System.out.println("Введіть CVV-код (3 цифри): ");
            cvv = scanner.next();
            if (cvv.matches("\\d{3}")) {
                return cvv;
            } else {
                System.out.println("Невірний CVV-код. Спробуйте ще раз.");
            }
        }
    }

    // Метод для перевірки email
    public static String validateEmail(Scanner scanner) {
        String email;
        while (true) {
            System.out.println("Введіть email PayPal аккаунту: ");
            email = scanner.next();
            if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
                return email;
            } else {
                System.out.println("Невірний email. Спробуйте ще раз.");
            }
        }
    }

    // Метод для перевірки пароля
    public static String validatePassword(Scanner scanner) {
        String password;
        while (true) {
            System.out.println("Введіть пароль PayPal (мінімум 8 символів): ");
            password = scanner.next();
            if (password.length() >= 8) {
                return password;
            } else {
                System.out.println("Пароль повинен містити щонайменше 8 символів. Спробуйте ще раз.");
            }
        }
    }

    // Метод для перевірки номера банківського рахунку
    public static String validateBankAccountNumber(Scanner scanner) {
        String accountNumber;
        while (true) {
            System.out.println("Введіть номер банківського рахунку (мінімум 10 цифр): ");
            accountNumber = scanner.next();
            if (accountNumber.matches("\\d{10,}")) {
                return accountNumber;
            } else {
                System.out.println("Невірний номер банківського рахунку. Спробуйте ще раз.");
            }
        }
    }
}
