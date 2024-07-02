
package rentcar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static rentcar.RentCar.listaVehiculos;
import static rentcar.ventanaArriendosConCuotas.operarListaVehiculos;



public class ventanaCliente extends javax.swing.JFrame {

   
    public ventanaCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inNombre = new javax.swing.JTextField();
        inCedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRBNo = new javax.swing.JRadioButton();
        jRBSi = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("CLIENTES");

        jLabel2.setText("Cédula:");

        jLabel3.setText("Nombre:");

        inNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNombreActionPerformed(evt);
            }
        });

        inCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCedulaActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("¿Vigente?:");

        buttonGroup1.add(jRBNo);
        jRBNo.setText("No");

        buttonGroup1.add(jRBSi);
        jRBSi.setText("Si");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(inNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRBNo)
                                                .addComponent(jRBSi)))))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(inCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRBSi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBNo)
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCedulaActionPerformed
       
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_inCedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      agregarCliente();
        
      
      
      
      
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNombreActionPerformed

    
    
    // metodos para la interaccion con las interfaces
public void agregarCliente(){
    // Obtener el texto del JTextField.
    String cedula = inCedula.getText();
    // Comprobar si el texto tiene al menos 9 caracteres y contiene un "-".
    boolean ingresoCedula = false;
    boolean ingresoNombre = false;
    if (cedula.length() >= 9 && cedula.contains("-")) {
        // El texto es válido.
        ingresoCedula = true;
        // ...
    } else {
        // El texto no es válido.
        JOptionPane.showMessageDialog(null, "Por favor, debe ingresar 8 digitos, '-' y digito verificador. ejemplo: 12556789-0");
    } 

    String nombre = inNombre.getText();
    if (nombre.isEmpty()) {
    JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacío");
     } else {
    // Continúa  aquí...
     ingresoNombre = true;
     }
    
      
    boolean estado; 
    if(jRBSi.isSelected()){
        estado = true;
    }
    else{ 
        estado = false;
    }

    // Crear un nuevo objeto Cliente.
    Cliente nuevoCliente = new Cliente(cedula, nombre, estado);

    // Agregar el nuevo cliente a la lista.
    RentCar.listaCliente.add(nuevoCliente);
    System.out.println("Lista de clientes: " + RentCar.listaCliente);
    
    
    if(ingresoCedula && ingresoNombre){
      ventanaArriendosConCuotas ventanaArriendosConCuotas = new ventanaArriendosConCuotas();
      ventanaArriendosConCuotas.setVisible(true);  
      this.dispose();
      ventanaArriendosConCuotas.setLocationRelativeTo(null);
    }else{
       JOptionPane.showMessageDialog(null, "Por favor, vuelva a ingresar los datos");
    }
}
     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inCedula;
    private javax.swing.JTextField inNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBNo;
    private javax.swing.JRadioButton jRBSi;
    // End of variables declaration//GEN-END:variables

   
}
