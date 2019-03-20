package com.escuela;

import java.util.Map;

public enum Nacionalidades {
		MEXICANA("Mexicana", 1),
		ESTADOUNIDENSE("Estadounidense", 2),
		BRASILENO("Brasileño", 3),
		PERUANO("Peruano", 4);
	
	private String nacionalidad;
	private int id;
	
	private Nacionalidades(String nacionalidad, int id) {
		this.nacionalidad = nacionalidad;
		this.id = id;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}	
	
	public int getId() {
		return id;
	}
	/*
	public void addAlumno(Map<String, Integer> hash, String nacionalidad) {

	}
	*/
}
