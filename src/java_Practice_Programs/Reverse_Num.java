package java_Practice_Programs;

public class Reverse_Num {

	
	static void Logic1() 
	{
		int num=1234;
		int rev=0;
		
		while (num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse Number is "+rev);
	}

	static void Logic2()
	{
		int num=1234;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse Number is "+rev);
	}
	
	static void Logic3()
	{
		int num=1234;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse Number is "+rev);
	}
	
	public static void main(String[] args) {
		Logic1();
		Logic2();
		Logic3();
	}

}
