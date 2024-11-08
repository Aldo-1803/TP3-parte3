package modelo;

/**
 * Implementación de Payment para procesar pagos por transferencia bancaria.
 */
public class BankTransferPayment implements Payment {

    @Override
    public void processPayment(float amount) {
        if (validarMonto(amount)) {
            System.out.println("Procesando pago por transferencia bancaria de $" + amount);
            realizarTransferencia(amount);
            System.out.println("Pago realizado con éxito.");
        } else {
            System.out.println("Error: el monto debe ser mayor a cero para procesar el pago.");
        }
    }
    /**
     * Valida que el monto a procesar sea mayor a cero.
     *
     * @param amount el monto a validar
     * @return true si el monto es mayor a cero, false en caso contrario
     */
    private boolean validarMonto(float amount) {
        return amount > 0;
    }

    /**
     * Realiza la transferencia bancaria.
     *
     * @param amount el monto a transferir
     */
    private void realizarTransferencia(float amount) {
        System.out.println("Realizando transferencia bancaria...");
    }
}
