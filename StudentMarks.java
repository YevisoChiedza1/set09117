import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class StudentMarks{
	public static void main(String[] args){
		
		//Create an ArrayList<Integer> called marks.
		ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(5, 72, 0, 55, 88));
		
		int highestMark = marks.get(0);
		int lowestMark = marks.get(0);
		int total = 0;
		
		//print all the marks
		for (int mark: marks){
			System.out.println("Mark: " + mark);
		}
		
		//Calculate the highestMark
		for (int i = 0; i < marks.size(); i++){
			if (marks.get(i) >= highestMark){
				highestMark = marks.get(i);
			}
			if (marks.get(i) <= lowestMark){
				lowestMark = marks.get(i);
			}
			
			total = total + marks.get(i);
	
		}
		
		System.out.println("Highest Mark: " + highestMark);
		
		System.out.println("Lowest Mark: " + lowestMark);
		
		//calculate the average
		double average = (double) total / marks.size();
		
		System.out.println("Average: " + average);
		
		//remove marks below 60
		for (int i = 0; i < marks.size(); i++){
			if( marks.get(i) < 60){
				marks.remove(i);
			}
		}
		
		System.out.println("Updated List: " + marks);
		
	}
}