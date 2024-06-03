package CollectionExx;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class Vectorexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.add("Pratiksha");
		vector.add("Rutuja");
		vector.add("Dhanshree");
//		System.out.println(arrayList);
//		arrayList.set(0, "rutuja");
//		System.out.println(arrayList);
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.isEmpty());
//		System.out.println(arrayList.size());
//		arrayList.remove(0);
//		System.out.println(arrayList);
		Vector<String> vector1 = new Vector<String>();
		// arrayList1.isEmpty();
		System.out.println("Is Empty " + vector1.isEmpty());
		vector1.addAll(vector);// Add all Elements.
		vector1.add("EduBridge");
		System.out.println(vector1);
		// arrayList1.removeAll(arrayList1);
		System.out.println(vector1);
		Collections.sort(vector1);
		// System.out.println(arrayList1);
		for (String list : vector1)
			System.out.print(list + " ");
		System.out.println();
		System.out.println(vector1.contains("Kareem123"));
		System.out.println("Enumeration");
		Enumeration<String> enumobject = vector1.elements();
		System.out.println("Data in enumeration object is: ");
		while (enumobject.hasMoreElements()) {
			System.out.println("Element: " + enumobject.nextElement());
		}
		System.out.println("Iterator ");
		Iterator<String> iterator = vector1.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.println();
	}



	}


