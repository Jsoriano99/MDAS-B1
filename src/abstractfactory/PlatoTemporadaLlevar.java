package abstractfactory;

/**
 * Implementación concreta del plato de temporada para llevar.
 */
public class PlatoTemporadaLlevar implements PlatoTemporada {
    private static final double PRECIO_BASE = 10.0;

    @Override
    public String getDetalles() {
        return "Plato de Temporada para Llevar.";
    }

    @Override
    public double getPrecio() {
        return PRECIO_BASE * 1.02; // Incremento del 2%
    }
}
