package persona;

public class Profesor extends Persona {

	private String materia;
	private String cargo;

	public Profesor() {
	}
	
	public Profesor(String mat, String car) {
		this.materia=mat;
		this.cargo=car;
	}
	
	public String getCargo() {
		return this.cargo;
		
	}
	
	public String getMateria() {
		return this.materia;
	}
	
	public void setCargo(String car) {
		this.cargo=car;
		
	}
	
	public void setMateria(String mat) {
		this.materia=mat;
	}
	
	
}
