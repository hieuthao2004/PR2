package tut11;

import java.util.*;

public class ArrayListOperations {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(126);
		list.add(1.24);
		list.add(true);
		list.add("Hello World");
		
		for (int i = 0; i< list.size(); i++)
		System.out.println(list.get(i));
	}
}
