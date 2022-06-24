public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1000000; // Сумма кредита
        double interestRate = 9.99; // Процентная ставка
        int periodCredit = 12; // Срок кредита
        int monthlyPayment = service.calculate(creditAmount, interestRate, periodCredit);

        System.out.println(monthlyPayment + " Ежемесячный платеж");
    }
}
