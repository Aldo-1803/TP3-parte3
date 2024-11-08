package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase Logger implementa el patrón Singleton para registrar mensajes de log en un archivo único.
 * Permite registrar mensajes de información, advertencia y error en el archivo de log.
 */
public class Logger {
    // Instancia estática única del Logger
    private static Logger instance;
    private static final String LOG_FILE = "aplicacion.log";

    /**
     * Constructor privado para evitar la creación de instancias adicionales.
     */
    private Logger() {}

    /**
     * Obtiene la instancia única de Logger.
     * @return La instancia única de Logger.
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Registra un mensaje informativo en el archivo de log.
     * @param mensaje El mensaje de información a registrar.
     */
    public void logInfo(String mensaje) {
        escribirLog("INFO", mensaje);
    }

    /**
     * Registra un mensaje de advertencia en el archivo de log.
     * @param mensaje El mensaje de advertencia a registrar.
     */
    public void logWarning(String mensaje) {
        escribirLog("WARNING", mensaje);
    }

    /**
     * Registra un mensaje de error en el archivo de log.
     * @param mensaje El mensaje de error a registrar.
     */
    public void logError(String mensaje) {
        escribirLog("ERROR", mensaje);
    }

    /**
     * Escribe un mensaje en el archivo de log, con un nivel de severidad y una marca de tiempo.
     * @param nivel El nivel de severidad del mensaje (INFO, WARNING, ERROR).
     * @param mensaje El mensaje a registrar.
     */
    private void escribirLog(String nivel, String mensaje) {
        String timestamp = obtenerMarcaDeTiempo();
        String mensajeFormateado = String.format("[%s] %s: %s", timestamp, nivel, mensaje);
        
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(mensajeFormateado + "\n");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }

    /**
     * Obtiene la marca de tiempo actual con el formato "yyyy-MM-dd HH:mm:ss".
     * @return La marca de tiempo actual como cadena de texto.
     */
    private String obtenerMarcaDeTiempo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
