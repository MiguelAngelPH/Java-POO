
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prueba");
		
Empleado empleado_generico = new Empleado();
empleado_generico.setApellido("Perez");
System.out.println(empleado_generico.getApellido());

Directivo generico_directivo = new Directivo();
generico_directivo.darOrden();
	}

}

