package abstractfactory;

/**
 * Factoría concreta que crea productos para consumir en local.
 */
public class LocalFactory implements RestauranteFactory {
    @Override
    public Menu crearMenu() {
        return new MenuLocal();
    }

    @Override
    public PlatoTemporada crearPlatoTemporada() {
        return new PlatoTemporadaLocal();
    }
}
