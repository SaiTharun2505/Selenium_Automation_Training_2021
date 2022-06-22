package java_Practice_Programs;

public class Reverse_String {
	
	static void Logic1()
	{
		
		String name="Saitharun";
		String rev="";
		for (int i = name.length()-1; i >= 0; i--) {
			
			//Character letter=name.charAt(i);
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
	static void Logic2()
	{
		
		String name="Hello World!";
		char ch[]=name.toCharArray();
		String rev="";
		
		for (int i = ch.length-1; i >= 0; i--) {
			
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
	}
	
	static void Logic3()
	{
		String Name="Hello Guru";
		StringBuffer sb=new StringBuffer(Name);
		System.out.println(sb.reverse());
	}
	
	

	public static void main(String[] args) {
		Logic1();
		Logic2();
		Logic3();
	}

}
