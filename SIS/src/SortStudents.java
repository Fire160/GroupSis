import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortStudents 
	{
	public static void sort(ArrayList<Students> studentArray) 
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 1 to sort by Last Name");
		System.out.println("Enter 2 to sort by GPA");
		System.out.println("Enter 3 to sort by Class");
		int userChoice = userInput.nextInt();
		if(userChoice == 1) 
			{
			Collections.sort(studentArray, new Sorters());
			}
		else if(userChoice == 2) 
			{
			Collections.sort(studentArray, new GPASort());
			}
		else
			{
			Collections.sort(studentArray, new ClassSort());
			}
		userInput.close();
		}
	}
