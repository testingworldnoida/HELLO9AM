package inner;

public class MyMain1 {

	public static void main(String[] args) {
		
		OuterClass x = new OuterClass();
		OuterClass.InnerClass y = x.new InnerClass();
		y.hello();
		
	}
	
}
