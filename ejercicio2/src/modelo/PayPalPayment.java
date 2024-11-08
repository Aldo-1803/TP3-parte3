package modelo;

/**
 * Implementación de Payment para procesar pagos mediante PayPal.
 */
public class PayPalPayment implements Payment {
    
    @Override
    public void processPayment(float monto) {
        System.out.println("Procesando pago mediante PayPal por $" + monto);
    }
}
