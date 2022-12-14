package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	private LocalDateTime fechaMatricula;
	private BigDecimal valorMatricula;
	private Propietario pro;
	private Vehiculo ve;
	
	
	
	//
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getPro() {
		return pro;
	}
	public void setPro(Propietario pro) {
		this.pro = pro;
	}
	public Vehiculo getVe() {
		return ve;
	}
	public void setVe(Vehiculo ve) {
		this.ve = ve;
	}
	
	
	

}
