/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
Proveedores*/

class proveedores{
	// una matriz para cada base de datos y cada casilla va a ser un departamento (cuando busquemos hotel por departamento nos vamos a la casilla de ese numero)
	String[] hoteles;
	String[] hospitales;
	String[] transporte;
	
	public proveedores(){
		String[] hoteles = new String[22]; 
		String[] hospitales = new String[22];
		String[] transporte = new String[22]; 		
	}
	// los metodos que añaden infor. a la base de datos reciben la informacion y el # departamento
	public void addDBhoteles(String i, int d){
		hoteles[d] = hoteles[d] + " " + i; 
	}
	// los metodos que muestran la base de datos reciben el # departamento 
	public String DBhoteles(int d){
		return hoteles[d]; 
	}
	
	public void addDBhospitales(String i, int d){
		hospitales[d] = hospitales[d] + " " + i; 
	}

	public String DBhospitales(int d){
		return hospitales[d]; 
	}
	
	public void addDBtransporte(String i, int d){
		transporte[d] = transporte[d] + " " + i; 
	}

	public String DBtransporte(int d){
		return transporte[d]; 
	}
}