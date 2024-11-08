package modelo;

/**
 * Clase concreta de fábrica que crea un método de pago por transferencia bancaria.
 */
public class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}
