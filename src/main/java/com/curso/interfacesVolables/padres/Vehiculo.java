package com.curso.interfacesVolables.padres;

import java.io.Serializable;

import com.curso.flota.dominio.Caja;

/**
 * Clase que modela ls datos de un vehiculo
 * la carga maxima se asigna en kg
 * 
 * @author sam
 *
 */
public abstract class Vehiculo implements Serializable{

	private static final long serialVersionUID=1L;
		
	//attributos
	
	private double cargaMaxima;
	private String matricula;
	private double cargaActual;
	private int numCajas;
	
	//contructores	

	public Vehiculo(double cargaMaxima, String matricula) {
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
		this.cargaActual = 0;
		this.numCajas = 0;
	}
	public Vehiculo(double cargaMaxima, String matricula, double cargaInicial) {
		this(cargaMaxima, matricula);
		this.cargaActual=cargaInicial;
	}


	//metodos
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCargaActual() {
		return cargaActual;
	}

	public int getNumCajas() {
		return numCajas;
	}

	public String cargar(Caja caja) {
		String msg="";
		if ((getCargaActual()+caja.getPeso())<=getCargaMaxima()) {
			this.cargaActual+=caja.getPeso();
			this.numCajas++;
			msg="Caja Cargado";
		}else {
			msg="La caja es demasiado pesado";
		}
		return msg;
	}
	public abstract double CalcularFuel();

	@Override
	public String toString() {
		return "Vehiculo [cargaMaxima=" + cargaMaxima + ", matricula=" + matricula + ", cargaActual=" + cargaActual
				+ ", numCajas=" + numCajas + "]";
	}
	
}
