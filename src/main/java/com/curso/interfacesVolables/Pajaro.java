package com.curso.interfacesVolables;

import com.curso.interfacesVolables.padres.Animal;

public class Pajaro extends Animal implements ObjetoVolador{

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("alzo las alas voy a volar");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("dejo de volar y guardo las alas");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("soy un pajaro y vuelo");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como bichos");
	}
	
	public void hacerNido() {
		System.out.println("estoy haciendo un nido en tu tejado");
	}

	public void ponerHuevos() {
		System.out.println("Voy a poner huevos pero no me lo robes");
	}
}
