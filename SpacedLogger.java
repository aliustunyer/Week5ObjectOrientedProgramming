package week5coding;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		String out = "";
		
        for (int i=0; i<Log.length(); i++) {
        	
        	 out +=  Log.charAt(i)+ " "  ;
        }
        System.out.println(out); 
         
		
	}

	@Override
	public void Error(String Error) {
		String out= "";
		
		for (int i=0; i<Error.length(); i++) {
        	
       	 out +=  Error.charAt(i)+ " "  ;
       }
       System.out.println("ERROR: " + out);
       
	
		
	}

}
