public class CreditCardProcessor implements Payment {
    @Override
    public void pay (double amount) {
        System.out.println("Pago con método Credit Card por " + amount);
    }
}