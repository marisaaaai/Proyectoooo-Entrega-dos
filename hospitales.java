/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
hospitales*/
class hospitales extends proveedores{
	String[] hospitales = new String[22];
	public hospitales(){
		
		
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
	}
	public void addDB(String i, int d){
		hospitales[d] = hospitales[d] + " " + i; 
	}
	public String DB(int d){
		return hospitales[d]; 
	}
}