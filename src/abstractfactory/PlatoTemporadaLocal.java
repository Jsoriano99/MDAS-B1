package abstractfactory;

/**
 * Implementación concreta del plato de temporada servido en local.
 */
public class PlatoTemporadaLocal implements PlatoTemporada {
    private static final double PRECIO_BASE = 10.0;

    @Override
    public String getDetalles() {
        return "Plato de Temporada servido en Local.";
    }

    @Override
    public double getPrecio() {
        return PRECIO_BASE;
    }
}
