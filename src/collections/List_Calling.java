package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Calling {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Please select state first");
		list.add("Port Blair");
		list.add("South Andaman");
		list.add("Visakhapatnam");
		list.add("Papum Pare");
		list.add("Goalpara");
		list.add("Bhojpur");
		list.add("Chandigarh");
		list.add("Bilaspur");
		list.add("Naroli");
		list.add("Silvassa");
		list.add("Diu");
		list.add("New Delhi");
		list.add("Margao");
		list.add("Anand");
		list.add("Bahadurgarh");
		list.add("Dharamshala");
		list.add("Doda");
		list.add("Jammu");
		list.add("Chaibasa");
		list.add("Bengaluru");
		list.add("Alappuzha");
		list.add("Anuppur");
		list.add("Alibaug");
		list.add("Churachandpur");
		list.add("East Khasi Hills");
		list.add("Lawngtlai");
		list.add("Kohima");
		list.add("Balasore");
		list.add("Karaikal");
		list.add("Amritsar");
		list.add("Ajmer");
		list.add("Gangtok");
		list.add("Ariyalur");
		list.add("Nizamabad");
		list.add("North Tripura");
		list.add("Prayagraj");
		list.add("Chamoli");
		list.add("Diamond Harbour");
		
		for (int i = 0; i < list.size(); i++) 
		{
			String S=list.get(i);
			System.out.println(S);
			
			
		}
	}

}
