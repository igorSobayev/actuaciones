package com.dawes.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class EmpleadoVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idempleado", nullable = false)
	private int idEmpleado;
	
	@Column(name = "nombre", length = 65, nullable = true)
	private String nombre;
	
	@Column(name = "apellidos", length = 65, nullable = true)
	private String apellidos;
	
	@Column(name = "nif", length = 15, nullable = true)
	private String nif;
	
	@Column(name = "direccion", length = 65, nullable = true)
	private String direccion;
	
	@Column(name = "movil", length = 20, nullable = true)
	private String movil;
	
	@Column(name = "fijo", length = 45, nullable = true)
	private String fijo;
	
	@OneToMany(mappedBy = "empleado")
	private List<ActuacionVO> actuaciones;

	public EmpleadoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoVO(int idEmpleado, String nombre, String apellidos, String nif, String direccion, String movil,
			String fijo, List<ActuacionVO> actuaciones) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = direccion;
		this.movil = movil;
		this.fijo = fijo;
		this.actuaciones = actuaciones;
	}

	public EmpleadoVO(String nombre, String apellidos, String nif, String direccion, String movil, String fijo,
			List<ActuacionVO> actuaciones) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = direccion;
		this.movil = movil;
		this.fijo = fijo;
		this.actuaciones = actuaciones;
	}

	public EmpleadoVO(String nombre, String apellidos, String nif, String direccion, String movil, String fijo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = direccion;
		this.movil = movil;
		this.fijo = fijo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNif() {
		return nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getMovil() {
		return movil;
	}

	public String getFijo() {
		return fijo;
	}

	public List<ActuacionVO> getActuaciones() {
		return actuaciones;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public void setFijo(String fijo) {
		this.fijo = fijo;
	}

	public void setActuaciones(List<ActuacionVO> actuaciones) {
		this.actuaciones = actuaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmpleado;
		result = prime * result + ((movil == null) ? 0 : movil.hashCode());
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoVO other = (EmpleadoVO) obj;
		if (idEmpleado != other.idEmpleado)
			return false;
		if (movil == null) {
			if (other.movil != null)
				return false;
		} else if (!movil.equals(other.movil))
			return false;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmpleadoVO [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif="
				+ nif + ", direccion=" + direccion + ", movil=" + movil + ", fijo=" + fijo + ", actuaciones="
				+ actuaciones + "]";
	}
	
	
	
	

	
	

}
