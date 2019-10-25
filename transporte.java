/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
Transporte*/
class transporte{
		//Se instancia el array de hoteles
		public transporte{
			String[] transporte = new String[22];


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
		
		public void addDBtransporte(String i, int d){
			transporte[d] = transporte[d] + " " + i; 
		}

		public String DBtransporte(int d){
			return transporte[d]; 
		}
		
	}
}