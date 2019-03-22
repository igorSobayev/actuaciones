package com.dawes.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actuaciones")
public class ActuacionVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idactuaciones", nullable = false)
	private int idActuaciones;
	
	@Column(name = "horainicial", length = 10, nullable = true)
	private String horaInicial;
	
	@Column(name = "horafinal", length = 10, nullable = true)
	private String horaFinal;
	
	@Column(name = "preciohora", nullable = true)
	private float precioHora;
	
	@Column(name = "descripcion", length = 200, nullable = true)
	private String descripcion;
	
	@Column(name = "km", nullable = true)
	private float km;
	
	@Column(name = "dietas", nullable = true)
	private float dietas;
	
	@Column(name = "visado", nullable = true)
	private float visado;
	
	@Column(name = "repro", nullable = true)
	private float repro;
	
	@Column(name = "fecha")
	private LocalDate fecha;

	@ManyToOne
	@JoinColumn(name = "idempleado")
	private EmpleadoVO empleado;
	
	@ManyToOne
	@JoinColumn(name = "idtipoactuacion")
	private TipoActuacionVO tipoActuacion;

	public ActuacionVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActuacionVO(int idActuaciones, String horaInicial, String horaFinal, float precioHora, String descripcion,
			float km, float dietas, float visado, float repro, EmpleadoVO empleado, TipoActuacionVO tipoActuacion) {
		super();
		this.idActuaciones = idActuaciones;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.precioHora = precioHora;
		this.descripcion = descripcion;
		this.km = km;
		this.dietas = dietas;
		this.visado = visado;
		this.repro = repro;
		this.empleado = empleado;
		this.tipoActuacion = tipoActuacion;
	}

	public ActuacionVO(String horaInicial, String horaFinal, float precioHora, String descripcion, float km,
			float dietas, float visado, float repro, EmpleadoVO empleado, TipoActuacionVO tipoActuacion) {
		super();
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.precioHora = precioHora;
		this.descripcion = descripcion;
		this.km = km;
		this.dietas = dietas;
		this.visado = visado;
		this.repro = repro;
		this.empleado = empleado;
		this.tipoActuacion = tipoActuacion;
	}

	public ActuacionVO(String horaInicial, String horaFinal, float precioHora, String descripcion, float km,
			float dietas, float visado, float repro, LocalDate fecha, EmpleadoVO empleado,
			TipoActuacionVO tipoActuacion) {
		super();
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.precioHora = precioHora;
		this.descripcion = descripcion;
		this.km = km;
		this.dietas = dietas;
		this.visado = visado;
		this.repro = repro;
		this.fecha = fecha;
		this.empleado = empleado;
		this.tipoActuacion = tipoActuacion;
	}

	public ActuacionVO(int idActuaciones, String horaInicial, String horaFinal, float precioHora, String descripcion,
			float km, float dietas, float visado, float repro) {
		super();
		this.idActuaciones = idActuaciones;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.precioHora = precioHora;
		this.descripcion = descripcion;
		this.km = km;
		this.dietas = dietas;
		this.visado = visado;
		this.repro = repro;
	}

	public int getIdActuaciones() {
		return idActuaciones;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getKm() {
		return km;
	}

	public float getDietas() {
		return dietas;
	}

	public float getVisado() {
		return visado;
	}

	public float getRepro() {
		return repro;
	}

	public EmpleadoVO getEmpleado() {
		return empleado;
	}

	public TipoActuacionVO getTipoActuacion() {
		return tipoActuacion;
	}

	public void setIdActuaciones(int idActuaciones) {
		this.idActuaciones = idActuaciones;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public void setDietas(float dietas) {
		this.dietas = dietas;
	}

	public void setVisado(float visado) {
		this.visado = visado;
	}

	public void setRepro(float repro) {
		this.repro = repro;
	}

	public void setEmpleado(EmpleadoVO empleado) {
		this.empleado = empleado;
	}

	public void setTipoActuacion(TipoActuacionVO tipoActuacion) {
		this.tipoActuacion = tipoActuacion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horaFinal == null) ? 0 : horaFinal.hashCode());
		result = prime * result + ((horaInicial == null) ? 0 : horaInicial.hashCode());
		result = prime * result + idActuaciones;
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
		ActuacionVO other = (ActuacionVO) obj;
		if (horaFinal == null) {
			if (other.horaFinal != null)
				return false;
		} else if (!horaFinal.equals(other.horaFinal))
			return false;
		if (horaInicial == null) {
			if (other.horaInicial != null)
				return false;
		} else if (!horaInicial.equals(other.horaInicial))
			return false;
		if (idActuaciones != other.idActuaciones)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ActuacionVO [idActuaciones=" + idActuaciones + ", horaInicial=" + horaInicial + ", horaFinal="
				+ horaFinal + ", precioHora=" + precioHora + ", descripcion=" + descripcion + ", km=" + km + ", dietas="
				+ dietas + ", visado=" + visado + ", repro=" + repro + ", empleado=" + empleado + ", tipoActuacion="
				+ tipoActuacion + "]";
	}
	
	

}
