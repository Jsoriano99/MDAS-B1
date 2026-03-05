package abstractfactory;

/**
 * Interfaz de la Factoría Abstracta para la creación de productos.
 */
public interface RestauranteFactory {
    /**
     * Crea una instancia de Menu.
     * 
     * @return instacia de Menu.
     */
    Menu crearMenu();

    /**
     * Crea una instancia de PlatoTemporada.
     * 
     * @return instancia de PlatoTemporada.
     */
    PlatoTemporada crearPlatoTemporada();
}
