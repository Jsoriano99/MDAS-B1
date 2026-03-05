package abstractfactory;

/**
 * Interfaz que representa el producto Menu del Abstract Factory.
 */
public interface Menu {
    /**
     * Permite elegir el acompañamiento para el plato principal (e.g. Ensalada o Patatas).
     * @param acompanamiento El tipo de acompañamiento.
     */
    void setAcompanamiento(String acompanamiento);

    /**
     * Muestra el desglose de los platos que componen el menú.
     * @return Cadena con los detalles del menú.
     */
    String getDetalles();

    /**
     * Obtiene el precio final del menú, aplicando incrementos si los hay.
     * @return El precio del menú.
     */
    double getPrecio();
}
