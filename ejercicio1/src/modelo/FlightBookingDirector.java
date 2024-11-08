package modelo;

public class FlightBookingDirector {
    
    /**
    * Construye una reserva de vuelo básica.
    *
    * @param builder el Builder para FlightBooking
    * @return una instancia de FlightBooking con configuración básica
    */

    public FlightBooking constructBasicBooking(FlightBookingBuilderInterface builder) {
        return builder.setAsiento("Económico")
                      .setEquipaje(1)
                      .setComida("Estándar")
                      .serviciosPremium(false)
                      .build();
    }

    /**
     * Construye una reserva de vuelo premium.
     *
     * @param builder el Builder para FlightBooking
     * @return una instancia de FlightBooking con configuración premium
     */
    public FlightBooking constructPremiumBooking(FlightBookingBuilderInterface builder) {
        return builder.setAsiento("Primera Clase")
                      .setEquipaje(3)
                      .setComida("Gourmet")
                      .serviciosPremium(true)
                      .build();
    }
}

