/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dto.Piloto;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LogicaDeInscripcion {
    /*CAMPOS DE LAS LISTAS PARA AÑADIR EN LAS TABLAS*/
    private static List<Piloto> listaDePilotos = new ArrayList<>();
    /*GETTER Y SETTERS*/

    public static List<Piloto> getListaDePilotos() {
        return listaDePilotos;
    }
    
    
    /*METODOS DE LA LOGICA*/
    
    public  void addPiloto(Piloto piloto){
        listaDePilotos.add(piloto);
    }

    public boolean validarCamposPilotoPersonal(Component dialogo,Piloto piloto) throws ParseException{
        boolean checkFields = true;
        if(validateName(piloto)){
            JOptionPane.showMessageDialog(dialogo, "Error en la validacion del nombre", "VALIDACION NOMBRE", JOptionPane.ERROR_MESSAGE);
            checkFields = false;
        }else if(validateSurname(piloto)){
            JOptionPane.showMessageDialog(dialogo, "Error en la validacion del Apellido", "VALIDACION APELLIDO", JOptionPane.ERROR_MESSAGE);
            checkFields = false;
        }else if(validateDNI(piloto)){
            JOptionPane.showMessageDialog(dialogo, "Error en la validacion del DNI", "VALIDACION DNI", JOptionPane.ERROR_MESSAGE);
            checkFields = false;
        }else if(validarFechaNac(piloto)){
            JOptionPane.showMessageDialog(dialogo, "Error en la validacion de la Fecha", "VALIDACION FECHA", JOptionPane.ERROR_MESSAGE);
            checkFields = false;
        }
        return checkFields;
    }
    
    public boolean validarCamposPilotoProfesional(Component dialogo,Piloto piloto){
        boolean checkFields = true;
        if(validateCargo(piloto)){
            JOptionPane.showMessageDialog(dialogo, "Error en la validacion del Cargo", "VALIDACION CARGO", JOptionPane.ERROR_MESSAGE);
            checkFields = false;
        }else if(validateExperiencia(piloto)){
            JOptionPane.showMessageDialog(dialogo, "Error en la validacion del Experiencia", "VALIDACION EXPERIENCIA", JOptionPane.ERROR_MESSAGE);
            checkFields = false;
        }
        return checkFields;
    }
    
    public boolean validarRegistroRepetidos(Piloto piloto){
        boolean checkField = true;
        
        for(int i = 0; i <= getListaDePilotos().size()-1; i++){
            if(getListaDePilotos().get(i).getDni().equals(piloto.getDni())){
                checkField = false;
            }
        }
        return checkField;
    }
    
    
    /*METODOS DE VALIDACIONES PARA PILOTO:*/
    private boolean validateName(Piloto piloto){
        boolean comprobacion = false;
        if(piloto.getNombre().isEmpty() ||  piloto.getNombre().equals("") || !piloto.getNombre().matches("[A-Z].*")){
             comprobacion = true;
        }
        return comprobacion;
    }
    
    private boolean validateSurname(Piloto piloto){
        boolean comprobacion = false;
        if(piloto.getApellido().isEmpty() ||  piloto.getApellido().equals("") || !piloto.getApellido().matches("[A-Z].*")){
             comprobacion = true;
        }
        return comprobacion;
    }
    
    private boolean validateCargo(Piloto piloto){
        boolean comprobacion = false;
        if(piloto.getCargo().isEmpty() || piloto.getCargo().equals("")){
             comprobacion = true;
        }
        return comprobacion;
    }
    
    private boolean validateExperiencia(Piloto piloto){
        boolean comprobacion = false;
        if(piloto.getExperiencia() <= 0 || piloto.getExperiencia() > 50){
             comprobacion = true;
        }
        return comprobacion;
    }
    
    
    private boolean validateDNI(Piloto piloto){
        boolean comprobacion = true;
        if(piloto.getDni().isEmpty() || piloto.getDni().matches("\\d{8}[A-HJ-NP-TV-Z]")){
             comprobacion = false;
        }
        return comprobacion;
    }
    
    
    private boolean validarFechaNac(Piloto piloto){
        boolean comprobacion = false;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNaci = new Date();
        try {
            fechaNaci = formato.parse(piloto.getFechaNac());
        } catch (ParseException ex) {
            Logger.getLogger(LogicaDeInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar fechaAct = Calendar.getInstance();
        fechaAct.setTime(fechaNaci);
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        int añoNacPil = fechaAct.get(Calendar.YEAR);
        int difFechas = añoActual - añoNacPil;
        if(difFechas < 18){
            comprobacion = true;
        }
        return comprobacion;
    }
    
}
