
package rentcar;

import java.util.ArrayList;
public class CuotaArriendo {
    private int numCuota;
    private int valorCuota;
    private boolean pagada;

    public CuotaArriendo(int numCuota, int valorCuota) {
        this.numCuota = numCuota;
        this.valorCuota = valorCuota;
        this.pagada = false;
    }

    // Métodos getter y setter
    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public boolean pagarCuota(ArrayList<CuotaArriendo> listaCuotas, int numCuota) {
        for (CuotaArriendo cuota : listaCuotas) {
            if (cuota.getNumCuota() == numCuota) {
                cuota.setPagada(true);
                return true; // Cuota encontrada y pagada con éxito
            }
        }
        return false; // Cuota no encontrada
    }

    @Override
    public String toString() {
        return "CuotaArriendo{" +
                "numCuota=" + numCuota +
                ", valorCuota=" + valorCuota +
                ", pagada=" + pagada +
                '}';
    }
}

