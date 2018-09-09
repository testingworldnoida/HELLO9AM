package singleton;

public class SingleT {
	
	private static SingleT obj =null ; 
	
	private SingleT()
	{
		
	}
	
	public static SingleT getObject()
	{
		if(obj==null)
		{
			obj = new SingleT();
			
		}
		return obj;
	}

}
