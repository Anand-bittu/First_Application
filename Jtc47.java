class Hello{
	int a=10;
	int b=20;
	static int c=30;
	static{
		System.out.println("Hello static Block");
		//System.out.println(c);
		System.out.println("refer variable:::");
		Hello h1=new Hello();
		System.out.println(h1.a);
		System.out.println(h1.b);
	}
}


class Jtc47{
	static{
		System.out.println("inside static block of jtc47");
	}
public static void main(String[] args){
	//Hello h2=new Hello();
	System.out.println(Hello.c);
	System.out.println("Hello this is Aanand changed now");
	
	
}
}
