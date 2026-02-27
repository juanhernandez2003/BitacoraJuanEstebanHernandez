public abstract class PaymentProcessor{

    public abstract payment createPayment();

    public void processPayment(double amount){
        Payment p = new Payment();
        p.pay(amount);
    }
}