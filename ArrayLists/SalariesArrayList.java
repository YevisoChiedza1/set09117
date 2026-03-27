import java.util.ArrayList;
import java.util.Collections;

class SalariesArrayList{
	public static void main(String[] args){
		//create an arraylist to store salaries
		ArrayList<Double> salaries = new ArrayList<>();
		
		//create an arraylist to store salaries after increase
		ArrayList<Double> newSalaries = new ArrayList<>();
		
		//add salaries to the array list
		salaries.add(25000.0);
		salaries.add(32000.0);
		salaries.add(28000.0);
		salaries.add(40000.0);
		salaries.add(29000.0);
		
		//print all salaries
		System.out.println("Salaries: " + salaries);
		
		//increase every salary by 10%
		double salaryIncrease = 0.1;
		
		for(int i = 0; i < salaries.size(); i++){
			double newSalary = salaries.get(i) + (salaries.get(i) * salaryIncrease);
			newSalaries.add(newSalary);
		}
		
		//print all salaries after 10% increase
		System.out.println("Salaries( after 10% increase): " + newSalaries);
		
		//initialize values for the highest,lowest and average salary
		double highestSalary = newSalaries.get(0);
		
		double lowestSalary = newSalaries.get(0);
		
		double total = 0;
		
		//find and print the highest salary and compute the total for average
		for (int i = 0; i <  newSalaries.size(); i++){
			if (newSalaries.get(i) >= highestSalary){
				highestSalary = newSalaries.get(i);
			}
			
			total = total + newSalaries.get(i);
		}
		
		//find the lowest salary, loop backwards
		for (int i = newSalaries.size() - 1; i >= 0; i--){
			
			if (newSalaries.get(i) <= lowestSalary){
				lowestSalary = newSalaries.get(i);
			}
		}
		
		//compute the average
		double average = (double) total/ newSalaries.size();
		
		//Print the highest,lowest and average salary
		System.out.println("Highest Salary: " + highestSalary);
		System.out.println("Lowest Salary: " + lowestSalary);
		System.out.println("Average Salary: " + average);
		
		//Remove all salaries that are below 30000 after the increase.
		
		double salaryCap = 30000.0;
		for (int i = 0; i < newSalaries.size(); i++){
			if(newSalaries.get(i) <  salaryCap){
				newSalaries.remove(i);
			}
		}
		
		//print the new salaries
		System.out.println("Salaries greater than 3000: " + newSalaries);
		
		//sort the remaining list
		Collections.sort(newSalaries);
		
		//print the sorted salaries
		System.out.println("Sorted Salaries: " + newSalaries);
		
		
		
	}
}
		
		
		
		
		