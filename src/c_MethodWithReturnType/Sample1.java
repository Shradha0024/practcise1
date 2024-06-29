package c_MethodWithReturnType;

public class Sample1 //EX:MethodWith_IntReturnType
{
	public static void main(String[] args) 
	{
		int num1 = add(10,20);
		System.out.println(num1);
		
		System.out.println("-------");
		
		System.out.println(add(20, 30));
		
		System.out.println("---------------");
		
		Sample1 s1=new Sample1();
		int num2 = s1.mul(5, 6);
		System.out.println(num2);
		
		System.out.println("--------");
		
		System.out.println(s1.mul(8, 4));
		
		System.out.println("------------------");
		
		Sample2 s2=new Sample2();
		String t1 = s2.convetToUpperCase("pakhi");
		System.out.println(t1);
		
		System.out.println("-------");
		
		System.out.println(s2.convetToUpperCase("namita"));
	}
	
	public static int add(int a, int b) //This will return value 30 to main method and use it multiple times
	{
		int c=a+b;
		return c;
		
	}
	
	public int mul(int p, int q ) 
	{
		int m = p*q;
		
		return m;
		
	}
	
//	public static void add(int a, int b) //This methos will not return any output bcoz of void
//	{ 
//	  //void means it will not return any value to another method
//		
//		//in void method it will only execute its body
//		
//		int c=a=b;
//		System.out.println(c);      //it will not return any value in main method when method call
//		
//	}

}
