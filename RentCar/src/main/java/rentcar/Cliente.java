
package rentcar;

import java.util.ArrayList;

public class Cliente {
    private String cedula;
    private String nombre;
    private boolean vigente;
    private ArrayList<Arriendo> arriendos;  // Relación con Arriendo

    public Cliente(String cedula, String nombre, boolean vigente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigente = vigente;
        this.arriendos = new ArrayList<>();
    }

    // Métodos getter y setter
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public ArrayList<Arriendo> getArriendos() {
        return arriendos;
    }

    // Método para agregar un arriendo a la lista
    public void agregarArriendo(Arriendo arriendo) {
        this.arriendos.add(arriendo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", vigente=" + vigente +
                ", arriendos=" + arriendos +
                '}';
    }
}