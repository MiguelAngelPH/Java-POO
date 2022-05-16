import java.util.Scanner;
public class Meteorologia {

	private int maxTemp = -60;
	private int maxHum = 0;
	private int maxPrecip = 0;
	
	private int minTemp = 60;
	private int minHum = 100;
	private int minPrecip = 500;		
			
	private double promTemp = 0; // Acumulador
	private double promHum = 0;
	private double promPrecip = 0;
	
	public int getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	public int getMaxHum() {
		return maxHum;
	}
	public void setMaxHum(int maxHum) {
		this.maxHum = maxHum;
	}
	public int getMaxPrecip() {
		return maxPrecip;
	}
	public void setMaxPrecip(int maxPrecip) {
		this.maxPrecip = maxPrecip;
	}
	public int getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}
	public int getMinHum() {
		return minHum;
	}
	public void setMinHum(int minHum) {
		this.minHum = minHum;
	}
	public int getMinPrecip() {
		return minPrecip;
	}
	public void setMinPrecip(int minPrecip) {
		this.minPrecip = minPrecip;
	}
	public double getPromTemp() {
		return promTemp;
	}
	public void setPromTemp(double promTemp) {
		this.promTemp = promTemp;
	}
	public double getPromHum() {
		return promHum;
	}
	public void setPromHum(double promHum) {
		this.promHum = promHum;
	}
	public double getPromPrecip() {
		return promPrecip;
	}
	public void setPromPrecip(double promPrecip) {
		this.promPrecip = promPrecip;
	}
	
	int medicionesT = 0; //contador
	int medicionesH = 0;
	int medicionesP = 0;
	
	double totalT = 0;
	double totalH = 0;
	double totalP = 0;
	
	public void cargaTemperatura() 
	{

	      Scanner lector = new Scanner(System.in);
	      int temperatura;
	      
	      System.out.println("Carga la temperatura");
	      temperatura = lector.nextInt();
	    
	      while((temperatura<-50) || (temperatura>60))
	    	  
	      {
	        
	        System.out.println("Medicion fuera de rango. Vuelva a ingresar.");
	        temperatura = lector.nextInt();
	        
	      }
	      
	      medicionesT = medicionesT + 1;
	  
	      if(temperatura > maxTemp)
	      {
	    	  setMaxTemp(temperatura);   
	      }
	      
	      if(medicionesT == 1)
	      {
	        setMinTemp(temperatura);
	      }else{
	    	if(temperatura < minTemp)
	    	{
	    		setMinTemp(temperatura);
	    	}
	      }
	      
	      promTemp = promTemp + temperatura;//acumulador
	      System.out.println("promTemp sumado" + promTemp);
	      totalT = promTemp / medicionesT; //calcula el promedio por cada carga
	      System.out.println("La temperatura promedio es:" + totalT);
	      System.out.println("La temperatura MAXIMA capturada es: " + maxTemp);
	      System.out.println("La temperatura MINIMA capturada es: " + minTemp);
	}
	
	public void cargaHumedad() 
	{

	      Scanner lector = new Scanner(System.in);
	      int humedad;
	      
	     
	      
	      
	      System.out.println("Carga la Humedad");
	      humedad = lector.nextInt();
	
	      while((humedad<0) || (humedad>100))
	    	  
	      {
	        System.out.println("Medici�n fuera de rango. Vuelva a ingresar.");
	        humedad = lector.nextInt();  
	      }
	      
	      medicionesH = medicionesH + 1;

	      if(humedad > maxHum)
	    	 
	      {
	    	  setMaxHum(humedad);
	      }
	      
	      if(medicionesH == 1)
	      {
	        setMinHum(humedad);
	      }else{
	    	if(humedad < minHum)
	    	{
	    		setMinHum(humedad);
	    	}
	      }
	      
	      promHum = promHum + humedad;//acumulador
	      System.out.println("humedad sumado" + promHum);
	      totalH = promHum / medicionesH; 
	      System.out.println("La humedad promedio es:" + totalH);
	      System.out.println("La humedad MAXIMA capturada es: " + maxHum);
	      System.out.println("La humedad MINIMA capturada es: " + minHum);
	}
	
	
	public void cargaPrecipitacion() 
	{

	      Scanner lector = new Scanner(System.in);
	      int precipitacion;
	      
	     
	      
	      
	      System.out.println("Carga la precipitacion");
	      precipitacion = lector.nextInt();
	      while((precipitacion<0))
	    	  
	      {
	        System.out.println("Medici�n fuera de rango. Vuelva a ingresar.");
	        precipitacion = lector.nextInt();  
	      }
	      
	      medicionesP = medicionesP + 1;

	      if(precipitacion > maxPrecip)
	    	 
	      {
	    	  setMaxPrecip(precipitacion);
	        
	      }
	      
	      if(medicionesP == 1)
	      {
	        setMinPrecip(precipitacion);
	      }else{
	    	if(precipitacion < minPrecip)
	    	{
	    		setMinPrecip(precipitacion);
	    	}
	      }
	      
	      promPrecip = promPrecip + precipitacion;//acumulador
	      System.out.println("precipitacion sumado" + promPrecip);
	      totalP = promPrecip / medicionesP; 
	      System.out.println("La precipitacion promedio es:" + totalP);
	      System.out.println("La precipitacion MAXIMA capturada es: " + maxPrecip);
	      System.out.println("La precipitacion MINIMA capturada es: " + minPrecip);
	}
	
	
}
