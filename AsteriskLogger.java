package week5coding;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String Log) {
		System.out.println ("***" + Log + "***");
		
	}

	@Override
	public void Error(String Error) {
		String asterisk = "";
		String str = "***ERROR: " + Error + "***";
		for  (int i=0; i<str.length(); i++) {
			asterisk += "*";	
		}
		System.out.println(asterisk + "\n" + str +"\n" + asterisk  );
		
		
	}

}
