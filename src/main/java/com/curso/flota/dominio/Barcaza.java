package com.curso.flota.dominio;

public class Barcaza extends Vehiculo {

	public Barcaza(String matricula, double cargaMaxima, double cargaInicial) {
		super(cargaMaxima, matricula, cargaInicial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularFuel() {
		// TODO Auto-generated method stub
		return this.getCargaActual()*45;
	}

}
