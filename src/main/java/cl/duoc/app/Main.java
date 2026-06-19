package cl.duoc.app;

import data.DataManager;
import model.AdministradorGuias;
import model.Guia;
import model.Tour;



public class Main {
    public static void main(String[] args) {

        DataManager dataManager = new DataManager();

        AdministradorGuias administradorGuias = dataManager.cargarGuia();
        System.out.println("Agencia: "+administradorGuias.getNombreAgencia());

        System.out.println("\n===== Lista de Guias =====");
        for(Guia guia : administradorGuias.getGuias()){
            System.out.println(guia);
        }

        System.out.println("===== PRUEBA: GESTIÓN DE TOURS =====");

        Tour tourCargado = dataManager.cargarTour();

        if(tourCargado != null){
            System.out.println("Tour cargado");
            System.out.println("Datos del Tour leidos: "+tourCargado);
        }else {
            System.out.println("No ha encontrado todos los tours");

        }
    }
}
