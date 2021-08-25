package com.curso.interfacesVolables;

public class Aeropuerto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeropuerto aeropuertoLondres = new Aeropuerto();

		Helicoptero helicoptero = new Helicoptero(2000, "Heli1");
		Hidroavion hAvion = new Hidroavion(3000, "Hidro1");
		Superman sup = new Superman();
		Pajaro paj = new Pajaro();
		ObjetoVolador[] voladores = new ObjetoVolador[] { helicoptero, sup, hAvion, paj };

		for (ObjetoVolador objetoVolador : voladores) {
			aeropuertoLondres.darPermisoAterrizar(objetoVolador);
		}

	}
	private void darPermisoVolar(ObjetoVolador v) {
		v.despegar();
	}
	private void darPermisoDespegar(ObjetoVolador v) {
		v.despegar();
	}
	private void darPermisoAterrizar(ObjetoVolador v) {
		v.aterrizar();
	}
}
