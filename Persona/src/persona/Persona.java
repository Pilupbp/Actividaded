package persona;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		
	}
	
	public Persona (String nom, int annos) {
		this.nombre=nom;
		this.edad=annos;
	}

	public int getEdad() {
		return this.edad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setEdad(int annos) {
		this.edad=annos;
	}
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	
	
}
