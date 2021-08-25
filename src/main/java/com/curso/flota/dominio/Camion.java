package com.curso.flota.dominio;

public class Camion extends Vehiculo {
	
	private int numEje;

	public Camion(String matricula, double cargaMaxima, double cargaInicial, int numEje) {
		super(cargaMaxima, matricula, cargaInicial);
		// TODO Auto-generated constructor stub
		this.numEje=numEje;
	}


	@Override
	public double CalcularFuel() {
		// TODO Auto-generated method stub
		double consumo=this.getCargaActual()*30+2*numEje;
		return consumo;
	}
	

}
