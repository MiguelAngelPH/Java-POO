import java.util.Scanner;

public class main_Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
        
		System.out.println("Selcciona 1 para Cuadrado");
		System.out.println("Selcciona 2 para Rectangulo");
		System.out.println("Selcciona 3 para Triangulo");
		
		Scanner read = new Scanner(System.in);
		opcion = read.nextInt();
		
		cuadrado calculo1 = new cuadrado();
		Rectangulo calculo2 = new Rectangulo();
		Triangulo calculo3 = new Triangulo();
		
		switch(opcion)
        {
          
			case 1: 
				calculo1.area(0, 0);
				break;
			case 2: 
				calculo2.area(0, 0);
				break;
			case 3: 
				calculo3.area(0, 0);
				break;
			
        }

	}

}
