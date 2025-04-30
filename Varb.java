class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	static{
	   // System.out.println(a);
		//System.out.println(b);
		System.out.println("1 static block");
		System.out.println(c);
		
	}
	static{
		System.out.println("2 static Block");
		
	}
	void m1(){
		System.out.println("No static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(){
		System.out.println("static method");
	//	System.out.println(a);
	//	System.out.println(b);
        System.out.println(c);
	}
	{
		System.out.println("2 non static Block::");
		{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
		
	}
}
class Varb{
public static void main(String[] args) {
	System.out.println(Hello.c);
	Hello.m2();
	Hello h1=null;
	System.out.println(h1.c);
	System.out.println("heeeeee");
	h1.m2();	
}

public void m2(){
		System.out.println("M2 method");
}

}