public class Propiedades {
	
 int Nprop;
 public int getNprop() {
	return Nprop;
}
public void setNprop(int nprop) {
	Nprop = nprop;
}
public String getDesc_prop() {
	return Desc_prop;
}
public void setDesc_prop(String desc_prop) {
	Desc_prop = desc_prop;
}
public String getSuperf() {
	return Superf;
}
public void setSuperf(String superf) {
	Superf = superf;
}
public String getTipo_oper() {
	return Tipo_oper;
}
public void setTipo_oper(String tipo_oper) {
	Tipo_oper = tipo_oper;
}
public int getValor() {
	return Valor; 
}
public void setValor(int valor) {
	Valor = valor;
}
String Desc_prop;
 String Superf;
 String Tipo_oper;
 int Valor;
 
 
 
 public Propiedades(int nprop, String desc_prop, String superf, String tipo_oper, int valor) {
	 this.Nprop = nprop;
	 this.Desc_prop = desc_prop;
	 this.Superf = superf;
	 this.Tipo_oper = tipo_oper;
	 this.Valor = valor;
	 
 }
 
 public String Mostrar_Datos() {
	 String Presentar;
	 
	 Presentar = "Numero de propiedad es: "+getNprop()+", Lugar: "+getDesc_prop()+", Tipo: "+getSuperf();
	 Presentar = Presentar + ", En Moneda: "+getTipo_oper()+", Costo: $"+getValor();
	 return Presentar;
	 
 	}
 
 
}
