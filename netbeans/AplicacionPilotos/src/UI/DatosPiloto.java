/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dto.Piloto;
import UI.PantallaBienvenida;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logic.LogicaDeInscripcion;

/**
 *
 * @author Usuario
 */
public class DatosPiloto extends javax.swing.JDialog {
    /*CAMPOS*/
    List<Piloto> listaPilotos = LogicaDeInscripcion.getListaDePilotos();
    LogicaDeInscripcion LI = new LogicaDeInscripcion();
    PantallaBienvenida PB;
    int selectedRow;
    boolean pulsado = false;
    
    /**
     * Creates new form datosPiloto
     */
    public DatosPiloto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PB = (PantallaBienvenida)parent;
        refrescarTabla();//cargamos todos los pilotos.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBPilotos = new javax.swing.JTable();
        btSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMOpciones = new javax.swing.JMenu();
        jMItemEliminar = new javax.swing.JMenuItem();
        jMItemModificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TBPilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TBPilotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBPilotosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBPilotos);

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jMOpciones.setText("OPCIONES");

        jMItemEliminar.setText("ELIMINAR");
        jMItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemEliminarActionPerformed(evt);
            }
        });
        jMOpciones.add(jMItemEliminar);

        jMItemModificar.setText("MODIFICAR");
        jMItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemModificarActionPerformed(evt);
            }
        });
        jMOpciones.add(jMItemModificar);

        jMenuBar1.add(jMOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalir)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBPilotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBPilotosMouseClicked
        // TODO add your handling code here:
        //EVENTO DE CUANDO SELECCIONAMOS UNA FILA DE LA TABLA.
        selectedRow = TBPilotos.getSelectedRow();
        pulsado = true;
    }//GEN-LAST:event_TBPilotosMouseClicked

    private void jMItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemEliminarActionPerformed
        // TODO add your handling code here:
        //Hay 2 formas de referenciar al modelo de la tabla creada, de esta forma que tenemos hecho aqui con el casting o poniendo la copia del
        //modelo con un atributo (Creo que es mejor forma).
        DefaultTableModel dtm = (DefaultTableModel)TBPilotos.getModel();
        if(pulsado == false){
            JOptionPane.showMessageDialog(this, "No has selecionado ningun registro", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
        }else{
            if(selectedRow >= 0){
                listaPilotos.remove(selectedRow);//Eliminamos el alumno selecionado.
            //Este metodo sirve para no mostrar el registro en la tabla pero el alumno seguiria existiendo en la lista por ello antes tenemos que eliminarlo
            dtm.removeRow(selectedRow);
            }else{
                JOptionPane.showMessageDialog(null, "Tabla vacia o registro no seleccionado");
            }
        }
        
    }//GEN-LAST:event_jMItemEliminarActionPerformed

    private void jMItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemModificarActionPerformed
        // TODO add your handling code here:
        if(pulsado == false){
            JOptionPane.showMessageDialog(this, "No has selecionado ningun registro", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
        }else{
            PantallaModificacionPiloto PMP = new PantallaModificacionPiloto(this, true);
            setVisible(false);
            PMP.setVisible(true);
        }
    }//GEN-LAST:event_jMItemModificarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btSalirActionPerformed

    /*METODOS*/
    private void refrescarTabla(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[] {"DNI", "NOMBRE", "APELLIDOS", "FECHA NAC", "CARGO", "EXPERIENCIA"});
        
        //Con este for each vamos añadiendo la lista de alumno uno tras otro en la tabla.
        for (Piloto piloto : listaPilotos) {
            dtm.addRow(piloto.toArrayString());
        }
        
        TBPilotos.setModel(dtm);
    }
    
    public void  modificarDatos(String cadenasDatos[]) throws ParseException{
        //Obtenemos el modelo de la tabla para trabajar con ella: Esto serviria si queremos trabajar con la tabla no con la BD.
        DefaultTableModel dtm = (DefaultTableModel)TBPilotos.getModel();
        //Detectamos la fila seleccionada y columna.
        String datos[] = new String[6];
        datos[0] = cadenasDatos[0];
        datos[1] = cadenasDatos[1];
        datos[2] = cadenasDatos[2];
        datos[3] = cadenasDatos[3];
        datos[4] = cadenasDatos[4];
        datos[5] = cadenasDatos[5];
        //Modificamos los datos del piloto.
        if(selectedRow >= 0){
            listaPilotos.get(selectedRow).setDni(datos[0]);//DNI
            listaPilotos.get(selectedRow).setNombre(datos[1]);//NOMBRE
            listaPilotos.get(selectedRow).setApellido(datos[2]);//APELLIDO
            listaPilotos.get(selectedRow).setFechaNac(datos[3]);//FECHA
            listaPilotos.get(selectedRow).setCargo(datos[4]);//CARGO
            listaPilotos.get(selectedRow).setExperiencia(Integer.parseInt(datos[5]));//EXPERIENCIA
        }else{
                JOptionPane.showMessageDialog(null, "Tabla vacia o registro no seleccionado");
        }
        //Validamos el campo del piloto de nuevo
        if(LI.validarCamposPilotoPersonal(this, listaPilotos.get(selectedRow)) && LI.validarCamposPilotoProfesional(this, listaPilotos.get(selectedRow))){
             //Esta forma se utiliza si no tenemos de por medio una BD pero si podemos utilizarlo si antes modificamos el objeto.
            for(byte i = 0 ; i < TBPilotos.getColumnCount(); i++){
                dtm.setValueAt(datos[i], selectedRow, i);
            }
            refrescarTabla();
        }else{
            int resultado = JOptionPane.showConfirmDialog(this, "¿Mostrar como rellenar cada campo?", "AYUDA",JOptionPane.YES_NO_CANCEL_OPTION);
                if(resultado == JOptionPane.YES_OPTION){
                    PantallaAyuda PA = new PantallaAyuda(null,true);
                    PA.setVisible(true);
                }else if(resultado == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(this, "Cerrando dialogo", "AYUDA", JOptionPane.INFORMATION_MESSAGE);
                }
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBPilotos;
    private javax.swing.JButton btSalir;
    private javax.swing.JMenuItem jMItemEliminar;
    private javax.swing.JMenuItem jMItemModificar;
    private javax.swing.JMenu jMOpciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}