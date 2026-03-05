package abstractfactory;

/**
 * Implementación concreta del menú para llevar.
 */
public class MenuLlevar implements Menu {
    private String acompanamiento = "Sin acompañamiento";
    private static final double PRECIO_BASE = 12.0;

    @Override
    public void setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
    }

    @Override
    public String getDetalles() {
        return "Menú para Llevar: Entrante, Plato Principal (Acompañamiento: " + acompanamiento + "). [Sin postre]";
    }

    @Override
    public double getPrecio() {
        return PRECIO_BASE * 1.02; // Incremento del 2% por ser para llevar
    }
}
