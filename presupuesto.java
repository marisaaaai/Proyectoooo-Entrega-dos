/* Proyecto de POO
grupo cinco
Clase presupuesto*/
public class presupuesto{
	float gastos;
	float ingresos;
	float saldoneto;
	float ahorros;
	public presupuesto(float i){
		ingresos=i;

	}
	public String saldo(){
		this.saldoneto= ingresos - gastos;
		return "El saldo neto que usted posee es de: Q." +saldoneto+ ".";
	}
	
}
		