
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Propiedades Lanus = new Propiedades(001, "Lanus", "Monoambiente", "dolar", 1000);
		Propiedades Banfield = new Propiedades(005, "Banfield", "Depto", "dolar", 2000);
		Propiedades Lomas = new Propiedades(011, "Lomas", "Casa", "Pesos", 3580);
		Propiedades Gerli = new Propiedades(015, "Gerli", "Local", "dolar", 1200);
		
		String resultado;
		resultado = Lanus.Mostrar_Datos();
		System.out.println(resultado);
		
		resultado = Banfield.Mostrar_Datos();
		System.out.println(resultado);
		
		resultado = Lomas.Mostrar_Datos();
		System.out.println(resultado);
		
		resultado = Gerli.Mostrar_Datos();
		System.out.println(resultado);
		
		
	}

}
