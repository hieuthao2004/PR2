package tut11;

import java.util.ArrayList;

public class ArrayListIntegerLoop {
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		
		for (int i = 0; i<10; i++) {
			myArray.add(i+1);
		}
		
		for (int j = 0; j<10; j++) {
			System.out.print("" + myArray.get(j) + " ");
		}
	}
}
