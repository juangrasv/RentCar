
package rentcar;


public class Arriendo {
    private int numArriendo;
    private String fecArr;
    private int diasArriendo;
    private Cliente cliente;  // Relación con Cliente
    private Vehiculo vehiculo;  // Relación con Vehiculo
    private ArriendoCuota arriendoCuota;  // Relación con ArriendoCuota
    
    public Arriendo(int numArriendo, String fecArr, int diasArriendo) {
        this.numArriendo = numArriendo;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
    }
    
  public String getFecArr() {
        return fecArr;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArriendoCuota getArriendoCuota() {
        return arriendoCuota;
    }

    public void setArriendoCuota(ArriendoCuota arriendoCuota) {
        this.arriendoCuota = arriendoCuota;
    }

    public int obtenerMontoApagar(int precioDia) {
        return diasArriendo * precioDia;
    }

    public boolean evaluarArriendo() {
        if (cliente.isVigente() && vehiculo.getCondicion() == 'D') {
            // Operación que se ejecuta antes de guardar el arriendo al sistema
            // ... (agregar aquí cualquier operación adicional necesaria)
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Arriendo{" +
                "numArriendo=" + numArriendo +
                ", fecArr='" + fecArr + '\'' +
                ", diasArriendo=" + diasArriendo +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", arriendoCuota=" + arriendoCuota +
                '}';
    } 
    
}
