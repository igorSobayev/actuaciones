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
@Table(name = "tipoactuaciones")
public class TipoActuacionVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtipoactuacion", nullable = false)
	private int idtipoactuacion;
	
	@Column(name = "denominacion", length = 45, nullable = true)
	private String denominacion;
	
	@Column(name = "precio", nullable = true)
	private float precio;
	
	@OneToMany(mappedBy = "tipoActuacion")
	private List<ActuacionVO> actuaciones;

	public TipoActuacionVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoActuacionVO(int idtipoactuacion, String denominacion, float precio, List<ActuacionVO> actuaciones) {
		super();
		this.idtipoactuacion = idtipoactuacion;
		this.denominacion = denominacion;
		this.precio = precio;
		this.actuaciones = actuaciones;
	}

	public TipoActuacionVO(String denominacion, float precio, List<ActuacionVO> actuaciones) {
		super();
		this.denominacion = denominacion;
		this.precio = precio;
		this.actuaciones = actuaciones;
	}

	public TipoActuacionVO(int idtipoactuacion, String denominacion, float precio) {
		super();
		this.idtipoactuacion = idtipoactuacion;
		this.denominacion = denominacion;
		this.precio = precio;
	}

	public int getIdtipoactuacion() {
		return idtipoactuacion;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public float getPrecio() {
		return precio;
	}

	public List<ActuacionVO> getActuaciones() {
		return actuaciones;
	}

	public void setIdtipoactuacion(int idtipoactuacion) {
		this.idtipoactuacion = idtipoactuacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setActuaciones(List<ActuacionVO> actuaciones) {
		this.actuaciones = actuaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + idtipoactuacion;
		result = prime * result + Float.floatToIntBits(precio);
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
		TipoActuacionVO other = (TipoActuacionVO) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (idtipoactuacion != other.idtipoactuacion)
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoActuacionVO [idtipoactuacion=" + idtipoactuacion + ", denominacion=" + denominacion + ", precio="
				+ precio + ", actuaciones=" + actuaciones + "]";
	}
	
	
	

}
