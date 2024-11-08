import modelo.*;

/**
 * Clase principal que inicia la aplicación y realiza registros en el archivo de log mediante la instancia única de Logger.
 */
public class Main {
    public static void main(String[] args) {
        // Inicializar la aplicación
        iniciarAplicacion();
    }

    /**
     * Inicializa y registra eventos de la aplicación.
     */
    private static void iniciarAplicacion() {
        Logger logger = Logger.getInstance();  // Obtener la instancia única de Logger

        // Registrar mensajes informativos
        logger.logInfo("Inicio de la aplicación");

        try {
            // operaciones iniciales de la aplicación
            realizarOperaciones(logger);
            
            // Registrar mensaje de finalización exitosa
            logger.logInfo("Aplicación finalizada con éxito.");
        } catch (Exception e) {
            logger.logError("Excepción inesperada: " + e.getMessage());
        }
    }
    
    /**
     * Realiza operaciones de la aplicación y registra eventos en el log.
     * @param logger La instancia única de Logger utilizada para registrar los eventos.
     */
    private static void realizarOperaciones(Logger logger) {
        // Ejemplo de operaciones y sus respectivos registros
        logger.logInfo("Conectando a servicios necesarios..."); 
        logger.logWarning("Posible uso excesivo de memoria detectado.");
        logger.logError("No se pudo conectar a la base de datos.");
    }
}
