package com.curso.interfacesVolables;

import com.curso.interfacesVolables.padres.Kriptoniano;

public class Superman extends Kriptoniano implements ObjetoVolador {

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("salto y vuelo");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("aqui llega superman");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("no soy un pajaro, no soy un avion, soy superman ");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como lo que come cualquel homano");
	}

	public void saltarEditicios() {
		System.out.println("Salto desde un edificio y como si nada");
	}
	
	public void detenerBala() {
		System.out.println("Tengo piel de hierro, balas no me hace nada");
	}
}
