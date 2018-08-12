package commandLine;

import constants.GeneralConstants;
import constants.MenuConstants;
import utils.FileHelper;

public class Menu {
	
	static boolean paramsOK;
	static String separator = ",";
	static int numParams = 9;
	static String[][] Params = new String[numParams][4];
	// MATRIZ DE PARAMETROS
	// FILA 0 |	DESCRIPCION			| Texto libre solo usado de referencia interna
	// FILA 1 |	LETRA				| Letra que identifica el parametro pasado al programa
	// FILA 2 |	OPCIONES POSIBLES 	| Posibles opciones
	// FILA 3 |	VALOR				| Valor contendr· el valor que se le indique por parametro
	
	private void initParams (){
		Params[0][0] = MenuConstants.SYSTEM; 
		Params[0][1] = MenuConstants.CHAR_SYSTEM;
		Params[0][2] = "A"+separator+"I"+separator+"B";
		Params[0][3] = "";
		
		Params[1][0] = MenuConstants.DEVICE;
		Params[1][1] = MenuConstants.CHAR_DEVICE;
		Params[1][2] = "A"+separator+"?";
		Params[1][3] = "";
		
		Params[2][0] = MenuConstants.TEST_FILE;
		Params[2][1] = MenuConstants.CHAR_TEST_FILE;
		Params[2][2] = "?";
		Params[2][3] = "";
		
		Params[3][0] = MenuConstants.MAIN_OBJECT;
		Params[3][1] = MenuConstants.CHAR_MAIN_OBJECT;
		Params[3][2] = "?";
		Params[3][3] = "";
		
		Params[4][0] = MenuConstants.SCREENSHOT;
		Params[4][1] = MenuConstants.CHAR_SCREENSHOT;
		Params[4][2] = "S"+separator+"N";
		Params[4][3] = "";
		
		Params[5][0] = MenuConstants.PROJECT_PATH_ANDROID;
		Params[5][1] = MenuConstants.CHAR_PROJECT_PATH_ANDROID;
		Params[5][2] = "?";
		Params[5][3] = "";
		
		Params[6][0] = MenuConstants.PROJECT_PATH_IOS;
		Params[6][1] = MenuConstants.CHAR_PROJECT_PATH_IOS;
		Params[6][2] = "?";
		Params[6][3] = "";
		
		Params[7][0] = MenuConstants.PACKAGE_ANDROID;
		Params[7][1] = MenuConstants.CHAR_PACKAGE_ANDROID;
		Params[7][2] = "?";
		Params[7][3] = "";	
		
		Params[8][0] = MenuConstants.COPY_ANDROID;
		Params[8][1] = MenuConstants.CHAR_COPY_ANDROID;
		Params[8][2] = "S"+separator+"N";
		Params[8][3] = "";
	}
		
	public Menu() {
		initParams();
		paramsOK = true;
	}
	
	public String[] checkArgs (String[] args) throws Error{
		
		
		switch (args.length) {
			case 0: { //NO RECIBE PARAMETROS
				paramsOK = false;
				break;
			}
			case 1: {  //SOLO UN PARAMETRO, DEBE SER AYUDA
				if (!args[0].equals("-"+MenuConstants.CHAR_HELP)) 
					paramsOK = false;
				break;
			}
			default :{
				
				
				// CARGO TODOS LOS PARAMETROS EN SU CORRESPONDIENTE POSICION EN LA LISTA
				int i = 0;
				while (i < args.length) {
					boolean saveParam = false;
					for (int x=0; x<numParams ; x++){
						
						if (args[i].toUpperCase().equals("-"+Params[x][1])) {
							if ((i+1) < args.length){
								i++;
								Params[x][3] = args[i];
								saveParam = true;
							} 
							else {
								paramsOK = false;
								throw new Error(MenuConstants.PARAMETER+"(-"+Params[x][1]+")\n"+MenuConstants.NO_OPTION);
							}
						}
					} 
					if ((!saveParam) || (!paramsOK)) {
						paramsOK = false;
						throw new Error(MenuConstants.PARAMETER+"("+args[i].toUpperCase()+")\n"+MenuConstants.INVALID);
					} 
					else {
						i++;
					}
				}
				
				// RECORRO LA LISTA DE PARAMETROS Y CONTROLA OPCIONES DE PARAMETROS
				for (int y = 0; y < numParams; y++) {
					
					
					if (Params[y][0] == MenuConstants.SYSTEM)  {
						if (Params[y][3].toUpperCase().equals("A"))
							Params[y][3] = MenuConstants.OPTION_ANDROID;
						else if (Params[y][3].toUpperCase().equals("I"))
							Params[y][3] = MenuConstants.OPTION_IOS;
						else if (Params[y][3].toUpperCase().equals("B"))
							Params[y][3] = MenuConstants.OPTION_BOTH;
						else if (Params[y][3].equals("")){
							paramsOK = false;
							throw new Error(MenuConstants.WITHOUT_PARAMETER+"(-"+Params[y][1]+")\n");
						} else {
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.OPTION_INVALID);
						}
					}
					
					if (Params[y][0] == MenuConstants.DEVICE)  {
						if (Params[y][3].toUpperCase().equals("A")){
							Params[y][3] = MenuConstants.OPTION_ALL;
						} else if (Params[y][3].equals("")){
							paramsOK = false;
							throw new Error(MenuConstants.WITHOUT_PARAMETER+"(-"+Params[y][1]+")\n");
						}	
					}
					
					if (Params[y][0] == MenuConstants.TEST_FILE) {
						if (Params[y][3].equals("")){
							paramsOK = false;
							throw new Error(MenuConstants.WITHOUT_PARAMETER+"(-"+Params[y][1]+")\n");
						}
						if (!FileHelper.existFile(Params[y][3])){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.FILE_NOT_EXIST);
						}
					}
					
					if (Params[y][0] == MenuConstants.MAIN_OBJECT)  {
						if (Params[y][3].equals("")){
							paramsOK = false;
							throw new Error(MenuConstants.WITHOUT_PARAMETER+"(-"+Params[y][1]+")\n");
						}	
					}
					
					if (Params[y][0]== MenuConstants.SCREENSHOT)  {
						if (Params[y][3].toUpperCase().equals("S"))
							Params[y][3] = MenuConstants.YES;
						else if ((!Params[y][3].toUpperCase().equals("")) && (!Params[y][3].toUpperCase().equals("N"))){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.OPTION_INVALID);
						} else
							Params[y][3] = MenuConstants.NO;
						
					}
					
					// SI SELECCIONO SISTEMA ANDROID o AMBOS, DEBE ESPECIFICAR RUTA_ANDROID
					if (Params[y][0] == MenuConstants.PROJECT_PATH_ANDROID)  {
						if (Params[0][3].toUpperCase().equals("I")){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.INVALID);
						} 
					}
					
					// SI SELECCIONO SISTEMA IOS o AMBOS, DEBE ESPECIFICAR RUTA_IOS
					if (Params[y][0] == MenuConstants.PROJECT_PATH_IOS)  {
						if (Params[0][3].toUpperCase().equals("A")){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.INVALID);
						} 
					}
					
					// SI SELECCIONO SISTEMA ANDROID o AMBOS, DEBE ESPECIFICAR RUTA_ANDROID
					if (Params[y][0] == MenuConstants.PACKAGE_ANDROID)  {
						//SELECCIONO SISTEMA IOS y ESPECIFICA PACKAGE ANDROID
						if (Params[0][3].toUpperCase().equals("I")){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.INVALID);
						} 
						if (Params[y][3].equals("")){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.NO_OPTION);
						}	
					}
					
					if (Params[y][0]== MenuConstants.COPY_ANDROID)  {
						//if (Params[y][3].toUpperCase().equals("S")){
						
						if (Params[y][3].toUpperCase().equals("N")){
							Params[y][3] = GeneralConstants.NO;		
						} else if (!Params[y][3].toUpperCase().equals("") && !Params[y][3].toUpperCase().equals("S")){
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.INVALID);
						} else
							Params[y][3] = GeneralConstants.YES;
					}	
					
					
				}
				
				// SISTEMA, DISPOSITIVOS, TEST, MAIN_OBJECT, SCREENSHOT son parametros obligatorios
				for (int y = 0; y < 5; y++) {
					if (Params[y][3].equals("")){
						paramsOK = false;
						throw new Error(MenuConstants.VERIFY_PARAMS);
					}
				}
				
				
				// SI ELIGIO AMBOS SISTEMAS, CONTROLA PARAMETROS ANDROID E IOS
				if (Params[0][3].toUpperCase().equals( MenuConstants.OPTION_BOTH)){
					if (Params[5][3].equals("") || Params[6][3].equals("") || Params[7][3].equals("")){
						paramsOK = false;
						String temp=" ";
						for (int x=5;x<8;x++)
							if (Params[x][3].equals(""))
								temp=temp.concat("-"+Params[x][1]+" ");
						throw new Error(MenuConstants.WITHOUT_PARAMETER+temp);
						
					}
				}
				
				
				// SI ELIGIO SISTEMA IOS, CONTROLA PARAMETROS IOS
				if (Params[0][3].toUpperCase().equals( MenuConstants.OPTION_IOS)){
					if (Params[6][3].equals("")){
						paramsOK = false;
						throw new Error(MenuConstants.WITHOUT_PARAMETER+" -"+Params[6][1]);
						
					}
				}
				
				// SI ELIGIO SISTEMA ANDROID, CONTROLA PARAMETROS ANDROID
				if (Params[0][3].toUpperCase().equals( MenuConstants.OPTION_ANDROID)){
					if (Params[5][3].equals("") || Params[7][3].equals("")){
						paramsOK = false;
						String temp=" ";
						if (Params[5][3].equals(""))
							temp=temp.concat("-"+Params[5][1]+" ");
						if (Params[7][3].equals(""))
							temp=temp.concat("-"+Params[7][1]+" ");
						throw new Error(MenuConstants.WITHOUT_PARAMETER+temp);
					}
				}
				
			}
		}
		
		if (paramsOK){
			String[] aux = new String[numParams];
			for (int i = 0; i < numParams; i++)
				aux[i] = Params[i][3];
			return aux;
		} else
			return new String[numParams];
	}
	
	//PRECONDICION: previamente debio ejecutarse ckeckArgs
	public boolean argsOk(int x) {
		if (paramsOK)
			return true;
		else
			return false;
	}
	
	
	
}