package com.escuela;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EscuelaMetodos implements InterfaceEscuela {
	
	//Metodo que inicializa valores en 0 para poder luego incrementar con addAlumno()
	public void init(Map<String, Integer> hash) {
		for(Nacionalidades nacionalidades: Nacionalidades.values()) {
			hash.put(nacionalidades.toString(), 0);
		}
	}
		
	
	@Override
	public void addAlumno(Map<String, Integer> hash, String nacionalidad) {
		//Añade la nacionalidad de un nuevo alumno
		Integer value = hash.get(nacionalidad); 
		if(hash.containsKey(nacionalidad)) {
			value++;
			hash.put(nacionalidad, value);				
		}
	}
	

	@Override
	public void showAll(Map<String, Integer> hash) {
		//Muestra el nÃºmero de alumnos por nacionalidad
		Iterator iterator = hash.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();			
			System.out.println(alumnos.getKey() + ": " + alumnos.getValue());
		}	
	}

	@Override
	public void showNacionalidad(Map<String, Integer> hash, String nacionalidad) {
		//Muestra el nÃºmero de alumnos por nacionalidad y alumnos de esa nacionalidad 
		if(hash.containsKey(nacionalidad)) {
			System.out.println(nacionalidad + ": " + hash.get(nacionalidad));
		}else {
			System.out.println("Nacionalidad no encontrada");
		}
	}

	@Override
	public void cuantos(Map<String, Integer> hash) {		
		//Muestra cuantas nacionalidades diferentes hay en la escuela
		Iterator iterator = hash.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();
			System.out.println(alumnos.getKey());
		}
		/*
		 * hash.entrySet () 
		 * Se usa para recuperar todos los pares clave-valor llamados Map.Entries
		 *  y almacena internamente en un conjunto.
		 *  
		 * hash.entrySet().iterator() 
		 * Devuelve un iterador que actúa como un cursor y apunta al primer elemento 
		 * del conjunto y continúa hasta el final.
		 * 
		 * hashIterator.hasNext()
		 * Comprueba el siguiente elemento del conjunto y devuelve un valor booleano
		 * 
		 * hmIterator.next() 
		 * Devuelve el siguiente elemento (Map.Entry) del conjunto.
		 * 
		 * mapElement.getKey() 
		 * Devuelve la clave del Map.Entry asociado
		 * 
		 * mapElement.getValue () 
		 * Devuelve el valor del Map.Entry asociado			
		 * */
	}

	@Override
	public void borra(Map<String, Integer> hash, String nacionalidad) {
		//Borra la nacionalidad
		if(hash.containsKey(nacionalidad)) {
			//hash.remove(nacionalidad);
			//Si se borra despues no puede ser aÃ±Ã±adida a no ser encontrada como key
			hash.put(nacionalidad, 0);
		}else {
			System.out.println("Nacionalidad no encontrada");
		}		
	}
	
}