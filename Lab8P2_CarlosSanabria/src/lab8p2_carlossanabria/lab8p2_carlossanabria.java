/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlossanabria;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HP1
 */
public class lab8p2_carlossanabria extends javax.swing.JFrame {

    /**
     * Creates new form lab8p2_carlossanabria
     */
    public lab8p2_carlossanabria() {
        initComponents();
        DefaultComboBoxModel modelo1= (DefaultComboBoxModel) CB_Categoria.getModel();
        modelo1.addElement("Default");
        modelo1.addElement("Generalista");
        modelo1.addElement("Prenium");
        modelo1.addElement("Deportivo");
        CB_Categoria.setModel(modelo1);
        DefaultComboBoxModel modelo2= (DefaultComboBoxModel) CB_TipoCarro.getModel();
        modelo2.addElement("Default");
        modelo2.addElement("Sedan");
        modelo2.addElement("Familiar");
        modelo2.addElement("HatchBack");
        modelo2.addElement("FastBack");
        modelo2.addElement("SUV");
        CB_TipoCarro.setModel(modelo2);
        DefaultComboBoxModel modelo3= (DefaultComboBoxModel) CB_TipoMotor1.getModel();
        modelo3.addElement("Default");
        modelo3.addElement("Combustion");
        modelo3.addElement("Electrico");
        CB_TipoMotor1.setModel(modelo3);
        DefaultComboBoxModel modelo4= (DefaultComboBoxModel) CB_TipoHibrido.getModel();
        modelo4.addElement("Ninguno");
        modelo4.addElement("MicroHibrido");
        modelo4.addElement("Hibrido Convencional");
        modelo4.addElement("Hibrido Enchufable");
        modelo4.addElement("Hibrido Electrico");
        CB_TipoHibrido.setModel(modelo4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CRUD_AUTOS = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        CB_Marca = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TF_VIN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        JB_AgregarPersona = new javax.swing.JButton();
        TF_Color = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TF_Precio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JS_num_p = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CB_Categoria = new javax.swing.JComboBox<>();
        JB_Prepar_Marca = new javax.swing.JButton();
        CB_TipoCarro = new javax.swing.JComboBox<>();
        CB_TipoHibrido = new javax.swing.JComboBox<>();
        CB_TipoMotor1 = new javax.swing.JComboBox<>();
        JS_Pasajeros = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        JS_Ensamblaje = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        CRUD_AUTOS.setTitle("CRUD");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Ensamblaje: ");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("Cantidad Maxima de Pasajeros: ");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Tipo de Hibrido: ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Categoria: ");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("Precios de Partida: ");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Tipo de Auto: ");

        JB_AgregarPersona.setText("Agregar");
        JB_AgregarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_AgregarPersonaMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Numero de puertas: ");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Tipo de motor: ");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("VIN:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Marca: ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Color: ");

        JB_Prepar_Marca.setText("Listar Marcas");
        JB_Prepar_Marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_Prepar_MarcaMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("En segundos");

        javax.swing.GroupLayout CRUD_AUTOSLayout = new javax.swing.GroupLayout(CRUD_AUTOS.getContentPane());
        CRUD_AUTOS.getContentPane().setLayout(CRUD_AUTOSLayout);
        CRUD_AUTOSLayout.setHorizontalGroup(
            CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JS_Pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                        .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_VIN, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JS_num_p, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                                .addComponent(CB_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(JB_Prepar_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CB_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_TipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                        .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addGap(25, 25, 25)
                        .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_TipoHibrido, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_TipoMotor1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(32, 32, 32)
                        .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_AgregarPersona)
                            .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                                .addComponent(JS_Ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel28)))))
                .addContainerGap(579, Short.MAX_VALUE))
        );
        CRUD_AUTOSLayout.setVerticalGroup(
            CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CB_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JB_Prepar_Marca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TF_VIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CB_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CB_TipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(JS_num_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TF_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(CB_TipoMotor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TF_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUD_AUTOSLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(JS_Pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CB_TipoHibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_AUTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel24)
                    .addComponent(JS_Ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(JB_AgregarPersona)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Adminstrar Autos");

        jMenuItem1.setText("CRUD Autos");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Busquedad Autos");

        jMenu3.setText("Buscar por: ");

        jMenuItem2.setText("jMenuItem2");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu3.add(jMenuItem5);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_AgregarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_AgregarPersonaMouseClicked
        // TODO add your handling code here:
                   
    }//GEN-LAST:event_JB_AgregarPersonaMouseClicked

    private void JB_Prepar_MarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_Prepar_MarcaMouseClicked
        // TODO add your handling code here:
        int check=CB_Categoria.getSelectedIndex();
        if(check==1){
             DefaultComboBoxModel modelo1= (DefaultComboBoxModel) CB_Marca.getModel();
        }else if(check==2){
            
        }else if(check==3){
            
        }else{
            
        }
    }//GEN-LAST:event_JB_Prepar_MarcaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lab8p2_carlossanabria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab8p2_carlossanabria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab8p2_carlossanabria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab8p2_carlossanabria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab8p2_carlossanabria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Categoria;
    private javax.swing.JComboBox<String> CB_Marca;
    private javax.swing.JComboBox<String> CB_TipoCarro;
    private javax.swing.JComboBox<String> CB_TipoHibrido;
    private javax.swing.JComboBox<String> CB_TipoMotor1;
    private javax.swing.JDialog CRUD_AUTOS;
    private javax.swing.JButton JB_AgregarPersona;
    private javax.swing.JButton JB_Prepar_Marca;
    private javax.swing.JSpinner JS_Ensamblaje;
    private javax.swing.JSpinner JS_Pasajeros;
    private javax.swing.JSpinner JS_num_p;
    private javax.swing.JTextField TF_Color;
    private javax.swing.JTextField TF_Precio;
    private javax.swing.JTextField TF_VIN;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
