package personas;

import persona.*;


public class Main {

	public static void main(String[] args) {
		
		Persona p=new Persona();
		p.setNombre("Pepe");
		p.setEdad(25);
		Estudiante e=new Estudiante();
		e.setNombre("Carlos");
		e.setEdad(45);
		e.setCarrera("Ingeniería");
		e.setTitulo( "Ingeniero Superior");
		Profesor pr=new Profesor();
		pr.setNombre("Raúl Salgado");
		pr.setEdad(54);
		pr.setMateria("Programación");
		pr.setCargo("Titular Departamento");
		System.out.println("Objeto de tipo Persona p");
		System.out.printf("Nombre: %s, Edad: %d \n",  p.getNombre(),p.getEdad());
		System.out.println("Objeto de tipo Estudiante e");	
		System.out.printf("Nombre: %s, Carrera: %s, Título: %s,Edad: %d \n", e.getNombre(), e.getCarrera(),e.getTitulo(),e.getEdad());
		System.out.println("Objeto de tipo Profesor pr");
		System.out.printf("Nombre: %s, Materia %s, Cargo: %s, Edad: %d \n", pr.getNombre(), pr.getMateria(), pr.getCargo(),pr.getEdad());
		System.out.println("Nombre Persona:" + p.getNombre() +" Nombre profesor : "+ pr.getNombre() + " Nombre Estudiante: "+ e.getNombre() );
		
	
	}	
	
	

}
