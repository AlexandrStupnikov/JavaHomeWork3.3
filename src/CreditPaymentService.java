public class CreditPaymentService {
    public double calculate(double numberOfMonths) {

        int monthlyPayment;
        monthlyPayment = (int) (1000000*0.83*(1+Math.pow(1+0.83,numberOfMonths))/Math.pow(1+0.83,numberOfMonths)-1);
                return(monthlyPayment);
    }
}
