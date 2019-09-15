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
		
		// le agregamos a la base de datos hospitales iniciales
		hospitales[0] = "Hospital Centro Medico Maya";
		hospitales[1] = "Hospital Regional de Coban";
		hospitales[2] = "Hospital Nacional de Salama";
		hospitales[3] = "Hospital Nacional de Chimaltenango";
		hospitales[4] = "Hospital Nacional de Guastatoya";
		hospitales[5] = "Hospital Nacional de Escuintla";
		hospitales[6] = "Hospital Roosevelt";
		hospitales[7] = "Hospital de Jutiapa";
		hospitales[8] = "Hospital Nacional Nicolassa Cruz";
		hospitales[9] = "Hospital Regional de Zacapa";
		hospitales[10] = "Hospital Nacional Infantil Elisa Martinez";
		hospitales[11] = "Hospital Regional de Occidente";
		hospitales[12] = "Hospital Regional de Quiche";
		hospitales[13] = "Hospital Nacional de Retalhuleu";
		hospitales[14] = "";
		hospitales[15] = "";
		hospitales[16] = "";
		hospitales[17] = "";
		hospitales[18] = "";
		hospitales[19] = "";
		hospitales[20] = "Hospital Nacional de Huehuetenango";
		hospitales[21] = "Hospital Nacional de Chiquimula";
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