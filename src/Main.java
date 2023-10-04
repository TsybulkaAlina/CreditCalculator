public class Main {

    public static void main(String[] args) {
        CreditPaymentService paymentService = new CreditPaymentService();

        double loanAmount = 1000000; // Cумма кредита в рублях
        double interestRate = 9.99; // Годовая процентная ставка
        int loanTerm1 = 1;  // Срок кредита в годах
        int loanTerm2 = 2;
        int loanTerm3 = 3;

        double monthlyPayment1 = paymentService.calculatePayment(loanAmount, interestRate, loanTerm1);
        double monthlyPayment2 = paymentService.calculatePayment(loanAmount, interestRate, loanTerm2);
        double monthlyPayment3 = paymentService.calculatePayment(loanAmount, interestRate, loanTerm3);

        System.out.println("Ежемесячный платеж на 1 год: " + monthlyPayment1 + " рублей");
        System.out.println("Ежемесячный платеж на 2 года: " + monthlyPayment2 + " рублей");
        System.out.println("Ежемесячный платеж на 3 года: " + monthlyPayment3 + " рублей");

        // Ежемесячный платеж на 1 год: 87911.0 рублей
        // Ежемесячный платеж на 2 года: 46140.0 рублей
        // Ежемесячный платеж на 3 года: 32262.0 рублей
    }
}
