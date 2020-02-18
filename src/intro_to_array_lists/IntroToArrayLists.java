package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> stringList = new ArrayList<String>();
		//2. Add five Strings to your list
		/*
		for(int i = 0; i < 5; i++) {
			stringList.add("" +  i);
		}
		*/
		stringList.add("A");
		stringList.add("AB");
		stringList.add("ABC");
		stringList.add("ABCD");
		stringList.add("ABCdE");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}
		System.out.println("\n\n");
		//4. Print all the Strings using a for-each loop
		for(String str : stringList) {
			System.out.println(str);
		}
		System.out.println("\n\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < stringList.size(); i++) {
			if(stringList.get(i).length() % 2 == 0) {
				System.out.println(stringList.get(i));
			}
		}
		System.out.println("\n\n");
		
		//6. Print all the Strings in reverse order.
		for (int i = stringList.size() - 1; i >= 0; i--) {
			System.out.println(stringList.get(i));
		}
		System.out.println("\n\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < stringList.size(); i++) {
			if(stringList.get(i).toLowerCase().contains("e")) {
				System.out.println(stringList.get(i));
			}
		}
	}
}
