/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
Hoteles*/
class hoteles{
		//Se instancia el array de hoteles
		String[] hoteles = new String[22];
		
		//se instancian hoteles iniciales
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
		
	//Se definen los metodos a usar
	public String DBhoteles(int d){
		return hoteles[d]; 
	}
	public void addDBhoteles(String i, int d){
		hoteles[d] = hoteles[d] + " " + i; 
	}
}