package CollectionExx;

import java.util.HashSet;

public class HashsetExample {

	
	public static void main(String[] args) {
		
		HashSet<Integer> Hashset= new HashSet<Integer>();
		Hashset.add(2);
		Hashset.add(4);
		Hashset.add(3);
		Hashset.add(11);
		
		System.out.println("Add no:" + Hashset);
		Hashset.addAll(Hashset);
	
	}

}    

       

