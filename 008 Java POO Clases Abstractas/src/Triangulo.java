import java.util.Scanner;

public class Triangulo extends Abs_Figura {

	int dato1;
	float area2;
	
	
	@Override
	public double area(int base, int altura) {
		// TODO Auto-generated method stub
		
		Scanner dato1 = new Scanner(System.in);
		System.out.println("carga Base :");
		base = dato1.nextInt();
		
		Scanner dato2 = new Scanner(System.in);
		System.out.println("carga la Altura :");
		altura = dato2.nextInt();
		;
		
		area2 = base * altura / 2;
		
		System.out.println("el area de tu Triangulo es: " + area2 + " cm2");
			
		return area2;
		
	}
	
}
