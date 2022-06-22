package day9;

public class Variables {

		String s="iphone";
		static int a=10;
		
		public void Local()
		{
			System.out.println(s);
			System.out.println(a);
		}
		public static void Local1() {
			Variables obj=new Variables();
			String s1=obj.s;
			System.out.println(s1);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj=new Variables();
		String s1=obj.s;
		System.out.println(s1);
	}

}
