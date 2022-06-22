package java_Practice_Programs;


public class Swap_Two_Numbers 
{
	
	static void Before_Swap()
	{
		int a=10,b=20;
		System.out.println("Before Swapping "+a+" "+b);
	}

	static void Logic1()
	{
		int a=10,b=20;
		System.out.println("Logic1  ==>");
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping Result "+a+" "+b);
		
	}
	
	static void Logic2()
	{
		int a=10,b=20;
		System.out.println("Logic2  ==>");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Result "+a+" "+b);
		
	}
	
	static void Logic3()
	{
		int a=10,b=20;
		System.out.println("Logic3  ==>");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping Result "+a+" "+b);
		
	}
	
	static void Logic4()
	{
		int a=10,b=20;
		System.out.println("Logic4  ==>");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Result "+a+" "+b);
		
	}
	
	static void Logic5()
	{
		int a=10,b=20;
		System.out.println("Logic5  ==>");
		b=a+b-(a=b);
		System.out.println("After Swapping Result "+a+" "+b);
	}

	public static void main(String[] args) 
	{
		
		Before_Swap();
		Logic1();
		Logic2();
		Logic3();
		Logic4();
		Logic5();
		
	}

}
