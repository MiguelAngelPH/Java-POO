
public class Medicos extends Empleado {
	
	int matricula;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	String especialidad;
	
public String presentacion() {
	String presentar = apellido + " " + nombre + " " + especialidad;
			return presentar;
}

}
