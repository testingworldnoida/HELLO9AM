package singleton;

public class MysingleTon1 {

	public static MysingleTon1  obj=null;
	
	private MysingleTon1()
	{
		
	}

	public static MysingleTon1 returnClassObject()
	{
		if(obj==null)
		{
			obj = new MysingleTon1();
		}
		return obj;
	}

}
