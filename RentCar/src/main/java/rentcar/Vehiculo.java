
package rentcar;

import java.util.ArrayList;
import java.util.List;

public class  Vehiculo {
    private String patente;    
    private char condicion;
    private String tipo;
    private String marca;
    private ArrayList<Arriendo> arriendos;  // Relación con Arriendo

    public Vehiculo(String patente, char condicion, String tipo, String marca) {
        this.patente = patente;
        this.condicion = condicion;
        this.tipo = tipo;
        this.marca = marca;
        this.arriendos = arriendos;
    }

    

    // Métodos getter y setter

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Arriendo> getArriendos() {
        return arriendos;
    }

    public void setArriendos(ArrayList<Arriendo> arriendos) {
        this.arriendos = arriendos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ","
                + " condicion=" + condicion + ","
                + " tipo=" + tipo + ","
                + " marca=" + marca + ","
                + " arriendos=" + arriendos + '}';
    }

    
}

