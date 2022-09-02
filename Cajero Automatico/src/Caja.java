import java.util.Scanner;

public class Caja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int opcion;
		boolean salir = true;

		Scanner entrada = new Scanner (System.in);
		EntornoGrafico leyendas = new EntornoGrafico();
		MovimientosCuenta cliente = new ExtractoPolimorfi();
		
		do 
		{	
			leyendas.leyenda("=============================\n");
			leyendas.leyenda("Digita la opcion\n");
			leyendas.leyenda("1 para = Ingresa dinero\n" 
							+ "2 para = Retira Dinero \n"
							+ "3 para = Mostrar Saldo Actual \n"
							+ "4 para = Mostrar sus Movimientos\n"
							+ "5 para = Mostrar sus debitos de Menor a Mayor\n"
							+ "6 para = Salir");
			opcion = entrada.nextInt();
			leyendas.leyenda("  \n");
			
			switch(opcion) {
				case 1:
						leyendas.leyenda("Digita cantidad a ingresar");
						cliente.setPlata(entrada.nextFloat());
						
						cliente.depositoPlata();
						break;
				
				case 2:
						leyendas.leyenda("Digita cantidad a retirar");
						cliente.setPlata(entrada.nextFloat());
						
						cliente.retiroPlata();
						break;
						
				case 3:
						cliente.saldoActual();;
						break;
						
				case 4:					
						cliente.resumenCuenta();
						break;
				
				case 5:
						cliente.ordenarDebitos();
						break;
						
				case 6:
						salir = false;
						leyendas.leyenda("Salio!. Vuelva Prontos"); 
						break;
					
				default: leyendas.leyenda("No selecciono ninguna opcion\n"); 
			}
		} while(salir);	 
		
	}

}
