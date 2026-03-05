package abstractfactory;

/**
 * Clase cliente que utiliza las factorías para crear pedidos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PEDIDOS DEL RESTAURANTE ===\n");

        System.out.println("--- Pedido en Local ---");
        // Se instancia la Factoría Concreta para pedidos en local
        RestauranteFactory localFactory = new LocalFactory();

        // Creación y configuración del Menú Local
        Menu menuLocal = localFactory.crearMenu();
        menuLocal.setAcompanamiento("Patatas");
        System.out.println(
                menuLocal.getDetalles() + "\n-> Precio base " + String.format("%.2f", menuLocal.getPrecio()) + "€\n");

        // Creación del Plato de Temporada Local
        PlatoTemporada platoLocal = localFactory.crearPlatoTemporada();
        System.out.println(
                platoLocal.getDetalles() + "\n-> Precio base " + String.format("%.2f", platoLocal.getPrecio()) + "€\n");

        System.out.println("-------------------------");

        System.out.println("--- Pedido para Llevar ---");
        // Se instancia la Factoría Concreta para pedidos para llevar
        RestauranteFactory llevarFactory = new ParaLlevarFactory();

        // Creación y configuración del Menú para Llevar
        Menu menuLlevar = llevarFactory.crearMenu();
        menuLlevar.setAcompanamiento("Ensalada");
        System.out.println(menuLlevar.getDetalles() + "\n-> Precio final (+2%): "
                + String.format("%.2f", menuLlevar.getPrecio()) + "€\n");

        // Creación del Plato de Temporada para Llevar
        PlatoTemporada platoLlevar = llevarFactory.crearPlatoTemporada();
        System.out.println(platoLlevar.getDetalles() + "\n-> Precio final (+2%): "
                + String.format("%.2f", platoLlevar.getPrecio()) + "€\n");
    }
}
