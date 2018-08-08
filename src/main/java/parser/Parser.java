package parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import com.mtdi.ModelBasedTesting.grammarUI;
import com.mtdi.ModelBasedTesting.lexerUI;
import com.mtdi.ModelBasedTesting.grammarUI.CommandContext;
import constants.CommandConstants;
import constants.ErrorConstants;

public class Parser {
	
	// Valida la sintaxis de los comandos. En caso de ser correctas retorna la lista de comandos
	public ArrayList<String> getCommandsUI(String fileIntegrator) throws Error {
		ArrayList<String> uiCommands = new ArrayList<String>();
		try {
			String program = fileIntegrator;
			lexerUI lexer = new lexerUI(CharStreams.fromFileName(program));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			grammarUI parser = new grammarUI(tokens);
			grammarUI.ProgramContext tree = parser.program();
			List<CommandContext> lista = tree.command();
			Iterator<CommandContext> iter = lista.iterator();
			CommandContext item;
			while (iter.hasNext()) {
				item = iter.next();
				uiCommands.add(item.getText());
			}
		} catch (Exception e) {
			throw new Error(ErrorConstants.RECOGNITION);
		}
		return uiCommands;
	}

	// Parsea los comandos de UI a nivel interno
	public ArrayList<String> parser(ArrayList<String> uiTests) {
		ArrayList<String> parsedTests = new ArrayList<String>();
		String comando, parametros;
		for(int i=0; i<uiTests.size(); i++){
			
			if(!uiTests.get(i).contains("(")) {
				// Comandos sin parametros
				comando = uiTests.get(i).toUpperCase();
				parsedTests.add(getTestZeroParam(comando));
			} else {
				comando = uiTests.get(i).split("\\(")[0].toUpperCase();
				parametros = uiTests.get(i).split("\\(")[1].substring(0, uiTests.get(i).split("\\(")[1].length() -1);
				String[] params = parametros.split(CommandConstants.FIELD_SEPARATOR);
				switch(params.length){
					case 1: 
						parsedTests.add(getTestOneParam(comando, params[0])) ;
						break;
					case 2: 
						parsedTests.add(getTestTwoParams(comando, params[0], params[1])) ;
						break;
					case 3:
						parsedTests.add(getTestThreeParams(comando, params[0], params[1], params[2])) ;
						break;
					case 4:
						parsedTests.add(getTestFourParams(comando, params[0], params[1], params[2], params[3])) ;
						break;
				}
			}
			
			
			
			/*
			// Comandos sin parametros
			if(!uiTests.get(i).contains("(")){
				parsedTests.add(CommandConstants.TYPE_RUN_ACTION+"("+uiTests.get(i).toUpperCase()+")");
			}
			// Comandos con parametros
			else{
				String[] initialSplit = uiTests.get(i).split("\\(");
				// Comandos con un solo parametro
				if(!initialSplit[1].contains(CommandConstants.FIELD_SEPARATOR)){
					String actionType = CommandConstants.TYPE_RUN_ACTION;
					if(initialSplit[0].toUpperCase().contains("IS") || initialSplit[0].toUpperCase().contains("HAS") || initialSplit[0].toUpperCase().contains("VALIDATE"))
						actionType = CommandConstants.TYPE_VERIFY;
					else if(initialSplit[0].toUpperCase().contains("GO"))
						actionType = CommandConstants.TYPE_NAVIGATE;
					
					else if(initialSplit[0].toUpperCase().contains("LIST"))
						actionType = CommandConstants.TYPE_ITERATE;
				
					if(actionType == CommandConstants.TYPE_NAVIGATE)
						parsedTests.add(actionType+"("+initialSplit[1].substring(0, initialSplit[1].length()-1)+")");
					else if(actionType == CommandConstants.TYPE_ITERATE)
						parsedTests.add(actionType+"("+initialSplit[1].substring(0, initialSplit[1].length()-1)+")");
					else
						parsedTests.add(actionType+"("+initialSplit[0].toUpperCase()+CommandConstants.FIELD_SEPARATOR+initialSplit[1].substring(0, initialSplit[1].length()-1)+")");
				}
				// Comandos con mas de un parametro
				else{
					String[] split = initialSplit[1].split(CommandConstants.FIELD_SEPARATOR);
					switch(split.length){
						case 2: 
							parsedTests.add(getTestTwoParams(initialSplit[0].toUpperCase(), split[0], split[1].substring(0, split[1].length()-1)));
							break;
						case 3:
							parsedTests.add(getTestThreeParams(initialSplit[0].toUpperCase(), split[0], split[1], split[2].substring(0, split[2].length()-1)));
							break;
						case 4:
							parsedTests.add(getTestFourParams(initialSplit[0].toUpperCase(), split[0], split[1], split[2], split[3].substring(0, split[3].length()-1)));
							break;
					}
				}
			}*/
		}
		return parsedTests;
	}
	
	// Comandos con cero parametro
	public static String getTestZeroParam(String comando) {
		String test = "";
		switch(comando.toUpperCase()){
			case CommandConstants.ACTION_BACK: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_BACK+")";
				break;
			case CommandConstants.ACTION_SWIPE_DOWN: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_SWIPE_DOWN+")";
				break;
			case CommandConstants.ACTION_SWIPE_UP: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_SWIPE_UP+")";
				break;
			case CommandConstants.ACTION_SWIPE_LEFT: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_SWIPE_LEFT+")";
				break;
			case CommandConstants.ACTION_SWIPE_RIGHT: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_SWIPE_RIGHT+")";
				break;
			case CommandConstants.ITERATE_INSERT: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_INSERT+")";
				break;
			case CommandConstants.ITERATE_SAVE: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_SAVE+")";
				break;
			case CommandConstants.ITERATE_CANCEL: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_CANCEL+")";
				break;
		}
		return test;
	}
	
	
	// Comandos con un parametro
	public static String getTestOneParam(String comando, String param1) {
		String test = "";
		switch(comando.toUpperCase()){
			case CommandConstants.ACTION_TAP: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_TAP+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.ACTION_DOUBLE_TAP: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_DOUBLE_TAP+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.ACTION_LONG_TAP: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_LONG_TAP+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
				
				
			case CommandConstants.VERIFY_IS_VISIBLE: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_IS_VISIBLE+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.VERIFY_IS_DISPLAYED: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_IS_DISPLAYED+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.VERIFY_IS_COMPLETELY_DISPLAYED: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_IS_COMPLETELY_DISPLAYED+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.VERIFY_HAS_FOCUS: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_HAS_FOCUS+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.VERIFY_IS_ENABLED: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_IS_ENABLED+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.VERIFY_IS_CLICKABLE: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_IS_CLICKABLE+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
				
				
			case CommandConstants.ITERATE_TAP: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_TAP+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.ITERATE_SCROLL: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_SCROLL+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.ITERATE_SEARCH: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_SEARCH+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.ITERATE_DELETE: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_DELETE+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			case CommandConstants.ITERATE_UPDATE: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_UPDATE+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
				
				
			case CommandConstants.NAVIGATE_GO: 
				test = CommandConstants.TYPE_NAVIGATE+"("+CommandConstants.NAVIGATE_GO+CommandConstants.FIELD_SEPARATOR+param1+")";
				break;
			
		}
		return test;
	}
		
	
	// Comandos con dos parametros
	public static String getTestTwoParams(String comando, String param1, String param2) {
		String test = "";
		switch(comando.toUpperCase()){
			case CommandConstants.ACTION_TYPE_TEXT: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_TYPE_TEXT+CommandConstants.FIELD_SEPARATOR+param1+CommandConstants.FIELD_SEPARATOR+param2+")";
				break;
			case CommandConstants.VERIFY_COMPARE_TEXT: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_COMPARE_TEXT+CommandConstants.FIELD_SEPARATOR+param1+CommandConstants.FIELD_SEPARATOR+param2+")";
				break;
		}
		return test;
	}
	
	// Comandos con tres parametros
	public static String getTestThreeParams(String comando, String param1, String param2, String param3) {
		String test = "";
		switch(comando.toUpperCase()){
			case CommandConstants.ACTION_EDIT_TIME: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_EDIT_TIME+CommandConstants.FIELD_SEPARATOR+param1+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+")";
				break;
		}
		return test;
	}

	// Comandos con cuatro parametros
	public static String getTestFourParams(String comando, String param1, String param2, String param3, String param4) {
		String test = "";
		switch(comando.toUpperCase()){
			case CommandConstants.ACTION_EDIT_DATE: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_EDIT_DATE+CommandConstants.FIELD_SEPARATOR+param1+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+CommandConstants.FIELD_SEPARATOR+param4+")";
				break;
		}
		return test;
	}
	
}
