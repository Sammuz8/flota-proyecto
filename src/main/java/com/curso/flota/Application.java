package com.curso.flota;

import org.apache.log4j.Logger;

import com.curso.flota.dominio.Barcaza;
import com.curso.flota.dominio.Caja;
import com.curso.flota.dominio.Camion;
import com.curso.flota.dominio.Vehiculo;
import com.curso.flota.informes.InformeFlota;

public class Application
{
	static Logger log=Logger.getLogger(Application.class); 
	public static void main( String[] args )
	{
/*		Vehiculo v= new Vehiculo(1000.0, "F121");
		Vehiculo v2= new Vehiculo(300.0, "U421");
		Vehiculo v3=v;
		int nota=8;
*/		
//		System.out.printf("Antes Carga maxima es %f, y nota %d", v2.getCargaMaxima(), nota);		
//		generarVehiculo(v2,nota);		
//		System.out.printf("\nDespues Carga maxima es %f, y nota %d", v2.getCargaMaxima(), nota);
	
/*		Caja caja= new Caja(200);
		System.out.println(v);
		System.out.println(v.cargar(caja));
		System.out.println(v);
*/
		
		//Prueba Consumo
		Vehiculo[]lista = new Vehiculo[3];
		lista[0]=new Camion("C1111",500,10,4);
		lista[1]=new Barcaza("B24124",500,10);
		lista[2]=new Camion("C32324",500,10,3);
		new InformeFlota().informeConsumo(lista);
	}

	private static void generarVehiculo(Vehiculo v, int nota) {
		// TODO Auto-generated method stub
		Vehiculo v4=v;
		nota=9;
		v4.setCargaMaxima(555.0);
		//Vehiculo v5= new Vehiculo(4000,"M341");
	}
}