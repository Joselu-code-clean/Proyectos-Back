/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;



/**
 *
 * @author Terminal
 */
public class Piloto {
    String dni, nombre, apellido,cargo,fechaNac;
    int experiencia;

    
    /*Vamos a necesitar 3 constructores para crear el objeto completamente*/
    public Piloto(String dni, String nombre, String apellido, String cargo, int experiencia, String fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.experiencia = experiencia;
        this.fechaNac = fechaNac;
    }
    public Piloto(String dni, String nombre, String apellido,String fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
    
    public Piloto(String cargo, int experiencia) {
        this.cargo = cargo;
        this.experiencia = experiencia;
    }
    /*METODOS*/
    
    public String[] toArrayString(){
        String [] addRow = new String[6];
        addRow[0] = dni;
        addRow[1] = nombre;
        addRow[2] = apellido;
        addRow[3] = fechaNac;
        addRow[4] = cargo;
        addRow[5] = String.valueOf(experiencia);
        return addRow;
    }
    
    
    /*GETTER & SETTERS*/
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}
