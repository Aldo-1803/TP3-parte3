/**
 * Clase principal para demostrar el uso del patrón Builder.
 */
import modelo.*;

public class Main {
    public static void main(String[] args) {
        FlightBookingDirector director = new FlightBookingDirector();
        
        // Crear una reserva básica
        Builder builder = new Builder();
        FlightBooking basicBooking = director.constructBasicBooking(builder);
        System.out.println(basicBooking);

        // Crear una reserva premium
        builder = new Builder(); // Crear un nuevo builder para la segunda reserva
        FlightBooking premiumBooking = director.constructPremiumBooking(builder);
        System.out.println(premiumBooking);
    }
}
