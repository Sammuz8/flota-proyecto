package com.curso.interfacesVolables;

import com.curso.interfacesVolables.padres.Avion;

public class Helicoptero extends Avion {

	public Helicoptero(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularFuel() {
		// TODO Auto-generated method stub
		return 0;
	}

}
