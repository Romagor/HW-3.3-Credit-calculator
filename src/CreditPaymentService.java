public class CreditPaymentService {
    public int calculate(int creditAmount, double interestRate, int periodCredit) {

        double interestRateMonth = interestRate / (100 * 12);
        double n = 1 + interestRateMonth;
        int powN = periodCredit * (-1);
        double k = interestRateMonth / (1 - Math.pow(n, powN));

        int monthlyPayment;

        monthlyPayment = (int) (creditAmount * k);

        return monthlyPayment;
    }
}
