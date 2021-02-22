package primero;
// Generated 07-feb-2018 14:09:10 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ofertaeducativa generated by hbm2java
 */
public class Ofertaeducativa implements java.io.Serializable {

	private String codOe;
	private String nombre;
	private String descripcion;
	private String tipo;
	private Date fechaLey;
	private Set<Curso> cursos = new HashSet<Curso>(0);

	public Ofertaeducativa() {
	}

	public Ofertaeducativa(String codOe) {
		this.codOe = codOe;
	}

	public Ofertaeducativa(String codOe, String nombre, String descripcion, String tipo, Date fechaLey,
			Set<Curso> cursos) {
		this.codOe = codOe;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.fechaLey = fechaLey;
		this.cursos = cursos;
	}

	public String getCodOe() {
		return this.codOe;
	}

	public void setCodOe(String codOe) {
		this.codOe = codOe;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaLey() {
		return this.fechaLey;
	}

	public void setFechaLey(Date fechaLey) {
		this.fechaLey = fechaLey;
	}

	public Set<Curso> getCursos() {
		return this.cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
