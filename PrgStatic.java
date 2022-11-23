package Day1Problems;

public class PrgStatic {
	static int a=10;
	static int b=20;
	
	static {
		System.out.println("static block executed");
	}
	
	static void sum(int x,int y) {
		int c=x+y;
		System.out.println("addition : " +c);
	}
	

	public static void main(String[] args) {
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		sum(10,20);
	}

}
