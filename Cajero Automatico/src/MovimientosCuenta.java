
public class MovimientosCuenta extends Operaciones {
	
	private int contador = 0;
	private int contador2 = 0;
	private float saldoActual = 0;
	private float [] haberes = new float[100];
	private float [] debitos = new float[100];
	private float plata;
	
	EntornoGrafico leyen = new EntornoGrafico();

	@Override
	public void depositoPlata() {
		// TODO Auto-generated method stub
		
		saldoActual += plata;	 
		haberes[contador] = plata; 
		contador = contador +1;
		
		leyen.leyenda("Su Saldo es = $" + saldoActual + "\n");
	}

	@Override
	public void retiroPlata() {
		// TODO Auto-generated method stub
		if(plata > saldoActual)
		{
			leyen.leyenda("No tiene la cantidad Suficiente\n" 
								+ "Su Saldo es = $" + saldoActual + "\n");	
		}
		else
		{
		saldoActual = saldoActual - plata;
		
		debitos[contador2] = plata;
		contador2 = contador2 + 1;
		leyen.leyenda("Su Saldo es = $" + saldoActual + "\n");
		}
		
	}
	
	@Override
	public void saldoActual()
	{
		leyen.leyenda("Su Saldo es = $" + saldoActual + "\n");
	}
	
	public void resumenCuenta()
	{
	}
	
	public void ordenarDebitos()
	{	
	}
	
	
	
		
	// getters and setters	
	
	

	public float getPlata() {
		return plata;
	}

	public void setPlata(float plata) {
		this.plata = plata;
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getContador2() {
		return contador2;
	}

	public void setContador2(int contador2) {
		this.contador2 = contador2;
	}
	public float[] getHaberes() {
		return haberes;
	}

	public void setHaberes(float[] haberes) {
		this.haberes = haberes;
	}

	public float[] getDebitos() {
		return debitos;
	}

	public void setDebitos(float[] debitos) {
		this.debitos = debitos;
	}

}
