// Abstract parent class
abstract class PaymentGateway{
    void printReceipt(){
        System.out.println("Receipt generated.");
    }
    // abstract method:No body,Child must implement this
    abstract void proceesPayment(double amount);
}
// concrete Child class 2
class UPIPayment extends PaymentGateway{
    @Override 
    void proceesPayment(double amount){
        System.out.println("Processing RS"+amount+"via UPI QR code");
    }
}
class CreditCardPayment extends PaymentGateway{
    @Override 
    void proceesPayment(double amount){
        System.out.println("Processing rs"+amount+"via card swipe and OTP");
    }
}
public class Abstraction {
    public static void main(String[] args){
        // PaymentGateway p= new PaymentGateway();  ERROR: cannot instantiate abstract class!
    PaymentGateway payment =new UPIPayment();
    payment.proceesPayment(250.0);
    payment.printReceipt();
    }
    
}
