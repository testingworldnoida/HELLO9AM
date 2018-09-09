package singleton;

public class MySingletom {
	
	public static MySingletom obj ;
	
	private MySingletom()
	{
		
	}
	
	public static MySingletom getInstance()
	{
		if(obj==null)
		{
			obj  = new MySingletom() ;
           
		}
	   return obj;
	}

}
