package modelo;
/**
 * Clase abstracta de fábrica que define un método de creación para los pagos.
 */
public abstract class PaymentFactory {
    /**
     * Crea un método de pago específico.
     *
     * @return una instancia de la implementación de Payment deseada
     */
    public abstract Payment createPayment();
}
