package abstractfactory;

/**
 * Interfaz que representa el producto PlatoTemporada del Abstract Factory.
 */
public interface PlatoTemporada {
    /**
     * Muestra los detalles del plato de temporada.
     * @return Cadena con los detalles del plato.
     */
    String getDetalles();

    /**
     * Obtiene el precio final del plato de temporada, aplicando incrementos si los hay.
     * @return El precio del plato.
     */
    double getPrecio();
}
