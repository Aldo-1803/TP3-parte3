package modelo;
/**
 * Implementación de Payment para procesar pagos mediante tarjeta de crédito.
 */
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(float amount) {
        System.out.println("Procesando pago de Tarjeta de credito de $" + amount);
    }
}
