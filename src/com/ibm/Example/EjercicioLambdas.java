package com.ibm.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjercicioLambdas {
	/**
	 * Generador de lista Developers
	 */
	private List<Developer> getDevelopers() {
		List<Developer> devs = new  ArrayList<>();
		
		devs.add(new Developer("Alejandro" , 38000, 33));
		devs.add(new Developer("Roberto"   , 20000, 28));
		devs.add(new Developer("Fernando"  , 30000, 20));
		devs.add(new Developer("LadyGaga"  , 70000, 35));
		
		return devs;
	}
	
	/**
	 * Ejercicio 1
	 * Sustituir la clase an�nima por una Lambda e imprimir los registros
	 */
	private void ejercicio1() {
		List<Developer> devs = getDevelopers();
		
		System.out.println("Before sort");
		for(Developer dev : devs) {
			System.out.println(dev);
		}
		
		devs.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer d1, Developer d2) {
				return d1.getSalary().compareTo(d2.getSalary());
			}
		});

		//TODO c�digo
		devs.sort(  (Developer dev1, Developer dev2) -> {return dev1.getAge().compareTo(dev2.getAge());});
		devs.sort(  (dev1, dev2) -> {return dev1.getAge().compareTo(dev2.getAge());} );
		devs.sort(  (dev1, dev2) ->  dev1.getAge().compareTo(dev2.getAge()) );
		
		System.out.println("After sort");
		for (Developer developer: devs) {
			System.out.println(developer);
		}
		
	}
	
    /**
     * Ejercicio 2
     * 1.- Imprimir toda la lista c�mo si fuera una sola cadena.
     * 2.- Imprimir la primer letra de cada elemento de la lista para formar una palabra (usar String.charAt().
     */
    private void ejercicio2() {
        List<String> list = Arrays.asList(
        		"Hab�a una vez un ","oso que ", "le gustab", "a est","Ar ","Tod","o el ",
        		"d�a haciend","o la traga","sion ", ":ggg:", ")\n"
        );
        // TODO C�digo
        list.forEach( s -> System.out.print(s) );
        
        list.forEach( palabra -> System.out.print(palabra.charAt(0)) );
    }
    
    /**
     * Ejercicio 3
     * Imprimir las palabras en MAYUSCULAS usando una lambda
     */
    private void ejercicio3() {
        List<String> list = Arrays.asList(
        		"Carlos","Alejandro", "Miguel", "Adriana","Ra�l","Angelica",
        		"Edgar","Jes�s","Sebastian", "Sion", "Anna", "Christian"
        );
        // TODO C�digo
        list.forEach( (s) -> {s=s.toUpperCase(); System.out.println(s);} );
    }
    

    /*----------------------------------------------------------------
    /************TAREA para cuando sepan Streams*******************
	/*----------------------------------------------------------------
    /**
     * Convertir los numeros de tipo String a Integer y sumarlos
     */
    private void ejercicioT1() {
    	List<String> lista = Arrays.asList("1","2","3","4","5","6","7","8","9");
    	
    	// TODO C�digo
    	
    }
    
	/**
	 * Crear una funci�n lambda que regrese solo los nombres que contengan una "A"
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
		
		System.out.println("\n\nEjercicio 3");
		e.ejercicio3();
		
		System.out.println("\n\nEjercicio T1");
		e.ejercicioT1();
		
		System.out.println("\n\nEjercicio T2");
		e.ejercicioT2();
        
    }

}