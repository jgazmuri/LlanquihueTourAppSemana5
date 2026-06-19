package model;

public class Tour {

    private int duracion;
    private String dificultad;
    private boolean incluyeTransporte;
    private String temporada;
    private String ubicacion;

    public Tour(int duracion, String dificultad, boolean incluyeTransporte, String temporada, String ubicacion) {
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.incluyeTransporte = incluyeTransporte;
        this.temporada = temporada;
        this.ubicacion = ubicacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public boolean isIncluyeTransporte() {
        return incluyeTransporte;
    }

    public void setIncluyeTransporte(boolean incluyeTransporte) {
        this.incluyeTransporte = incluyeTransporte;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "duracion=" + duracion +
                ", dificultad='" + dificultad + '\'' +
                ", incluyeTransporte=" + incluyeTransporte +
                ", temporada='" + temporada + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
