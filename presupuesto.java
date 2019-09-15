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
	//muestra el saldo de la persona 
	public String saldo(){ 
		gastos = gastoAgua + gastoBancos + gastoComida + gastoEducacion + gastoLuz + gastoPersonal + gastoSalud + gastoTransporte + gastoVivienda;
		saldoneto = ingresos - gastos; 
		return "El saldo neto que usted posee es de: Q." +saldoneto+ ".";
	}
	//muestra que hacer dependiendo de sus gastos
	public String analisis(){
		//valor aproximado para saber si el gasto en cada area es muy alto 
		if (gastoComida>1000){
			return "Dirijase a nuestro menu de recetas para saber como cocinar de manera mas economica.";
		}
		else if (gastoLuz>500){
			return"Dirijase a nuestro menu de recomendaciones para saber como ahorrar dinero con pequeñas acciones.";
		}
		else if (gastoAgua>500){
			return"Dirijase a nuestro menu de recomendaciones para saber como ahorrar dinero con pequeñas acciones.";
		}
		//aca deberiamos agregar negocios locales mas economicos 
		else if (gastoPersonal>500){
			return"Dirijase a nuestro menu de recomendaciones para saber como ahorrar dinero con pequeñas acciones.";
		}
		else if (gastoTransporte>800){
			return"Dirijase a nuestro menu de recomendaciones para saber como ahorrar dinero con pequeñas acciones.";
		}
	}
}
		