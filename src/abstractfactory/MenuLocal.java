package abstractfactory;

/**
 * Implementación concreta del menú para servir en local.
 */
public class MenuLocal implements Menu {
    private String acompanamiento = "Sin acompañamiento";
    private static final double PRECIO_BASE = 15.0;

    @Override
    public void setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
    }

    @Override
    public String getDetalles() {
        return "Menú en Local: Entrante, Plato Principal (Acompañamiento: " + acompanamiento + "), Postre.";
    }

    @Override
    public double getPrecio() {
        return PRECIO_BASE;
    }
}
