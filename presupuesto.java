/* Proyecto de POO
grupo cinco
Clase presupuesto*/
public class presupuesto{
	float gastos;
	float ingresos;
	float saldoneto;
	float ahorros;
	float gastoLuz:
	float gastoAgua;
	float gastoTransporte;
	float gastoBancos;
	float gastoVivienda;
	float gastoComida;
	float gastoEducacion;
	float gastoPersonal;
	float gastoSalud;
	
	public presupuesto(float i, float gl, float ga, float gt, float gb, float gv, float gc, float ge, float gp, float gs){
		ingresos=i;
		gastoLuz=gl:
		gastoAgua=ga;
		gastoTransporte=gt;
		gastoBancos=gb;
		gastoVivienda=gv;
		gastoComida=gc;
		gastoEducacion=ge;
		gastoPersonal=gp;
		gastoSalud=gs;
	}
	public String saldo(){
		this.saldoneto= ingresos - gastos;
		return "El saldo neto que usted posee es de: Q." +saldoneto+ ".";
	}
	
}
		