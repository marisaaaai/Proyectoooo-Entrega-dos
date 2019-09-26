/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
Enfermedades*/

class enfermedad{
	
	public enfermedad(){
		
	}
	//dependiendo el numero de sintoma es la enfermedad que puede tener
	public String diagnostico(int sintoma){
		if(sintoma == 1	){
			return "Neumonia infección respiratoria aguda que afecta a los pulmones, es  común  en menores de 5 años y personas de la tercera edad. Has Ingresado como sintoma principal 'tos', sin embargo los sintomas comunes son: fiebre alta, escalofríos, dolor intenso en el costado afectado del tórax, tos y expectoración. ";
		}
		else if(sintoma== 2){
			return "Resfriado comun, el dolor de garganta usualmente se debe a resfiados comunes, si usted presenta otros sintomas como: tos, ojos llorosos, estornudos y fiebre leve, puede que se deba a gripe. Si usted presenta dolor al tragar alimentos o liquidos y tiene amigdalas inflamadas, pueda que se deba a una infeccion de garganta";
		}
		else if(sintoma==3){
			return "El dolor de oido está relacionado a varias enfermedades, si usted tambien presenta dolores de cabeza y llanto, puede que sea Otitis media,lo que significa que tiene un espcio lleno de aire detrás del timpano. Si tiene sintomas como Sordera y enrojecimiento alrededor del oido puede que se deba a Otitis externa, a cual es una infeccion en el oido en las partes externas. Si presenta sesibilidad al sonido y escucha zumbidos, puede que se deba a una infeccion del hueso mastoideo que se ubica detras del oido, lo cual se llama 'Mastoiditis'.";
		}
		else if(sintoma==4){
			return "Si usted tiene dolores de cabeza junto a taquicardia (palpitaciones del corazon muy rapidas), ansiedad y estres puede que se deba a Hipertension, lo cual es el incremento de la presion arterial y puede ocasionar infartos. Si presenta tos, estornudos y fiebre puede que se deba a una gripe comun. Los dolores de cabeza tambien puede que se deba a estres y falta de sueño";
		}
		else if(sintoma==5){
			return "Los dolores al orinar se deben a una infeccion urinaria, si su orina tiene un olor fetido y tiene que ir al baño con frecuencia puede que se deba a esto. Sin embargo, si tambien siente picazon es sus genitales lo mas probable es que se deba a una enfermedad de transmision sexual.";
		}
		else if(sintoma==6){
			return "La diarrea en si es consederada como una enfermedad, sin embargo tambien puede ser sintoma de parasitos o gusanos en el estomago. La inclusion de vomitos con este sintoma puede que se deba a una intoxicacion por algun alimento o por haber comido sin lavarse las manos o la comida como se debe.";
		}
		else if(sintoma==7){
			return "El cambio de peso repentino es comunmente relacionado con sintomas de diabetes, si usted tambien presenta ed intensa, orinar frecuentemente y aumento de apetito es muy probable que se deba a esto.";
		}
		else if(sintoma==8){
			return "La presion alta puede que se deba a hipertension, si usted tambien presenta dolores de cabeza, taquicardia, ansiedad y estres, puede que se deba a esto.";
		}
		else if (sintoma==9){
			return"Si tiene escalofrios, dolor intenso en el torax puede que se deba a neumonia, si tambien a experimentado tos y fiebres altas, es muy probable que sea esto. ";
		}
		else if(sintoma==10){
			return"Si usted ha experimentado con fiebre alta, ronchas o zarpullido en la piel puede que se deba a una reacción alergica ante algo que se haya tocado o consumido";
		}
		else if(sintoma==11){
			return"Rinitis alergica esta relacionado con la congestion nasal, puede que se deba a esto su sintoma si tambien presenta goteo de mocos y estronudos en un intervalo pequeño de tiempo. Tambien esta relacionado con el resfriamineto comun, si usted presenta tos, dolores de cabeza, estornudos y ojos llorosos, puede que se deba a eso";
		}
		else if(sintoma==12){
			return"El estreñimiento puede que se deba al uso excesivo de laxantes. Tambien puede tener obstruccion intestinal, si usted tambien ha experimentado dolores abdominales y dificultad para defecar, puede que su sintoma se deba a esto.";
		}
		else if(sintoma==13){
			return"Si usted presenta dolores en el pecho agudos puede que se deba a un infarto agudo al miocardio, esto se debe mayormente al sobrepeso, entre sus sintomas se encuentra el dolor de pecho agudo, que se puede extender al brazo zquierdo, abdominales y espalda.";
		}
		else if(sintoma==14){
			return"Si usted presenta dolores en el estomago puede que se deba a multiples causas o enfermedades. Lo mas comun es una alimentacion mala, estres o alguna alergia que se tenga a diferentes comidas. Aunque en la mayoria de casos no se observa una enfermedad severa ( dependiendo de la intensidad del dolor ) hay enfermedades graves como la hepatitis o pancreatitis que se presenta con dolor en el estomago. ";
		}
		else if(sintoma==15){
			return"Los dolores en las articulaciones no siempre se deben a una enfermedad. Por ejemplo, el uso excesivo de la articulación en una actividad física pesada, la falta de uso, torceduras o esguinces. Aunque pueden existir enfermedades que se presenten con este sintoma como la artritis, la artrosis o Fibromialgia. Es importante describir con presicion el tipo de dolor que se siente para diferenciar las posibles causas.";
		}
		else if(sintoma==16){
			return"Generalmente la causa del temblor es un problema en las partes profundas del cerebro que controlan los movimientos. La mayoría de los tipos de temblor no tiene causa conocida, aunque hay algunas formas que parecen ser hereditarias. Tales como Esclerosis multiple o Parkinsons por ejemplo, muchas como el Parkinsons son enfermedades neurodegenarativas que afectan ciertas partes del cerebro."	
		}	
		else if(sintoma==17){
			return"La peridda del equilibrio en la mayoria de los casos se debe a un problema en el oido de la persona afectada. Se puede dar por la enfermedad de Meniere, por migrana, Neuritis Vestibular, etc..."
		}	
		else if(sintoma==18){
			return"El dolor de espalda no siempre se debe a una enfermedad y puede ser provocado por un uso exesivo de la espalda al levantar objetos o haciendo movimientos muy bruzcos. Si el dolor es muy intenso se puede tratar de una hernia discal y si hay una curvatura en la espalda puede tratarse de escoliosis."
		}	
		
				//Estos son os sintomas del menu en los links estas las enfermedades que hay que usar y se pueden agregar. En los ifs puede haber as de 1 sintoma con AND 
				/*System.out.println("1. Tos");
				System.out.println("2. Dolor de garganta");
				System.out.println("3. Dolor de oido");
				System.out.println("4. Dolores de cabeza");
				System.out.println("5. Dolores al orinar, picazón en genitales");
				System.out.println("6. Vomitos y diarrea");
				System.out.println("7. Cambio de peso repentino");
				System.out.println("8. Presion alta");
				System.out.println("9. Escalofrios, dolor intenso en torax");
				System.out.println("10. Fiebre alta, ronchas o rash en la piel");*/
				//12. congestion 
				//https://www.prensalibre.com/vida/salud-y-familia/enfermedadaes-que-afectan-a-los-guatemaltecos/
				//https://www.qualipharm.info/estas-son-las-5-enfermedades-mas-comunes-en-guatemala/
	} 	
}