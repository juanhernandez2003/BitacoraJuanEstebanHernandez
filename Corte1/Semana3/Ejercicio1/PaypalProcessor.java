public class PaypalProcessor implements Payment{
    @Override
    public void pay (double amount) {
        System.out.println("Pago con método PayPal por " + amount);
    }
}