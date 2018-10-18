/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-107
 */
public class Presentacion extends javax.swing.JFrame {

    JRadioButton radios[];
    Opcion[] opciones;
    Pregunta p1;

    /**
     * Creates new form PresentacionTest
     */
    public Presentacion() {
        initComponents();
        setLocationRelativeTo(this);

        //generamos en un arreglo los radios button visuales
        radios = new JRadioButton[5];
        opciones = new Opcion[5];
        radios[0] = radioOp1;
        radios[1] = radioOp2;
        radios[2] = radioOp3;
        radios[3] = radioOp4;
        radios[4] = radioOp5;

        //llenamos el modelo con los valores correctos en la interfaz de usuario
        Opcion op1 = new Opcion("EL AZUCAR", true);

        System.out.println("tu titulo es " + op1.titulo);

        System.out.println("es correcta " + op1.correcta);

        Opcion op2 = new Opcion("la grasa", false);
        Opcion op3 = new Opcion("el sol", false);
        Opcion op4 = new Opcion("la contaminacion", false);
        Opcion op5 = new Opcion("la sal", false);

        opciones[0] = op1;
        opciones[1] = op2;
        opciones[2] = op3;
        opciones[3] = op4;
        opciones[4] = op5;

        p1 = new Pregunta("esta es la principal causa del cancer ", opciones);
        etiquetaTitulo.setText(p1.titulo);
        for (int i = 0; i < radios.length; i++) {

            radios[i].setText(p1.opciones[i].titulo);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        etiquetaTitulo1 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        etiquetaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        radioOp5 = new javax.swing.JRadioButton();
        ChecarRespuesta = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTitulo1.setText("jLabe2l");

        jRadioButton6.setText("jRadioButton1");

        jRadioButton7.setText("jRadioButton2");

        jRadioButton8.setText("jRadioButton3");

        jRadioButton9.setText("jRadioButton4");

        jRadioButton10.setText("jRadioButton5");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(etiquetaTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton10))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jRadioButton6)
                .addGap(27, 27, 27)
                .addComponent(jRadioButton7)
                .addGap(26, 26, 26)
                .addComponent(jRadioButton8)
                .addGap(28, 28, 28)
                .addComponent(jRadioButton9)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton10)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTitulo.setText("jLabe2");

        buttonGroup1.add(radioOp1);
        radioOp1.setText("jRadioButton1");

        buttonGroup1.add(radioOp2);
        radioOp2.setText("jRadioButton2");

        buttonGroup1.add(radioOp3);
        radioOp3.setText("jRadioButton3");

        buttonGroup1.add(radioOp4);
        radioOp4.setText("jRadioButton4");

        buttonGroup1.add(radioOp5);
        radioOp5.setText("jRadioButton5");

        ChecarRespuesta.setText("Checar Respuesta");
        ChecarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecarRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioOp2)
                            .addComponent(radioOp1)
                            .addComponent(radioOp3)
                            .addComponent(radioOp4)
                            .addComponent(radioOp5)
                            .addComponent(ChecarRespuesta))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(radioOp1)
                .addGap(27, 27, 27)
                .addComponent(radioOp2)
                .addGap(26, 26, 26)
                .addComponent(radioOp3)
                .addGap(28, 28, 28)
                .addComponent(radioOp4)
                .addGap(18, 18, 18)
                .addComponent(radioOp5)
                .addGap(18, 18, 18)
                .addComponent(ChecarRespuesta)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void ChecarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:

        //buscamos el radio button seleccionado
        int indiceSeleccionado = 0;
        for (int i = 0; i < radios.length; i++) {
            if (radios[i].isSelected()) {
                indiceSeleccionado = i;
                break;
            }
        }
        System.out.println("el indice seleccionado es:" + indiceSeleccionado);
JOptionPane.showConfirmDialog(this,""+evaluar(p1, indiceSeleccionado));

    }                                               

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
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ChecarRespuesta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JRadioButton radioOp5;
    // End of variables declaration                   

    public boolean evaluar(Pregunta p, int indiceSeleccionado) {
    
    
        boolean correcta = false;

        if (p.opciones[indiceSeleccionado].correcta) {
            correcta = true;
        }
        return correcta;
    }
}



