package abstractfactory;

/**
 * Factoría concreta que crea productos para llevar.
 */
public class ParaLlevarFactory implements RestauranteFactory {
    @Override
    public Menu crearMenu() {
        return new MenuLlevar();
    }

    @Override
    public PlatoTemporada crearPlatoTemporada() {
        return new PlatoTemporadaLlevar();
    }
}
