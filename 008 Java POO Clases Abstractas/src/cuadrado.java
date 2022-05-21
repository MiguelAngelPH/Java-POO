import java.util.Scanner;

public class cuadrado extends Abs_Figura {

	int dato1;
	double area2;
	
	
	
	
	
	
	@Override
	public double area(int base, int altura) {
		// TODO Auto-generated method stub
		
		
		Scanner dato1 = new Scanner(System.in);
		System.out.println("carga Lado1 :");
		base = dato1.nextInt();
		
		Scanner dato2 = new Scanner(System.in);
		System.out.println("carga Lado2 :");
		altura = dato2.nextInt();
		;
		
		area2 = base * altura;
		
		System.out.println("el area de tu cuadrado es: " + area2 + " cm2");
			
		return area2;
	}

	
	
}
