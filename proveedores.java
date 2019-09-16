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
		hospitales[0] = "Hospital Centro Medico Maya  7926 0180";
		hospitales[1] = "Hospital Regional de Coban 79510030";
		hospitales[2] = "Hospital Nacional de Salama  7931 6500";
		hospitales[3] = "Hospital Nacional de Chimaltenango  7839 1876";
		hospitales[4] = "Hospital Nacional de Guastatoya  7945 1290";
		hospitales[5] = "Hospital Nacional de Escuintla 7931 4151";
		hospitales[6] = "Hospital Roosevelt 2321 7400";
		hospitales[7] = "Hospital de Jutiapa  7931 6900";
		hospitales[8] = "Hospital Nacional Nicolassa Cruz 7922 0343";
		hospitales[9] = "Hospital Regional de Zacapa 7931 6565";
		hospitales[10] = "Hospital Nacional Infantil Elisa Martinez 7932 0700";
		hospitales[11] = "Hospital Regional de Occidente 7763 5140";
		hospitales[12] = "Hospital Regional de Quiche 5002 8746";
		hospitales[13] = "Hospital Nacional de Retalhuleu  7932 8282";
		hospitales[14] = "Hospital Regional de Cuilapa 7886 5309";
		hospitales[15] = "Hospital Nacional de San Marcos 7774 0474";
		hospitales[16] = "Hospital Juan de Dios Rodas Solola  7762 4121";
		hospitales[17] = "Hospital de Mazatenango 7872 4818";
		hospitales[18] = "Hospital Nacional de Totonicapan 7932 1200";
		hospitales[19] = "Hospital Nacional Pedro de Bethancourt  7774 1414";
		hospitales[20] = "Hospital Nacional de Huehuetenango  7931 4646";
		hospitales[21] = "Hospital Nacional de Chiquimula  7931 5555";
	
		hoteles[0] = "Hotel Peten 2366 2841";
		hoteles[1] = "Hotel y Restaurante Casa Gaia 7941 7021";
		hoteles[2] = "Hotel San Jerónimo 7940 2634";
		hoteles[3] = "Crysol Center Hotel 7839 5974";
		hoteles[4] = "Camino Largo, Paseo del Rancho 7956 1100";
		hoteles[5] = "HOTEL SARITA 7888 0482";
		hoteles[6] = "Hyatt Centric 2217 6000";
		hoteles[7] = "Hotel Del Sol 7720 5100";
		hoteles[8] = "Hotel Puente Viejo 7922 3782";
		hoteles[9] = "Hotel Hacienda del Pedregal 5697 0826";
		hoteles[10] = "Hacienda Tijax Hotel y Marina 7930 5507";
		hoteles[11] = "Latam Hotel Plaza Pradera Quetzaltenango 7797 7676";
		hoteles[12] = "Hotel Villa Nebaj 7756 0005";
		hoteles[13] = "Hotel Posada de Don José 7962 2900";
		hoteles[14] = "Hotel el Delfin 5702 6701";
		hoteles[15] = "Hotel Dubai San Marcos 4219 6262";
		hoteles[16] = "Selina Atitlan 7762 1205";
		hoteles[17] = "Hotel y Restaurante COSTA VERDE 7961 2323";
		hoteles[18] = "Hacienda Grande Hotel 7737 5370 ";
		hoteles[19] = "Hotel Casa de María 7832 1294";
		hoteles[20] = "Hotel Ruinas Resort 7932 5555";
		hoteles[21] = "Hotel Maria Teresa 7942 0177";
		
		transporte[0] = "Litegua  4040 5249";
		transporte[1] = "Transportes Monja Blanca 7961 8484";
		transporte[2] = "Transportes Monja Blanca 4003 2818";
		transporte[3] = "Servicios Multiples Gonzalez 5715 7712";
		transporte[4] = "Litegua 4024 4568";
		transporte[5] = "Litegua 4024 4589";
		transporte[6] = "Transportes Linea Dorada 2415 8900";
		transporte[7] = "Litegua 5363 0843";
		transporte[8] = "Transportes Unidos Jalapanecos 2251 4760";
		transporte[9] = "Litegua 3012 5678";
		transporte[10] = "Litegua  7948 1172";
		transporte[11] = "Transportes Alamo Quetzaltenango 7884 0505";
		transporte[12] = "Asociacion De Transportistas Quichelenses 7755 4394";
		transporte[13] = "Transporte Rutas Nacionales 7771 0910";
		transporte[14] = "Transportes Ostua 7887 0058";
		transporte[15] = "TRANSPORTES MARQUENSITA  2251 3039";
		transporte[16] = "Litegua 5526 4650";
		transporte[17] = "Litegua Mazatenango 5552 6361";
		transporte[18] = "Transportes San Miguel 7766 2267";
		transporte[19] = "Transportes Jerisa 7831 2464";
		transporte[20] = "Transportes Los Halcones 7963 3000";
		transporte[21] = "Transportes Guerra Muterita 7942 0564";
	
		
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