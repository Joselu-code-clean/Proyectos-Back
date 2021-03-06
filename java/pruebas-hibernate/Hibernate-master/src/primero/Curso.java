package primero;
// Generated 07-feb-2018 14:09:10 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso implements java.io.Serializable {

	private CursoId id;
	private Ofertaeducativa ofertaeducativa;
	private Profesor profesor;
	private Set<Horario> horarios = new HashSet<Horario>(0);
	private Set<Reparto> repartos = new HashSet<Reparto>(0);

	public Curso() {
	}

	public Curso(CursoId id, Ofertaeducativa ofertaeducativa, Profesor profesor) {
		this.id = id;
		this.ofertaeducativa = ofertaeducativa;
		this.profesor = profesor;
	}

	public Curso(CursoId id, Ofertaeducativa ofertaeducativa, Profesor profesor, Set<Horario> horarios,
			Set<Reparto> repartos) {
		this.id = id;
		this.ofertaeducativa = ofertaeducativa;
		this.profesor = profesor;
		this.horarios = horarios;
		this.repartos = repartos;
	}

	public CursoId getId() {
		return this.id;
	}

	public void setId(CursoId id) {
		this.id = id;
	}

	public Ofertaeducativa getOfertaeducativa() {
		return this.ofertaeducativa;
	}

	public void setOfertaeducativa(Ofertaeducativa ofertaeducativa) {
		this.ofertaeducativa = ofertaeducativa;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Set<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(Set<Horario> horarios) {
		this.horarios = horarios;
	}

	public Set<Reparto> getRepartos() {
		return this.repartos;
	}

	public void setRepartos(Set<Reparto> repartos) {
		this.repartos = repartos;
	}

}
