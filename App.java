package week5coding;

public class App {

	public static void main(String[] args) {
		
      
	  Logger AstLog = new AsteriskLogger();
      Logger SpaceLog = new SpacedLogger();
      
      AstLog.Log("aliustunyer");     
      AstLog.Log("hello");
      
      
      AstLog.Error("aliustunyer");
      AstLog.Error("hello");
      
      
      SpaceLog.Log("aliustunyer");
      SpaceLog.Log("hello");
      
      SpaceLog.Error("aliustunyer");
      SpaceLog.Error("hello");
      
	}

}
