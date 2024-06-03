package CollectionExx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorListExample {

	public static void main(String[] args) {
		
	
			ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("pratiksha");
			arrayList.add("Abhishek");
			arrayList.add("Shreyas");
//			System.out.println(arrayList);
//			arrayList.set(0, "Onkar");
//			System.out.println(arrayList);
//			System.out.println(arrayList.get(0));
//			System.out.println(arrayList.get(1));
//			System.out.println(arrayList.isEmpty());
//			System.out.println(arrayList.size());
//			arrayList.remove(0);
//			System.out.println(arrayList);
			ArrayList<String> arrayList1 = new ArrayList<String>();
			// arrayList1.isEmpty();
			System.out.println("Is Empty " + arrayList1.isEmpty());
			arrayList1.addAll(arrayList);// Add all Elements.
			arrayList1.add("EduBridge");
			System.out.println(arrayList1);
			// arrayList1.removeAll(arrayList1);
			System.out.println(arrayList1);
			Collections.sort(arrayList1);
			// System.out.println(arrayList1);
			for (String list : arrayList1)
				System.out.print(list + " ");
			System.out.println();
			System.out.println(arrayList1.contains("Sadiya"));
			System.out.println("Iterator ");
			Iterator<String> iterator = arrayList.iterator();

			System.out.println("List elements : ");

			while (iterator.hasNext())
				System.out.print(iterator.next() + " ");

			System.out.println();
			
			

		}

	
	}


