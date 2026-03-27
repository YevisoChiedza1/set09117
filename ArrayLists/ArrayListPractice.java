import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayListPractice{
	public static void main(String[] args){
		//create an array list, add some colors (strings) and print out the collection.
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue","Pink", "Green", "Purple", "Black"));
		System.out.println(colors);
		
		//Write a Java program to iterate through all elements in an array list.
		for (String color: colors){
			System.out.println(color);
		}
		
		//insert an element into the array list at the first position.
		colors.add(0,"White");
		System.out.println(colors);
		
		//retrieve an element (at a specified index) from a given array list.
		System.out.println(colors.get(2));
		
		//update an array element by the given element.
		colors.set(1,"Orange");
		System.out.println(colors);
		
		//to remove the third element from an array list.
		colors.remove(2);
		System.out.println(colors);
		
		//search for an element use contains
		if(colors.contains("Orange")){
			System.out.println("Color found");
		}
		else{
			System.out.println("Color not found");
			
		}
		
		//sort an array list
		Collections.sort(colors);
		System.out.println(colors);
		
		//copy an arraylist into another array list
		ArrayList<String> colors2= new ArrayList<>(Arrays.asList("Blue","Green","Pink","White","Maroon"));
		
		Collections.copy(colors2,colors);
		System.out.println(colors);
		System.out.println(colors2);
		
	}
}
