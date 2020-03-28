package com.ibm.Example;

import java.util.Arrays;
import java.util.List;

public class EjercicioLambdas {
	
    /**
     * 1.- Imprimir toda la lista c�mo si fuera una sola cadena.
     * 2.- Imprimir la primer letra de cada elemento de la lista para formar una palabra.
     */
    private void ejercicio1() {
        List<String> list = Arrays.asList(
        		"Hab�a una vez un ","oso que ", "le gustab", "a est","Ar ","Tod","o el ",
        		"d�a haciend","o la traga","sion ", ":ggg:", ")\n"
        );        

    }
    
    /**
     * Imprimir las palabras en MAYUSCULAS usando referencia al m�todo 'mayusculas'
     */
    private void ejercicio2() {
        List<String> list = Arrays.asList(
        		"Carlos","Alejandro", "Miguel", "Adriana","Ra�l","Angelica",
        		"Edgar","Jes�s","Sebastian", "Sion", "Anna", "Christian"
        );

    }
    
    public void mayusculas(String s) {
    	System.out.print(s.toUpperCase()+",");
    }
    

    //************TAREA usando Stream*******************
    /**
     * Convertir los numeros de tipo String a Integer y sumarlos
     */
    private void ejercicioT1() {
    	List<String> lista = Arrays.asList("1","2","3","4","5","6","7","8","9");
    	// TODO C�digo
    }
    
	/**
	 * Crear una funci�n lambda que regrese los nombres que contengan "A"
	 */
	private void ejercicioT2(){
		List<String> list = Arrays.asList(
        		"Carlos","Alejandro", "Miguel", "Adriana","Ra�l","Angelica",
        		"Edgar","Jes�s","Sebastian", "Sion", "Anna", "Christian"
        );
		//TODO C�digo
	}
	
    
    public static void main(String[] args) {
		EjercicioLambdas e = new EjercicioLambdas();
		
		System.out.println("\n\nEjercicio 1");
		e.ejercicio1();
		
		System.out.println("\n\nEjercicio 2");
		e.ejercicio2();
		
		System.out.println("\n\nEjercicio T1");
		e.ejercicioT1();
		
		System.out.println("\n\nEjercicio T2");
		e.ejercicioT2();
        
    }

}