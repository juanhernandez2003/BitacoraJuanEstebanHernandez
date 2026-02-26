public class BankTransferProcessor implements Payment{
    @Override
    public void pay (double amount) {
        System.out.println("Pago con método Bank Transfer por " + amount);
    }
}