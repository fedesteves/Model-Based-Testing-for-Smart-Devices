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
		System.out.println("nombrePrograma parametro opcion parametro opcion ...\n\n");
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
		System.out.println("-"+MenuConstants.CHAR_SCREENSHOT+" [s | n]\t Toma un screenShot cuando falla.");
		System.out.println("\ts: Si");
		System.out.println("\tn: No");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_PROJECT_PATH+" ruta/aplicacion\t Ruta donde se encuentra la aplicacion.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_PACKAGE+" nombre Paquete\t Especificar nombre del paquete.");
		
		System.out.println("");
		System.out.println("-"+MenuConstants.CHAR_MAIN_OBJECT+" Objeto Main   \t Especificar nombre del objeto principal.");
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("IMPORTANTE: Todos los parametros son mandatorios.");
		System.out.println("-----------------------------------------------------------------------");
	}
	
}
