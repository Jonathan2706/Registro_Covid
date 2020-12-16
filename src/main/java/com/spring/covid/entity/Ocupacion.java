package com.spring.covid.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Ocupacion implements Serializable{

	                      
	
	// Conexion
	
	
	
	
	
	
	
	
	

	private static final long serialVersionUID = 2961071744244880471L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	
	@Column
	private String positivo;
	
	@Column
	private String negativo;
	
	@Column
	private String hospital;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPositivo() {
		return positivo;
	}

	public void setPositivo(String positivo) {
		this.positivo = positivo;
	}

	public String getNegativo() {
		return negativo;
	}

	public void setNegativo(String negativo) {
		this.negativo = negativo;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Ocupacion [id=" + id + ", positivo=" + positivo + ", negativo=" + negativo + ", hospital=" + hospital
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((negativo == null) ? 0 : negativo.hashCode());
		result = prime * result + ((positivo == null) ? 0 : positivo.hashCode());
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
		Ocupacion other = (Ocupacion) obj;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (negativo == null) {
			if (other.negativo != null)
				return false;
		} else if (!negativo.equals(other.negativo))
			return false;
		if (positivo == null) {
			if (other.positivo != null)
				return false;
		} else if (!positivo.equals(other.positivo))
			return false;
		return true;
	}
	
	
	

}