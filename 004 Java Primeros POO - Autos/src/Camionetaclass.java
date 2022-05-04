public class Camionetaclass extends Automovil {

	
	
	public Camionetaclass(int peso, int cilindrada, int velocidades) {
		this.Peso = peso;
		this.Cilindrada = cilindrada;
		this.Velocidades = velocidades;
	}
	
	
 	public int acelerar() {        //Cargo los metodos solicitados 
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
	public int carga() {   //Metodos Exclusivos de Camioneta 
		int carga = doblar() - frenar()  ;
			return carga;		
	}
	public int Descarga() {   //Metodos Exclusivos de Camioneta 
		int descarga = frenar() - doblar()  ;
			return descarga;		
	}
	
	
	 	
	
	
}
