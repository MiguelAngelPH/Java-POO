
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	Medicos Juan = new Medicos();// creo un OBJETO llamado Miguel	
	Medicos Carlos = new Medicos();
	Medicos Maria = new Medicos();
	
	Juan.setNombre("Juan");
	Juan.setApellido("Gonzalez");
	Juan.setEspecialidad("Gastroenterología");
	Juan.setMatricula(450450);
	
	Carlos.setNombre("Carlos");
	Carlos.setApellido("Lopez");
	Carlos.setEspecialidad("Dermatología");
	Carlos.setMatricula(808080);
	
	Maria.setNombre("Maria");
	Maria.setApellido("Fernandez");
	Maria.setEspecialidad("Neurología");
	Maria.setMatricula(450450);
	
	System.out.println(Juan.presentacion());
	System.out.println(Carlos.presentacion());
	System.out.println(Maria.presentacion());
	
	
	Enfermeros Pedro = new Enfermeros();
	Enfermeros Ramiro = new Enfermeros();
	
	Pedro.setNombre("Pedro");
	Pedro.setApellido("Vazquez");
	Pedro.setTurno("Mañana");
	
	Ramiro.setNombre("Ramiro");
	Ramiro.setApellido("Gutierrez");
	Ramiro.setTurno("Tarde");
	
	System.out.println(Pedro.presentacion());
	System.out.println(Ramiro.presentacion());
	
	}
}
