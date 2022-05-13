import java.util.Scanner;

public class Calculo {

	private int maximo = 0;
	private int minimo = 0;
	private double promedio = 0.0;
	private int longitud = 0;
	
	int[] valores;
	Scanner lectura = new Scanner(System.in);
	
	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
 	public void crearVector(int longitud) {
 		
 		valores = new int[longitud];
 		this.longitud = longitud;
 	}
 	
 	public void cargarVector() {
 		int i = 0;
 		System.out.println("ingrese valor de posicion" + 1);
 		for (i = 0; i<longitud; i++) {
 			valores[i] = lectura.nextInt();
 			
 		}
 	}	
 	public int obtenerMaximo() {
 		int i = 0;
 		
 		for(i=0;i<longitud;i++);{
 			if (maximo < valores[i]) {
 				maximo = valores[i];
 			}
 	
 		}
 		return maximo;
 	}
 	
 	public int obtenerMinimo() {
 		int i = 0;
 		
 		for(i=0;i<longitud;i++) {
 			if(minimo == 0);{
 	 			minimo = valores[i];
 			}
 			else
 			{
 				if(minimo>valores[i]){
 					minimo = valores[i];
 				} 				
 			}
 		}
 		return minimo;
 	}
 		
 	public double obtenerPromedio() {
 		int i = 0 ;
 		int acumulador = i;
 		
 		for(i=0;i<longitud;i++) {
 			acumulador = acumulador + valores[i];
 			
 		}
 		return (acumulador/longitud);
 	}
	
}
