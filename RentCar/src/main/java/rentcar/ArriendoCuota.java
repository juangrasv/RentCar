
package rentcar;

import java.util.ArrayList;

public class ArriendoCuota extends Arriendo {
    private int cantCuotas;
    private ArrayList<CuotaArriendo> cuotas;  // Relación con CuotaArriendo

    public ArriendoCuota(int numArriendo, String fecArr, int diasArriendo, int cantCuotas) {
        super(numArriendo, fecArr, diasArriendo);
        this.cantCuotas = cantCuotas;
        this.cuotas = new ArrayList<>();
    }

    // Métodos getter y setter
    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public ArrayList<CuotaArriendo> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<CuotaArriendo> cuotas) {
        this.cuotas = cuotas;
    }

    public boolean ingresarArriendoConCuota(int precioDia) {
        // Lógica para evaluar el arriendo y asignar cuotas
        if (evaluarArriendo()) {
            // Operación que se ejecuta si la evaluación del arriendo es exitosa
            getVehiculo().setCondicion('A'); // Cambiar la condición del vehículo a 'A'

            // Asignar las cuotas respectivas del arriendo
            setCuotas(generarCuotas(precioDia));

            return true; // La operación fue exitosa
        } else {
            return false; // La operación no fue exitosa
        }
    }


    public ArrayList<CuotaArriendo> generarCuotas(int precioDia) {
        int montoTotal = obtenerMontoApagar(precioDia);
        int valorCuota = montoTotal / cantCuotas;

        ArrayList<CuotaArriendo> cuotas = new ArrayList<>();

        for (int i = 1; i <= cantCuotas; i++) {
            CuotaArriendo cuota = new CuotaArriendo(i, valorCuota);
            cuotas.add(cuota);
        }

        return cuotas;
    }

    @Override
    public String toString() {
        return "ArriendoCuota{" +
                "cantCuotas=" + cantCuotas +
                ", cuotas=" + cuotas +
                "} " + super.toString();
    }

    void setCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}