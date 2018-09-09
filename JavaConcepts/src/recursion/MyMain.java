package recursion;

public class MyMain {
	int z=1;
	public void factorial(int a)//5
	{
		z=z*a;
		a=a-1;  // 4
		if(a>=1)
		{
		   this.factorial(a);
		}
		else
		{
		System.out.println(z);
		}
	}
	
	
	public static void main(String[] args) {
		
		MyMain x = new MyMain();
		x.factorial(5);
		
	}

}
