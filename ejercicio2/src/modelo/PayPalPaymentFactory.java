package modelo;
/**
 * Clase concreta de fábrica que crea un método de pago mediante PayPal.
 */
public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
