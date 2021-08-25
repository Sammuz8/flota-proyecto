package com.curso.interfacesVolables.padres;

import com.curso.interfacesVolables.ObjetoVolador;

public abstract class Avion extends Vehiculo implements ObjetoVolador{

	public Avion(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("guardo las ruedas voya adespegar");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("saco las ruedas preparo para aterrizar");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("soy un avion, vuelo aunque llueva");
	}

}
