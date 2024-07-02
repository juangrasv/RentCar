
package rentcar;

import java.util.ArrayList;
import java.util.List;

        
     
public class RentCar {
public static List<Vehiculo> listaVehiculos = new ArrayList<>();
public static List<Cliente> listaCliente = new ArrayList<>();
public static List<Arriendo> listaArriedos = new ArrayList<>();

    public static void main(String[] args) {
        
    // lista de vehiculos disponibles para arriendo
    listaVehiculos.add(new Vehiculo("LXRF12",'D',"Auto","Toyota"));
    listaVehiculos.add(new Vehiculo("RXRF16",'D',"Auto","Nissan"));
    listaVehiculos.add(new Vehiculo("LOKH56",'D',"Suv","Kia"));
    listaVehiculos.add(new Vehiculo("JFRE18",'A',"camioneta","Peugeot"));
                
    //imprime el arrays para revisar funcionamiento
    // for (int i = 0; i<listaVehiculos.size(); i++){
    // System.out.println("nombre: " + listaVehiculos.get(i).getTipo());
    // }
    
    // for (Vehiculo auto: listaVehiculos){
    //    System.out.println("Patente "+ auto.getPatente());
    //}
        
      
    // lista de clientes disponibles para arriendo
    listaCliente.add(new Cliente("13365987-9","Luis Perez",true));
    listaCliente.add(new Cliente("16575886-5","Manuel Lillo",true));
    listaCliente.add(new Cliente("18454237-6","Marcelo Parra",true));
    listaCliente.add(new Cliente("22454544-4","Pedro Lobos",true));
    listaCliente.add(new Cliente("11546577-5","Juan Pinto",true));
        
       
                
        
        
        
    
        
        
        
        
    ventanaCliente ventanaCliente = new ventanaCliente();
    ventanaCliente.setVisible(true);
    ventanaCliente.setLocationRelativeTo(null);

      
        
        
        
        
        
        
        
        
        
    }

    

  

   
}
