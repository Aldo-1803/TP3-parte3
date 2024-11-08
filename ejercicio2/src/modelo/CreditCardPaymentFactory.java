package modelo;
/**
 * Clase concreta de fábrica que crea un método de pago mediante tarjeta de crédito.
 */
public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
