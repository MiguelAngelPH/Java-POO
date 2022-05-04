
public class Enfermeros extends Empleado {

	int matricula;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	String turno;
	
public String presentacion() {
	String presentar = apellido + " " + nombre + " " + turno;
			return presentar;
}	

}
