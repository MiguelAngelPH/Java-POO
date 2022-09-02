
public class ExtractoPolimorfi extends MovimientosCuenta{
	
	private float auxiliar = 0;
	EntornoGrafico leyen = new EntornoGrafico();
	
	
	public void ordenarDebitos() {
		// TODO Auto-generated method stub
		
		for(int c=0;c<(getContador2()-1);c++)
		{	
			for(int b=0;b<(getContador2()-1);b++)
			{	
				if(getDebitos()[b] > getDebitos()[b+1])
				{
					auxiliar = getDebitos()[b];
					getDebitos()[b] = getDebitos()[b+1];
					getDebitos()[b+1] = auxiliar;
					
				}
			}
			
		}
		
		leyen.leyenda("Sus debitos de menor a mayor son: \n");
		for(int j=0; j<getContador2();j++) 
		{	
			leyen.leyenda("Su debito: " + (j+1) + " es de: $" + getDebitos()[j] +"\n");
		}
	}
	
	
	public void resumenCuenta()
	{
		if(getContador() > 0)
		{
			leyen.leyenda("Sus depositos del mes son: \n");
			for(int i=0; i<getContador();i++)
				{	
					leyen.leyenda("Su deposito: " + (i+1) + " es de: $" + getHaberes()[i] +"\n");
				}
			leyen.leyenda("\n");
		}
		else
		{
			leyen.leyenda("No tiene Depositos del mes\n");
		}
		
		if(getContador2() > 0)
		{
			leyen.leyenda("Sus debitos del mes son: \n");
			for(int j=0; j<getContador2();j++) 
				{	
					leyen.leyenda("Su debito: " + (j+1) + " es de: $" + getDebitos()[j] +"\n");
				}
			leyen.leyenda("\n");
		}
		else
		{
			leyen.leyenda("No tiene Debitos del mes\n");
		}	
	}
}
