package singleton;

public class SingleT1 {

	private static SingleT1 o1=null;
	
	private SingleT1()
	{
		
	}
	
	public static SingleT1 getObj()
	{
		if(o1==null)
		{
		   o1 = new SingleT1();
		}
		return o1;
	}
	
}
