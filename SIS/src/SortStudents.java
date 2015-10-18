import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudents 
	{
	public static void sort(ArrayList<Students> studentArray) 
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Sort by Last Name    [1]");
		System.out.println("Sort by GPA          [2]");
		System.out.println("Sort by Class        [3]");
		System.out.println("Return to menu       [4]");
		int userChoice = userInput.nextInt();
		if(userChoice == 1) 
			{
			Collections.sort(studentArray, new Sorters());
			SISRun.printList(studentArray);
			}
		else if(userChoice == 2) 
			{
			Collections.sort(studentArray, new GPASort());
			SISRun.printList(studentArray);
			}
		else if(userChoice == 3)
			{
			Collections.sort(studentArray, new ClassSort());
			SISRun.printList(studentArray);
			}
		else
			{
			}
		}
	}
