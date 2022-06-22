package day1;

public class Operators {

	public static void main(String[] args) 
	{
		int a=10 ,b=20;
		boolean c=true , d=false;
		
		//Arithmetic operators ----> + - % /
		System.out.println("--------Arithmetic operators--------");
		System.out.println("Additon of two numbers is:" + (a+b));
		System.out.println("Substraction of two numbers is:" + (a-b));
		System.out.println("Multiplication of two numbers is:" + (a%b));
		System.out.println("Division of two numbers is:" + (a/b));
		
		//Comparisional operators ----> == < > <= >= !=
		System.out.println("-------comparitional operators------");
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		//Logical operators ------> & || !
		System.out.println("---------Logical operators----------");
		System.out.println(c&d);
		System.out.println(c|d);
		System.out.println(!c);
		
		
		
	}

}
