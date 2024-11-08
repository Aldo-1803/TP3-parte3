package modelo;
/**
 * Interfaz que representa un método de pago.
 */
public interface Payment {
    /**
     * Procesa un pago con el monto especificado.
     *
     * @param amount el monto a procesar
     */

    void processPayment(float amount);
}
