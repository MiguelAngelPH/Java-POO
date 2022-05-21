import java.util.Scanner;

public class Rectangulo extends Abs_Figura {

	int dato1;
	double area2;
	
	@Override
	public double area(int base, int altura) {
		// TODO Auto-generated method stub
		
		Scanner dato1 = new Scanner(System.in);
		System.out.println("carga la Base :");
		base = dato1.nextInt();  // cargue los parametros del metodo abstracto "area"
		
		Scanner dato2 = new Scanner(System.in);
		System.out.println("carga la Altura :");
		altura = dato2.nextInt();   
		
		
		area2 = base * altura;
		
		System.out.println("el area de tu Rectangulo es: " + area2 + " cm2");
			
		return area2;
	}
	

}
