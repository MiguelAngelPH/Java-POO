public class Automovilclass extends Automovil {
	
	public int Puertas;
	public String Aire;
	
	public int getPuertas() {
		return Puertas;
	}

	public void setPuertas(int puertas) {
		Puertas = puertas;
	}

	public String getAire() {
		return Aire;
	}

	public void setAire(String aire) {
		Aire = aire;
	}
	
	
	
	public Automovilclass(int puertas, String aire, int peso, int cilindrada, int velocidades) {
		this.Peso = peso;
		this.Cilindrada = cilindrada;
		this.Velocidades = velocidades;
		this.Puertas = puertas;
		this.Aire = aire;
	}
	

	
	public int acelerar() {        //Cargo los metodos de Automovil 
		int aceleracion = Cilindrada * 1000 ;
			return aceleracion;
	}
	public int frenar() {
    	int frenado = Cilindrada - 1000 ;
			return frenado;		
	}
	public int doblar() {
		int vuelta = acelerar() - frenar()  ;
			return vuelta;		
	}
	
	 public String Mostrar_Datos() {
		 String Presentar;
		 
		 Presentar = "Su peso es de : "+getPeso()+", Num de Cilindrada: "+getCilindrada()+", nVelocidades:"+getVelocidades();
		 Presentar = Presentar + "n Puertas; "+getPuertas()+", A/C ;"+getAire();
		 return Presentar;
	 	}
	
	
}
