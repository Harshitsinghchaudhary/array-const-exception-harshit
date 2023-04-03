class Testcons
{
	public Testcons() {
		System.out.println("Hi from constructor body");
	}
	
	public Testcons(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
public class Test {
	public static void main(String[] args) {
		new TestCons(12, 13);
	}
}
		
		
