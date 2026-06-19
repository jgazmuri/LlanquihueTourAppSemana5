package model;

import java.util.ArrayList;
import java.util.List;

public class AdministradorGuias {

    private String nombreAgencia;
    private List<Guia> guias;

    public AdministradorGuias(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
        this.guias = new ArrayList<>();
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public List<Guia> getGuias() {
        return guias;
    }

    public void setGuias(List<Guia> guias) {
        this.guias = guias;
    }

    public void addGuia(Guia guia){
        this.guias.add(guia);

    }

    public void removeGuia(Guia guia){
        this.guias.remove(guia);
    }

    @Override
    public String toString() {
        return "AdministradorGuias{" +
                "nombreAgencia='" + nombreAgencia + '\'' +
                ", guias=" + guias +
                '}';
    }
}
