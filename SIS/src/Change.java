import java.util.ArrayList;
import java.util.Scanner;

public class Change
	{
	public static void change(ArrayList<Students> studentArray)
		{
		Scanner things = new Scanner(System.in);
		boolean subRunning = true;
		while(subRunning == true)
			{
			System.out.println("Change Grades    [1]");
			System.out.println("Change Scheldule [2]");
			System.out.println("Return to menu   [3]");
			int stuff = things.nextInt();
			if(stuff == 1)
				{
				System.out.println("Select a Student by their number!");
				int name = things.nextInt();
				System.out.println("Now select a period's grade to be changed!");
				int gradeChange = things.nextInt();
				System.out.println("And finally assign their grade!");
				String newGrade = things.nextLine();
				if(gradeChange == 1)
					{
					studentArray.get(name).setFirstGrade(newGrade);
					}
				else if(gradeChange == 2)
					{
					studentArray.get(name).setSecondGrade(newGrade);
					}
				else
					{
					studentArray.get(name).setThirdGrade(newGrade);
					}
				subRunning = false;
				}
			else if(stuff == 2)
				{
				System.out.println("Select a Student by their number!");
				int name = things.nextInt();
				System.out.println("Now select a period's class to be switched!");
				int classChange = things.nextInt();
				System.out.println("Now select a new period's class!");
				String class2Change = things.nextLine();
				if(classChange == 1)
					{
						studentArray.get(name).setFirstClass(studentArray.get(studentArray.size()-2));;
					}
				else if(classChange == 2)
					{
						
					}
				else
					{
						
					}
				subRunning = false;
				}
			else
				{
				subRunning = false;
				}
			}
		things.close();
		}
	}
