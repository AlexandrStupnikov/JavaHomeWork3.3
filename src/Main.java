public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment = (int) service.calculate(12);
        System.out.println(monthlyPayment);
    }
}