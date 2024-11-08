import modelo.*;
/**
 * Clase principal para demostrar el uso del patrón Factory Method.
 */
public class Main {
    public static void main(String[] args) {
        // Creación de pago mediante tarjeta de crédito
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = creditCardFactory.createPayment();
        creditCardPayment.processPayment(100.0f);
        
        // Creación de pago mediante PayPal
        PaymentFactory payPalFactory = new PayPalPaymentFactory();
        Payment payPalPayment = payPalFactory.createPayment();
        payPalPayment.processPayment(200.0f);

        // Creación de pago mediante transferencia bancaria
        PaymentFactory bankTransferFactory = new BankTransferPaymentFactory();
        Payment bankTransferPayment = bankTransferFactory.createPayment();
        bankTransferPayment.processPayment(300.0f);
    }
}
