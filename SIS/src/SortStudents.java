import java.util.ArrayList;
import java.util.Scanner;
public class SortStudents 
	{
	public static void sortLastName(ArrayList<Students> studentArray)
		{
		return;
		}
	public static void sortGPA(ArrayList<Students> studentArray) 
		{
		return;
		}
	public static void sortClass(ArrayList<Students> studentArray) 
		{
		return;
		}
	public static void sort(ArrayList<Students> studentArray) 
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 1 to sort by last name");
		System.out.println("Enter 2 to sort by GPA");
		System.out.println("Enter 3 to sort by GPA");
		int userChoice = userInput.nextInt();
		if(userChoice == 1) 
			{
			sortLastName(studentArray);
			}
		if(userChoice == 2) 
			{
			sortGPA(studentArray);
			}
		if(userChoice == 3) 
			{
			sortClass(studentArray);
			}
		}
	}
