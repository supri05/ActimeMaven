package hello1;



public class h {
	static int a=test();
    {
		System.out.println("From NIB-1");

	} 
	int c=print();

	static

	{ 
		System.out.println("From SIB-1");
	} 

	public static void main(String[] args)
	{
	System.out.println("Main Begins");

	h obj=new h();

	obj.print();

	System.out.println("c:"+obj.c);

	test();

	System.out.println("a:"+a);

	System.out.println("b :"+b);

	System.out.println("Main Ends");

	}
	public static int test()

	{ 
 System.out.println("Test begins"); 
   System.out.println("a :"+a);

	System.out.println("b :"+b);

	int a=10;

	int b=20;

	return a*b;

	}

	public int print()

	{ 
		System.out.println("Print Begins");
		System.out.println("b: "+b); 
		System.out.println("Print ends");

	     return 50;
	}
	static int b=100;

	
	static
{ 
		System.out.println("From SIB-2");

	}
}
