package persona;

public class Estudiante extends Persona {
	 private String carrera;
	 private String titulo;

	 public Estudiante() {
		 
	 }
	 
	 public Estudiante(String car, String tit) {
		 this.carrera=car;
		 this.titulo=tit;
	 }
	 
	 public String getCarrera() {
		 return this.carrera;
	 }
	 
	 public String getTitulo() {
		 return this.titulo;
	 }
	 
	 public void setTitulo(String tit) {
		 this.titulo=tit;
	 }
	 
	 public void setCarrera(String car) {
		 this.carrera=car;
		 
		 
	 }
	 
}
