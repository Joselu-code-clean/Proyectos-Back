/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Terminal
 */
public class PantallaAyuda extends javax.swing.JDialog {

    /**
     * Creates new form PantallaAyuda
     */
    public PantallaAyuda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtextAyuda = new javax.swing.JTextArea();
        jbCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtextAyuda.setColumns(20);
        jtextAyuda.setRows(5);
        jtextAyuda.setText("\nNombre:  No puede estar vacio o comenzar por espacio y tiene que comenzar\npor mayuscula y no puede comenzar por numero.\n\nApellido: No puede estar vacio o comenzar por espacio y tiene que comenzar\npor mayuscula y no puede comenzar por numero.\n\nDNI: Tiene que empezar por numero, ser 8 numero y a continuacion sin\nespacios tiene que haber una letra del abecedario pero no puede ser U.\n\nFecha Nac: Entre la fecha actual y la de nacimiento tiene que ver una \ndiferencia de 18 años.\n\nCargo: Tiene que haber un cargo seleccionado.\n\nExperiencia: Como minimo tienes que tener 1 año de experiencia y como\nmáximo 50 años.\n");
        jScrollPane1.setViewportView(jtextAyuda);

        jbCerrar.setText("CERRAR");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCerrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jbCerrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JTextArea jtextAyuda;
    // End of variables declaration//GEN-END:variables
}
