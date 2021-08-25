package com.curso.flota.dominio;

import java.io.Serializable;

public class Caja implements Serializable{

	private static final long serialVersionUID=1L;
	private double peso;

	public Caja(double peso) {
		super();
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Caja [peso=" + peso + "]";
	}

	
	

}
