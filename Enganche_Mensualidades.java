package com.estructurasSelectivas.com.ejercicio3;

import java.util.Scanner;

public class Enganche_Mensualidades {

	public static void main(String[] args) {
		//* Calcule el importe del enganche y las mensualidades para comprar un vehiculo.
		//costo , enganche , mensualidad */
		Scanner entrada = new Scanner(System.in);
		double costo, enganche, mensualidad;
		System.out.println("Ingresa el costo total del vehiculo: ");
		costo = entrada.nextDouble();
		enganche = costo*0.35;
		if(enganche>0){
			mensualidad = (costo-enganche)/18;
			System.out.println("El enganche fue de: " + enganche);
			System.out.println("Las mensualidades son de: " + mensualidad);
		}//
		entrada.close();
	}
	//91

}
