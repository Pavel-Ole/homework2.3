public class CreditPaymentService {
    public double calculate(double sum, double n) {
        double annualRate = 9.99;
        double numberOfMonths = 12;
        double m = annualRate / numberOfMonths / 100;
        double a = Math.pow((1 + m), n);
        double k = m * a / (a - 1);
        double payment = sum * k;
        return payment;
    }
}
