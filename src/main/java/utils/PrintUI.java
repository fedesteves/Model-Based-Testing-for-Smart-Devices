package utils;

import constants.MenuConstants;

public class PrintUI {

	public static void showMessage(String s){
		System.out.print(s);
	}
	
	public void showHelp(){
		System.out.println("\nAYUDA (-"+MenuConstants.CHAR_HELP+")");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("SINTAXIS DE PARAMETROS\n");
		System.out.println("parametro opcion parametro opcion ...\n\n");
		System.out.println("PARAMETROS y OPCIONES");
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_SYSTEM+" [a | i | b]\t Sistema operativo donde se van a ejecutar los test.");
		System.out.println("\ta: Solo Android.");
		System.out.println("\ti: Solo iOS.");
		System.out.println("\tb: Ambos sistemas operativos (Andorid e iOS).");

		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_DEVICE+" [a | id1[,id2[,id3...]]]\t Id dispositivos a ejecutar los tests.");
		System.out.println("\ta: Todos los dispositivos conectados.");
		System.out.println("\tid1[,id2[,id3...]]: Lista de dispositivos separados por coma");
		System.out.println("\t\tEj. Id_Disp1,Id_Disp2,Id_Disp3 o Id_Disp1.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_TEST_FILE+" ruta/test.txt\t Ruta del archivo de test generado.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_MAIN_OBJECT+" Objeto Main   \t Especificar nombre del objeto principal.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_SCREENSHOT+" [s | n]\t Toma un screenShot cuando falla(por defecto No).");
		System.out.println("\ts: Si");
		System.out.println("\tn: No");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_PROJECT_PATH_ANDROID+" ruta\\aplicacion\t Ruta donde se encuentra la aplicacion Android.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_PROJECT_PATH_IOS+" Mac:/ruta/aplicacion\t Ruta de la mac donde se encuentra la aplicacion iOS.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_PACKAGE_ANDROID+" nombre Paquete\t Especificar nombre del paquete Android.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_COPY_ANDROID+" [s | n]\t Copia proyecto Android (por defecto Si).");
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("IMPORTANTE:\n"
							+"Parametros obligatorios: \n"
							+MenuConstants.SYSTEM+","+MenuConstants.DEVICE+","+MenuConstants.TEST_FILE+","+MenuConstants.MAIN_OBJECT+"\n");
		System.out.println("Parametros opcionales: \n"
							+MenuConstants.SCREENSHOT+","+MenuConstants.COPY_ANDROID+"\n");
		System.out.println("-----------------------------------------------------------------------");
	}
	
}
