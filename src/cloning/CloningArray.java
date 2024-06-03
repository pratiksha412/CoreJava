package cloning;

public class CloningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {1,2,3,4,5,}, {6,7,8,9,10} };
		int cloneArray[][] = arr.clone();
		System.out.print(arr[0] == cloneArray[0]);
		System.out.print(arr[1] == cloneArray[1]);

	}

}
