package com.escuela;

import java.util.Map;
import java.util.Scanner;

public class ElegirMetodo extends EscuelaMetodos {
	EscuelaMetodos metodos = new EscuelaMetodos();

	public void texto() {	
		System.out.println("Que desea hacer: \n"
				+ " 1: A�adir la nacionalidad de un nuevo alumno \n "
				+ "2: Ver el numero de alumnos por nacionalidad \n "
				+ "3: Ver el numero de alumnos de una nacionalidad \n " 
				+ "4: Ver las nacionalidades de la escuela \n "
				+ "5: Borra una nacionalidad \n" 
				+ "6: Salir"
				);
	}

	public void queNacionalidad() {
		System.out.println("Que nacionalidad: \n" );
		for(Nacionalidades nacionalidades: Nacionalidades.values()) {
			System.out.println(nacionalidades.getId() + ": " + nacionalidades.getNacionalidad());		
		}
	}

	public void escogerMetodo(Map<String, Integer> hash) {
		//switch dentro de while con condicion de salir
		//guardar opcion de usuario		
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean salir = false;
		while (!salir) {
			texto();
			opcion = sc.nextInt();
			switch (opcion) {
			case (1):
				queNacionalidad();
				Scanner sc1 = new Scanner(System.in);
				int opNac = sc1.nextInt();
				addAlumno(hash, Nacionalidades.values());
				/*
				switch (opNac) {
				case (1):
					addAlumno(hash, Nacionalidades.MEXICANA.toString());
					break;
				case (2):
					addAlumno(hash, Nacionalidades.ESTADOUNIDENSE.toString());
					break;
				case (3):
					addAlumno(hash, Nacionalidades.BRASILENO.toString());
					break;
				case (4):
					addAlumno(hash, Nacionalidades.PERUANO.toString());
					break;
				default:
					System.out.println("Opcion no encontrada");
					break;
				}
				*/
				break;

			case (2):
				showAll(hash);
				break;

			case (3):
				queNacionalidad();
				Scanner sc2 = new Scanner(System.in);
				int opt2 = sc2.nextInt();
				switch (opt2) {
				case (1):
					showNacionalidad(hash, Nacionalidades.MEXICANA.toString());
					break;
				case (2):
					showNacionalidad(hash, Nacionalidades.ESTADOUNIDENSE.toString());
					break;
				case (3):
					showNacionalidad(hash, Nacionalidades.BRASILENO.toString());
					break;
				case (4):
					showNacionalidad(hash, Nacionalidades.PERUANO.toString());
					break;
				default:
					System.out.println("Opción no encontrada");
					break;
				}
				break;

			case (4):
				cuantos(hash);
				break;

			case (5):
				queNacionalidad();
				Scanner sc3 = new Scanner(System.in);
				int opt3 = sc3.nextInt();
				switch (opt3) {
				case (1):
					borra(hash, Nacionalidades.MEXICANA.toString());
					break;
				case (2):
					borra(hash, Nacionalidades.ESTADOUNIDENSE.toString());
					break;
				case (3):
					borra(hash, Nacionalidades.BRASILENO.toString());
					break;
				case (4):
					borra(hash, Nacionalidades.PERUANO.toString());
					break;
				default:
					System.out.println("Opción no encontrada");
					break;
				}
				break;
			case (6):
				sc.close();
				salir = true;
			
				break;

			default:
				System.out.println("Opcion no encontrada");
				break;
			}
		}

	}

}
