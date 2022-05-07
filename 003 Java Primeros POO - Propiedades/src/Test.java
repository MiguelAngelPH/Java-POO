import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Propiedades Lanus = new Propiedades(001, "Lanus", "Monoambiente", "dolar", 1000);
		Propiedades Banfield = new Propiedades(005, "Banfield", "Depto", "dolar", 2000);
		Propiedades Lomas = new Propiedades(011, "Lomas", "Casa", "Pesos", 3580);
		Propiedades Gerli = new Propiedades(015, "Gerli", "Local", "dolar", 1200);
		
		
		System.out.println("Teclea la opcion");
		System.out.println("1 - Lanus");
		System.out.println("2 - Banfield");
		System.out.println("3 - Lomas");
		System.out.println("4 - Gerli");
		
		Scanner posicion = new Scanner(System.in);
		
		int opcion;
		String resultado;
		opcion = posicion.nextInt();
				
		switch(opcion) {
		case 1:
			resultado = Lanus.Mostrar_Datos();
			System.out.println(resultado);
			break;
		case 2:
			resultado = Banfield.Mostrar_Datos();
			System.out.println(resultado);
			break;
		case 3:	
			resultado = Lomas.Mostrar_Datos();
			System.out.println(resultado);
			break;
		case 4:
			resultado = Gerli.Mostrar_Datos();
			System.out.println(resultado);
			break;
		}
	}
}
