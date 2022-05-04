
public class GARAGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camionetaclass Silverado = new Camionetaclass(3400, 8, 6);
		Camionetaclass F100 = new Camionetaclass(3000, 6, 5);
		
		Automovilclass Focus = new Automovilclass(4, "SI", 1200, 4 , 6);
		Automovilclass Civic = new Automovilclass(2, "SI", 1250, 2, 5);
		
		
		
		String datos;
		datos = Silverado.Mostrar_Datos();
		System.out.println(datos);
		
		datos = F100.Mostrar_Datos();
		System.out.println(datos);
		
		datos = Focus.Mostrar_Datos();
		System.out.println(datos);
		
		datos = Civic.Mostrar_Datos();
		System.out.println(datos);
	
	}


}