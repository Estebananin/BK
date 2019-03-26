package model.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String correo;

	private String contrasena;

	//bi-directional many-to-one association to Actividad
	@OneToMany(mappedBy="usuario")
	private List<Actividad> actividad;

	public Usuario() {
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<Actividad> getActividad() {
		return this.actividad;
	}

	public void setActividad(List<Actividad> actividad) {
		this.actividad = actividad;
	}

	public Actividad addActividad(Actividad actividad) {
		getActividad().add(actividad);
		actividad.setUsuario(this);

		return actividad;
	}

	public Actividad removeActividad(Actividad actividad) {
		getActividad().remove(actividad);
		actividad.setUsuario(null);

		return actividad;
	}

}