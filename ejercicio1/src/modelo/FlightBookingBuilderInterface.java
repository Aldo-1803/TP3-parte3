package modelo;

/**
 * Clase que dirige la construcción de reservas de vuelo con configuraciones específicas.
 */
public interface FlightBookingBuilderInterface {
    FlightBookingBuilderInterface setAsiento(String asiento);
    FlightBookingBuilderInterface setEquipaje(int equipaje);
    FlightBookingBuilderInterface setComida(String comida);
    FlightBookingBuilderInterface serviciosPremium(boolean servicesPremium);
    FlightBooking build();
}
