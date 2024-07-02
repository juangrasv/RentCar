
package rentcar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static rentcar.RentCar.listaVehiculos;
import static rentcar.ventanaArriendosConCuotas.operarListaVehiculos;
import static rentcar.RentCar.listaArriedos;
import rentcar.Arriendo;

public class ventanaArriendosConCuotas extends javax.swing.JFrame {
    
   int numeroCuota = 0;  
   int numeroDias = 0;
   int numeroPrecio = 0;
   int totalPago = 0;
 
    public ventanaArriendosConCuotas() {
        initComponents();
         llenarComboBoxAutomovil();  
         llenarComboBoxCliente();
         jTextMontoPagar.setEditable(false);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxAtomovil = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFechaArriendo = new javax.swing.JTextField();
        jTextMontoPagar = new javax.swing.JTextField();
        jTextPrecioDiaArriendo = new javax.swing.JTextField();
        jTextDiasArriendo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCantidadCuota = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ARRIENDOS CON CUOTAS");

        jComboBoxAtomovil.setToolTipText("");
        jComboBoxAtomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtomovilActionPerformed(evt);
            }
        });

        jComboBoxCliente.setEditable(true);
        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione CLIENTE" }));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar nuevo Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Días:");

        jLabel3.setText("Fecha de Arriendo:");

        jLabel4.setText("Precio por día:");

        jLabel5.setText("MONTO A PAGAR:");

        jTextFechaArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFechaArriendoActionPerformed(evt);
            }
        });

        jTextMontoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMontoPagarActionPerformed(evt);
            }
        });

        jTextPrecioDiaArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioDiaArriendoActionPerformed(evt);
            }
        });

        jTextDiasArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiasArriendoActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad de cuotas:");

        jTextCantidadCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadCuotaActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar arriendo y mostrar cuotas >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Número          Valor               ¿pagada?");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton3.setText("Pagar  Cuota");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Seleccione Automovil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextCantidadCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFechaArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextMontoPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                .addComponent(jTextDiasArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextPrecioDiaArriendo))))
                                    .addGap(2, 2, 2)
                                    .addComponent(jButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAtomovil, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(294, 294, 294))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(608, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAtomovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFechaArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCantidadCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDiasArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPrecioDiaArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextMontoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );

        jComboBoxCliente.getAccessibleContext().setAccessibleName("");
        jComboBoxCliente.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAtomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtomovilActionPerformed
        // TODO add your handling code here:
     
       
        
  
    }//GEN-LAST:event_jComboBoxAtomovilActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
   
    
    //jComboBoxCliente.revalidate();
    //jComboBoxCliente.repaint();
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ventanaCliente ventanaCliente = new ventanaCliente();
       ventanaCliente.setVisible(true);
       ventanaCliente.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    pagarCuotaArriendos pagarCuotaArriendos = new pagarCuotaArriendos();
    pagarCuotaArriendos.setVisible(true);        // TODO add your handling code here:
    this.dispose();
    pagarCuotaArriendos.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFechaArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFechaArriendoActionPerformed
        // TODO add your handling code here:
        // Obtener la fecha de arriendo del JTextField.
    
    }//GEN-LAST:event_jTextFechaArriendoActionPerformed

    private void jTextPrecioDiaArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioDiaArriendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioDiaArriendoActionPerformed

    private void jTextDiasArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiasArriendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDiasArriendoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        arriendosCliente();
        montoPago();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextCantidadCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadCuotaActionPerformed

    private void jTextMontoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMontoPagarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextMontoPagarActionPerformed

   public static void operarListaVehiculos(List<Vehiculo> lista){
        // Puedes utilizar la lista en esta clase
        for (Vehiculo vehiculo : lista) {
            System.out.println("Tipo desde OtraClase: " + vehiculo.getMarca());
        }
   
   }
   
   // metodos para la interaccion con las interfaces
   public void llenarComboBoxAutomovil(){
       jComboBoxAtomovil.removeAllItems();
       
      // Recorrer la lista de vehículos y agregar cada uno al ComboBox
        for (Vehiculo vehiculo : RentCar.listaVehiculos) {
        System.out.println(vehiculo.toString());
        jComboBoxAtomovil.addItem(vehiculo.getTipo()+", "+ vehiculo.getMarca()+", "+ vehiculo.getPatente()); // Ajusta esto según la representación deseada
    }
       }
   public void llenarComboBoxCliente(){
       jComboBoxCliente.removeAllItems();
       
      // Recorrer la lista de vehículos y agregar cada uno al ComboBox
        for (Cliente cliente : RentCar.listaCliente) {
        System.out.println(cliente.toString());
       jComboBoxCliente.addItem(cliente.getCedula()+", "+ cliente.getNombre()+", "+ cliente.isVigente()); // Ajusta esto según la representación deseada
    }
       }
   
    public void arriendosCliente(){
       
       // Obtener la fecha de arriendo del JTextField.
       String fechaArriendo = jTextFechaArriendo.getText(); 
       String diasArriendo = jTextDiasArriendo.getText();
       String precioDiaArriendo = jTextPrecioDiaArriendo.getText();
       String cantidadCuota = jTextCantidadCuota.getText();
       
    
       
       
    
        // Convertir el la cantidad de cuota a un entero.
    try {
        numeroCuota = Integer.parseInt(cantidadCuota);

             
    } catch (NumberFormatException e) {
        // El texto no es un número entero válido.
        JOptionPane.showMessageDialog(null, "Por favor, introduce un número entero válido.");
    }
     // Convertir los dias de arriendos a un entero.
    try {
        numeroDias = Integer.parseInt(diasArriendo);

       
    } catch (NumberFormatException e) {
        // El texto no es un número entero válido.
        JOptionPane.showMessageDialog(null, "Por favor, introduce un número entero válido.");
    }
    
       // Convertir el precio de arriendo a un entero.
    try {
        numeroPrecio = Integer.parseInt(precioDiaArriendo);

             
    } catch (NumberFormatException e) {
        // El texto no es un número entero válido.
        JOptionPane.showMessageDialog(null, "Por favor, introduce un número entero válido.");
    }
        
       
    // cargar ArrayList Arriendo
      
    
    
    
       }
   public void listarArriendos(){ 
       // Crear un nuevo objeto Arriendo.
    
   
   }
   
    public void montoPago(){
      totalPago = numeroPrecio *  numeroDias;
     // String stringTotalPago = Integer.toString(totalPago);
      jTextMontoPagar.setText(Integer.toString(totalPago));
         System.out.println("Total a pagar: " + totalPago);
      
   }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxAtomovil;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCantidadCuota;
    private javax.swing.JTextField jTextDiasArriendo;
    private javax.swing.JTextField jTextFechaArriendo;
    private javax.swing.JTextField jTextMontoPagar;
    private javax.swing.JTextField jTextPrecioDiaArriendo;
    // End of variables declaration//GEN-END:variables
}
