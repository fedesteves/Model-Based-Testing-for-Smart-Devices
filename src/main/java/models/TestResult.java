package models;

import constants.GeneralConstants;
import enums.EnumOS;

// Clase que recibe el output de un test
public class TestResult {
	private int resultCode; // 0 -> OK , 1 -> ERROR
	private String resultMessage; // Mensaje de error o exito
	
	public TestResult(int resultCode, String resultMessage) {
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	public static boolean resulttestFailed(int resultCode) {
		if (resultCode==1)
			return true;
		else
			return false;
	}
	
	
	// Imprime el output del test
	public static String resultManager(TestResult resultTest, String os) {
		String result;
		if(resultTest.getResultCode() == 0){
			result = GeneralConstants.OUTPUT_SUCCESS;
		}
		else{
			String finalMessage = "";
			if(resultTest.getResultMessage() != "" && os.equals(EnumOS.ANDROID)){
				String messageError = resultTest.getResultMessage().split("\\\n")[1];
				String[] split = messageError.split("\\:");
				for(int i=1; i<split.length; i++){
					finalMessage += split[i];
				}
				result = GeneralConstants.OUTPUT_FAILED+"\t"+finalMessage;
			}
			else{
				result = GeneralConstants.OUTPUT_FAILED+resultTest.getResultMessage();
			}
		}
		return result;
	}
		
	
	
	
}
