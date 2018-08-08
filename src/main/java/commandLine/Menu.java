package commandLine;

import constants.MenuConstants;
import utils.FileHelper;

public class Menu {
	
	static boolean paramsOK;
	static String separator = ",";
	static int numParams = 7;
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
		
		Params[1][0] = MenuConstants.DEVICE;
		Params[1][1] = MenuConstants.CHAR_DEVICE;
		Params[1][2] = "A"+separator+"?";
		
		Params[2][0] = MenuConstants.TEST_FILE;
		Params[2][1] = MenuConstants.CHAR_TEST_FILE;
		Params[2][2] = "?";
		
		Params[3][0] = MenuConstants.PROJECT_PATH;
		Params[3][1] = MenuConstants.CHAR_PROJECT_PATH;
		Params[3][2] = "?";
		
		Params[4][0] = MenuConstants.PACKAGE;
		Params[4][1] = MenuConstants.CHAR_PACKAGE;
		Params[4][2] = "?";
		
		Params[5][0] = MenuConstants.MAIN_OBJECT;
		Params[5][1] = MenuConstants.CHAR_MAIN_OBJECT;
		Params[5][2] = "?";
		
		Params[6][0] = MenuConstants.SCREENSHOT;
		Params[6][1] = MenuConstants.CHAR_SCREENSHOT;
		Params[6][2] = "S"+separator+"N";
		
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
				if (numParams*2 != args.length){
					paramsOK = false;
					throw new Error(MenuConstants.VERIFY_PARAMS);
				}
				int i = 0;
				while (i < args.length) {
					boolean saveParam = false;
					for (int x=0; x<numParams ; x++){
						if (args[i].toUpperCase().equals("-"+Params[x][1]))
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
					if ((!saveParam) || (!paramsOK)) {
						paramsOK = false;
						throw new Error(MenuConstants.PARAMETER+"("+args[i].toUpperCase()+")\n"+MenuConstants.INVALID);
					} 
					else {
						i++;
					}
				}
		
				// Verifica si se llenaron todos los parametros
				// caso contrario pone variable paramsOK en falso
				for (int y = 0; y < numParams; y++) {
					if (Params[y][3] == null)
						paramsOK = false;
					else {
						if (validOption(y)){
							if ((Params[y][0] == MenuConstants.TEST_FILE) && !FileHelper.existFile(Params[y][3])){
								paramsOK = false;
								throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.FILE_NOT_EXIST+Params[y][3]);
							}
							else if (Params[y][0] == MenuConstants.PROJECT_PATH)  {
								String[] aux = Params[y][3].split(separator);
								for (int z = 0; z < aux.length; z++){
									if (!FileHelper.existDir(aux[z])) {
										paramsOK = false;
										throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.DIR_NOT_EXIST+aux[z]);
									}
								}
							}
							else if (Params[y][0] == MenuConstants.DEVICE)  {
								if (Params[y][3].toUpperCase().equals("A")){
									Params[y][3] = MenuConstants.OPTION_ALL;
								}	
							}
							else if (Params[y][0] == MenuConstants.SYSTEM)  {
								if (Params[y][3].toUpperCase().equals("A")){
									Params[y][3] = MenuConstants.OPTION_ANDROID;
									for (int z=3; z<6 ; z++) {
										if (Params[z][3].contains(separator)) {
											paramsOK = false;
											throw new Error(MenuConstants.PARAMETER+"(-"+Params[z][1]+")\n"+MenuConstants.ONLY_ONE_OPTION);
										}
									}
								}
								else if (Params[y][3].toUpperCase().equals("I")){
									Params[y][3] = MenuConstants.OPTION_IOS;
									for (int z = 3; z < 6 ; z++) {
										if (Params[z][3].contains(separator)) {
											paramsOK = false;
											throw new Error(MenuConstants.PARAMETER+"(-"+Params[z][1]+")\n"+MenuConstants.ONLY_ONE_OPTION);
										}
									}
										
								}
								else if (Params[y][3].toUpperCase().equals("B")){
									Params[y][3] = MenuConstants.OPTION_TWO;
									/*for (int z = 3; z < 6; z++) {
										if (Params[z][3].contains(separator)) {
											if (Params[z][3].split(separator).length != 2){
												paramsOK = false;
												throw new Error(MenuConstants.PARAMETER+"(-"+Params[z][1]+")\n"+MenuConstants.ONLY_TWO_OPTIONS);
											}
										} 
										else {
											paramsOK = false;
											throw new Error(MenuConstants.PARAMETER+"(-"+Params[z][1]+")\n"+MenuConstants.ONLY_TWO_OPTIONS);
										}
									}*/
											
								}	
							}
							
							if (Params[y][0]== MenuConstants.SCREENSHOT)  {
								if (Params[y][3].toUpperCase().equals("S")){
									Params[y][3] = "YES";
								}else if (Params[y][3].toUpperCase().equals("N")){
									Params[y][3] = "NO";		
								}else {
									paramsOK = false;
									throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.INVALID+Params[y][3]);
								}	
							}
							
						} 
						else {
							paramsOK = false;
							throw new Error(MenuConstants.PARAMETER+"(-"+Params[y][1]+")\n"+MenuConstants.OPTION_INVALID+Params[y][3]);
						}
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
	
	public boolean validOption (int id){
		boolean out = true;
		if (!Params[id][3].equals("")){
			boolean correct = false;
			String[] aux = Params[id][2].split(separator);
			for (int z = 0; z < aux.length; z++)
				if ((Params[id][3].toUpperCase().equals(aux[z].toUpperCase())) || (aux[z].equals("?") && (Params[id][3].length() > 1)))
					correct = true;
			out = correct;
		}
		return out;
	}
	
	//PRECONDICION: previamente debio ejecutarse ckeckArgs
	public boolean argsOk(int x) {
		if (paramsOK)
			return true;
		else
			return false;
	}
	
	
	
}