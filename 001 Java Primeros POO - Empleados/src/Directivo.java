
public class Directivo extends Empleado{
String depto;

public void darOrden(){
	System.out.println("Orden");
	
}

public String getDepto() {
	return depto;
}

public void setDepto(String depto) {
	this.depto = depto;
}
}
