package abstractfactory;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase cliente que interactúa con el usuario a través de consola
 * utilizando el patrón Abstract Factory.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== BIENVENIDO AL SISTEMA DE PEDIDOS ===\n");

        RestauranteFactory factory = null;
        int tipoConsumo = -1;

        // Bucle para preguntar el tipo de consumo (Local o Llevar)
        while (tipoConsumo != 1 && tipoConsumo != 2) {
            System.out
                    .print("¿Dónde desea consumir su pedido?\n1. En Local\n2. Para Llevar\nElija una opción (1 o 2): ");
            try {
                tipoConsumo = scanner.nextInt();
                if (tipoConsumo == 1) {
                    factory = new LocalFactory();
                    System.out.println("\n-> Has seleccionado: Consumo en Local.");
                } else if (tipoConsumo == 2) {
                    factory = new ParaLlevarFactory();
                    System.out.println("\n-> Has seleccionado: Pedido Para Llevar (+2% cargo extra).");
                } else {
                    System.out.println("\n[ERROR] Opción no válida. Por favor, ingrese 1 o 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Entrada inválida. Debe introducir un número (1 o 2).\n");
                scanner.next(); // Limpiar el buffer
            }
        }

        System.out.println("\n----------------------------------------");

        int tipoProducto = -1;
        // Bucle para seleccionar el producto (Menú completo o Plato de temporada)
        while (tipoProducto != 1 && tipoProducto != 2) {
            System.out.print("¿Qué desea pedir?\n1. Menú Completo\n2. Plato de Temporada\nElija una opción (1 o 2): ");
            try {
                tipoProducto = scanner.nextInt();
                if (tipoProducto == 1) {
                    // Creación del Menú
                    Menu menu = factory.crearMenu();
                    int tipoAcompanamiento = -1;

                    System.out.println("\n-> Has seleccionado: Menú Completo.");

                    // Preguntar acompañamiento
                    while (tipoAcompanamiento != 1 && tipoAcompanamiento != 2) {
                        System.out.print(
                                "¿Desea Ensalada o Patatas como acompañamiento del plato principal?\n1. Ensalada\n2. Patatas\nElija una opción (1 o 2): ");
                        try {
                            tipoAcompanamiento = scanner.nextInt();
                            if (tipoAcompanamiento == 1) {
                                menu.setAcompanamiento("Ensalada");
                            } else if (tipoAcompanamiento == 2) {
                                menu.setAcompanamiento("Patatas");
                            } else {
                                System.out.println("\n[ERROR] Opción no válida. Por favor, ingrese 1 o 2.\n");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\n[ERROR] Entrada inválida. Debe introducir un número (1 o 2).\n");
                            scanner.next(); // Limpiar el buffer
                        }
                    }

                    // Imprimir el resumen del menú
                    System.out.println("\n=== RESUMEN DE TU PEDIDO ===");
                    System.out.println(menu.getDetalles());
                    System.out.println("-> Total a pagar: " + String.format("%.2f", menu.getPrecio()) + "€");

                } else if (tipoProducto == 2) {
                    // Creación del Plato de Temporada
                    PlatoTemporada plato = factory.crearPlatoTemporada();

                    System.out.println("\n-> Has seleccionado: Plato de Temporada.");
                    System.out.println("\n=== RESUMEN DE TU PEDIDO ===");
                    System.out.println(plato.getDetalles());
                    System.out.println("-> Total a pagar: " + String.format("%.2f", plato.getPrecio()) + "€");

                } else {
                    System.out.println("\n[ERROR] Opción no válida. Por favor, ingrese 1 o 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Entrada inválida. Debe introducir un número (1 o 2).\n");
                scanner.next(); // Limpiar el buffer
            }
        }

        System.out.println("\n¡Gracias por su pedido! Hasta pronto.");
        scanner.close();
    }
}
