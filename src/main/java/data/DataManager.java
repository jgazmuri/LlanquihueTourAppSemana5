package data;

import model.AdministradorGuias;
import model.Guia;
import model.Tour;

import java.io.*;

public class DataManager {

    private static final String DATA_FILE = "guias.txt";

    public void guardarGuia(AdministradorGuias administrador){
    try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE));
        writer.write(administrador.getNombreAgencia() + "\n");
        writer.close();

    }catch (IOException e){
        System.out.println("Error al guardar el guia"+e.getMessage());
    }
}

public AdministradorGuias cargarGuia(){
        AdministradorGuias administradorGuias = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))){
    String primeraLinea = reader.readLine();
    if(primeraLinea!=null){
        administradorGuias = new AdministradorGuias(primeraLinea);
        String linea;
        while((linea = reader.readLine())!=null){
            String[] lineaSplit = linea.split(";");
            if(lineaSplit.length==3){
                Guia guia = new Guia( lineaSplit[0], lineaSplit[1], Integer.parseInt (lineaSplit[2]));
                administradorGuias.addGuia(guia);
            }
        }
    }

        }catch (IOException e){
            System.out.println("Error al cargar el guia"+e.getMessage());
        }
        return administradorGuias;

}
    private static final String TOUR_FILE = "tour.txt";

    public void guardarTour(Tour tour) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(TOUR_FILE));
            writer.write(tour.getDificultad() + "\n");
            writer.write(tour.getDuracion() + "\n");
            writer.write(tour.getTemporada() + "\n");
            writer.write(tour.getUbicacion() + "\n");
            writer.write(String.valueOf(tour.isIncluyeTransporte()) + "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("Error al guardar el tour" + e.getMessage());
        }

    }

    public Tour cargarTour() {

        Tour tour = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("tour.txt"));
            String dificultad = reader.readLine();
            String duracionStr = reader.readLine();
            String temporada = reader.readLine();
            String ubicacion = reader.readLine();
            String transporteStr = reader.readLine();
            reader.close();

            if (dificultad !=null && duracionStr !=null){
                int dureccion = Integer.parseInt(duracionStr);
                boolean incluyeTransporte = Boolean.parseBoolean(transporteStr);
                tour = new Tour(dureccion, dificultad, incluyeTransporte, temporada, ubicacion);
            }
    }catch (IOException e){
            System.out.println("Error al cargar el tour" + e.getMessage());
        }
        return tour;
    }
}