
public class Automovil {

	public int Cilindrada;
	public int Peso;
	public int Velocidades;
	
	public int getCilindrada() {
		return Cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		Peso = peso;
	}
	public int getVelocidades() {
		return Velocidades;
	}
	public void setVelocidades(int velocidades) {
		Velocidades = velocidades;
	}
	
	
	
	public String Mostrar_Datos() {
		 String Presentar;
		 
		 Presentar = "Su peso es de : "+getPeso()+", Num de Cilindrada: "+getCilindrada()+", nVelocidades:"+getVelocidades();
		 return Presentar;
	 	}
	
}
