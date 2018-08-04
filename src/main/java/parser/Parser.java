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
		for(int i=0; i<uiTests.size(); i++){
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
					if(initialSplit[0].toUpperCase().contains("IS") || initialSplit[0].toUpperCase().contains("HAS") ||
							initialSplit[0].toUpperCase().contains("VALIDATE"))
						actionType = CommandConstants.TYPE_VERIFY;
					else if(initialSplit[0].toUpperCase().contains("GO"))
						actionType = CommandConstants.TYPE_NAVIGATE;
				
					if(actionType == CommandConstants.TYPE_NAVIGATE)
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
			}
		}
		return parsedTests;
	}
	
	// Comandos con dos parametros
	public static String getTestTwoParams(String param1, String param2, String param3) {
		String test = "";
		switch(param1.toUpperCase()){
			case CommandConstants.ACTION_TYPE_TEXT: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_TYPE_TEXT+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+")";
				break;
			case CommandConstants.VERIFY_COMPARE_TEXT: 
				test = CommandConstants.TYPE_VERIFY+"("+CommandConstants.VERIFY_COMPARE_TEXT+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+")";
				break;
			case CommandConstants.ITERATE_TAP: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_TAP+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+")";
				break;
			case CommandConstants.ITERATE_SCROLL: 
				test = CommandConstants.TYPE_ITERATE+"("+CommandConstants.ITERATE_SCROLL+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+")";
				break;
		}
		return test;
	}
	
	// Comandos con tres parametros
	public static String getTestThreeParams(String param1, String param2, String param3, String param4) {
		String test = "";
		switch(param1.toUpperCase()){
			case CommandConstants.ACTION_EDIT_TIME: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_EDIT_TIME+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+CommandConstants.FIELD_SEPARATOR+param4+")";
				break;
		}
		return test;
	}

	// Comandos con cuatro parametros
	public static String getTestFourParams(String param1, String param2, String param3, String param4, String param5) {
		String test = "";
		switch(param1.toUpperCase()){
			case CommandConstants.ACTION_EDIT_DATE: 
				test = CommandConstants.TYPE_RUN_ACTION+"("+CommandConstants.ACTION_EDIT_DATE+CommandConstants.FIELD_SEPARATOR+param2+CommandConstants.FIELD_SEPARATOR+param3+CommandConstants.FIELD_SEPARATOR+param4+CommandConstants.FIELD_SEPARATOR+param5+")";
				break;
		}
		return test;
	}
	
}
