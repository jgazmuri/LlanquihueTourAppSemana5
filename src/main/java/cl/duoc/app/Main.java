package cl.duoc.app;

import data.DataManager;
import model.AdministradorGuias;
import model.Guia;
import model.Tour;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DataManager dataManager = new DataManager();

        // --- 1. CARGAR Y MOSTRAR LOS GUIAS ---
        AdministradorGuias administradorGuias = dataManager.cargarGuia();
        if (administradorGuias != null) {
            System.out.println("Agencia: " + administradorGuias.getNombreAgencia());
            System.out.println("\n===== Lista de Guias =====");
            for (Guia guia : administradorGuias.getGuias()) {
                System.out.println(guia);
            }
        } else {
            System.out.println("No se pudo cargar la lista de guías.");
        }

        // --- 2. CARGAR Y MOSTRAR EL TOUR
        System.out.println("\n===== PRUEBA: GESTIÓN DE TOURS =====");
        Tour tourCargado = dataManager.cargarTour();

        if (tourCargado != null) {
            System.out.println("Tour cargado exitosamente.");
            System.out.println("Datos del Tour leidos: " + tourCargado);
        } else {
            System.out.println("No se ha encontrado o no se pudo leer el archivo del tour.");
        }

        // MENÚ INTERACTIVO PARA BUSCAR GUIAS
        // Solo entra al menú si los guías se cargaron bien.
        if (administradorGuias != null) {
            Scanner teclado = new Scanner(System.in);
            boolean salir = false;

            System.out.println("\n========================================");
            System.out.println("   MENÚ DE CONSULTA DE GUÍAS");
            System.out.println("========================================");

            while (!salir) {
                System.out.println("\n--- MENÚ DE OPCIONES ---");
                System.out.println("1. Buscar guía por nombre");
                System.out.println("2. Salir del programa");
                System.out.print("Elige una opción: ");

                String opcion = teclado.nextLine();

                switch (opcion) {
                    case "1":
                        System.out.print("Ingresa el nombre del guía a buscar: ");
                        String nombreBusqueda = teclado.nextLine();
                        buscarGuia(administradorGuias, nombreBusqueda);
                        break;
                    case "2":
                        System.out.println("Saliendo del programa...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                }
            }
            teclado.close();
        }
    }

    // MÉTODO PARA LA BÚSQUEDA
    public static void buscarGuia(AdministradorGuias admin, String nombre) {
        boolean encontrado = false;

        for (Guia guia : admin.getGuias()) {
            if (guia.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\n¡Guía encontrado!");
                System.out.println("Nombre: " + guia.getNombre());
                System.out.println("Especialidad: " + guia.getEspecialidad());
                System.out.println("Experiencia: " + guia.getAniosExperiencia() + " años");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún guía con el nombre '" + nombre + "'.");
        }
    }
}