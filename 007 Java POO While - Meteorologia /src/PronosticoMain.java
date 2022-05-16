import java.util.*;
import java.util.Scanner;
public class PronosticoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Carga las condiciones del clima "
					+ " por dia y obtendras el promedio4,"
					+ " la maxima y la minima de la semana");
        
        Scanner lector = new Scanner(System.in);
        String pregunta = "";
        
        Meteorologia meteo = new Meteorologia();
        
        while(pregunta!="N") // Apunte, me falta arreglar este While
        {
          
          meteo.cargaTemperatura();
          System.out.println(" ");
          meteo.cargaHumedad();
          System.out.println(" ");
          meteo.cargaPrecipitacion();
          
          System.out.println("Presione N si ya no quiere cargar mas datos)");
          pregunta = lector.nextLine();
        }
        
		
	}

}
