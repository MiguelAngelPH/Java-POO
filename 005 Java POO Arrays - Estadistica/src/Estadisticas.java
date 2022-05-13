import java.util.Scanner;

public class Estadisticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculo calculadora = new Calculo();
		
		Scanner lectura = new Scanner(System.in);
		
		int longitud = 0;
		
		System.out.println("Ingrese el tamano del vector");
		longitud = lectura.nextInt();
		calculadora.crearVector(longitud);
		
		calculadora.cargarVector();
		
		System.out.println("Maximo valor: " + calculadora.obtenerMaximo());
		System.out.println("Minimo valor: " + calculadora.obtenerMinimo());
		System.out.println("Promedio valor: " + calculadora.obtenerPromedio());
		
	}

}
