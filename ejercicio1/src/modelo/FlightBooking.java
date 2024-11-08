package modelo;

/**
 * Clase que representa una reserva de vuelo.
 */
public class FlightBooking {
    private String asiento;
    private int equipaje;
    private String comida;
    private boolean servicesPremium;

     /**
     * Constructor privado para el patrón Builder.
     *
     * @param asiento         el asiento seleccionado para la reserva
     * @param equipaje        la cantidad de equipaje permitido
     * @param comida          el tipo de comida seleccionado
     * @param servicesPremium indica si se incluyen servicios premium
     */
    private FlightBooking(String asiento, int equipaje, String comida, boolean servicesPremium) {
        this.asiento = asiento;
        this.equipaje = equipaje;
        this.comida = comida;
        this.servicesPremium = servicesPremium;
    }

    
    /**
     * Obtiene el asiento seleccionado.
     *
     * @return el asiento seleccionado
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Obtiene la cantidad de equipaje permitido.
     *
     * @return la cantidad de equipaje
     */
    public int getEquipaje() {
        return equipaje;
    }
    
    /**
     * Obtiene el tipo de comida seleccionada.
     *
     * @return el tipo de comida
     */
    public String getComida() {
        return comida;
    }

    /**
     * Verifica si se han incluido servicios premium.
     *
     * @return true si hay servicios premium; false en caso contrario
     */
    public boolean hasServicesPremium() {
        return servicesPremium;
    }

    @Override
    public String toString() {
        return "FlightBooking [Asiento=" + asiento + ", Equipaje=" + equipaje +
                ", Comida=" + comida + ", Servicios Premium=" + servicesPremium + "]";
    }

    /**
     * Clase Builder para construir instancias de FlightBooking.
     */
    public static class Builder implements FlightBookingBuilderInterface {
        private String asiento;
        private int equipaje;
        private String comida;
        private boolean servicesPremium;

        /**
         * Configura el asiento para la reserva.
         *
         * @param asiento el asiento a seleccionar
         * @return la instancia actual del Builder
         */
        @Override
        public Builder setAsiento(String asiento) {
            this.asiento = asiento;
            return this;
        }

        /**
         * Configura la cantidad de equipaje.
         *
         * @param equipaje la cantidad de equipaje a incluir
         * @return la instancia actual del Builder
         */
        @Override
        public Builder setEquipaje(int equipaje) {
            this.equipaje = equipaje;
            return this;
        }

        /**
         * Configura el tipo de comida.
         *
         * @param comida el tipo de comida a incluir
         * @return la instancia actual del Builder
         */
        @Override
        public Builder setComida(String comida) {
            this.comida = comida;
            return this;
        }

        /**
         * Configura el tipo de comida.
         *
         * @param comida el tipo de comida a incluir
         * @return la instancia actual del Builder
         */
        @Override
        public Builder serviciosPremium(boolean servicesPremium) {
            this.servicesPremium = servicesPremium;
            return this;
        }

         /**
         * Construye y retorna una instancia de FlightBooking con las configuraciones
         * proporcionadas.
         *
         * @return una nueva instancia de FlightBooking
         */
        @Override
        public FlightBooking build() {
            return new FlightBooking(asiento, equipaje, comida, servicesPremium);
        }
    }
}