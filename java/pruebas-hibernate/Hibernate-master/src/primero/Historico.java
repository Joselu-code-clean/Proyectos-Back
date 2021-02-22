package primero;

import java.sql.Timestamp;
import java.util.Objects;

public class Historico {
    private String codProf;
    private String nombre;
    private String apellidos;
    private Timestamp fechaAlta;

    public String getCodProf() {
        return codProf;
    }

    public void setCodProf(String codProf) {
        this.codProf = codProf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historico historico = (Historico) o;
        return Objects.equals(codProf, historico.codProf) &&
                Objects.equals(nombre, historico.nombre) &&
                Objects.equals(apellidos, historico.apellidos) &&
                Objects.equals(fechaAlta, historico.fechaAlta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProf, nombre, apellidos, fechaAlta);
    }
}
