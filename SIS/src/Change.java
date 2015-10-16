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
				int name = things.nextInt()- 1;
				System.out.println("Now select a period's grade to be changed!");
				int gradeChange = things.nextInt();
				System.out.println("And finally assign their grade!");
				things.nextLine();
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
				GpaCalculator.GPACalculate(studentArray);
				System.out.print("[" + (name + 1) + "] " + studentArray.get(name).getlName() + " " + studentArray.get(name).getfName() + " ");
				System.out.printf("%.2f",studentArray.get(name).getGpa());
				System.out.println(" " + studentArray.get(name).getFirstClass() + " " + studentArray.get(name).getFirstGrade() + " " + studentArray.get(name).getSecondClass() + " " + studentArray.get(name).getSecondGrade() + " " + studentArray.get(name).getThirdClass() + " " + studentArray.get(name).getThirdGrade());
				}
			else if(stuff == 2)
				{
				System.out.println("Select a Student by their number!");
				int name = things.nextInt() - 1;
				System.out.println("Now select a period to be switched!");
				int classChange = things.nextInt();
				System.out.println("Now select the period to be switched with!");
				int class2Change = things.nextInt();
				if(classChange == 1)
					{
					if(class2Change == 2)
						{
						String temp = studentArray.get(name).getFirstClass();
						String temp1 = studentArray.get(name).getFirstGrade();
						studentArray.get(name).setFirstClass(studentArray.get(name).getSecondClass());
						studentArray.get(name).setFirstGrade(studentArray.get(name).getSecondGrade());
						studentArray.get(name).setSecondClass(temp);
						studentArray.get(name).setSecondGrade(temp1);
						}
					else if(class2Change == 3)
						{
						String temp = studentArray.get(name).getFirstClass();
						String temp1 = studentArray.get(name).getFirstGrade();
						studentArray.get(name).setFirstClass(studentArray.get(name).getThirdClass());
						studentArray.get(name).setFirstGrade(studentArray.get(name).getThirdGrade());
						studentArray.get(name).setThirdClass(temp);
						studentArray.get(name).setThirdGrade(temp1);
						}
					else
						{
						}
					}
				else if(classChange == 2)
					{
					if(class2Change == 1)
						{
						String temp = studentArray.get(name).getSecondClass();
						String temp1 = studentArray.get(name).getSecondGrade();
						studentArray.get(name).setSecondClass(studentArray.get(name).getFirstClass());
						studentArray.get(name).setSecondGrade(studentArray.get(name).getFirstGrade());
						studentArray.get(name).setFirstClass(temp);
						studentArray.get(name).setFirstGrade(temp1);
						}
					else if(class2Change == 3)
						{
						String temp = studentArray.get(name).getSecondClass();
						String temp1 = studentArray.get(name).getSecondGrade();
						studentArray.get(name).setSecondClass(studentArray.get(name).getThirdClass());
						studentArray.get(name).setSecondGrade(studentArray.get(name).getThirdGrade());
						studentArray.get(name).setThirdClass(temp);
						studentArray.get(name).setThirdGrade(temp1);
						}
					else
						{
						}
					}
				else
					{
					if(class2Change == 2)
						{
						String temp = studentArray.get(name).getThirdClass();
						String temp1 = studentArray.get(name).getThirdGrade();
						studentArray.get(name).setThirdClass(studentArray.get(name).getSecondClass());
						studentArray.get(name).setThirdGrade(studentArray.get(name).getSecondGrade());
						studentArray.get(name).setSecondClass(temp);
						studentArray.get(name).setSecondGrade(temp1);
						}
					else if(class2Change == 1)
						{
						String temp = studentArray.get(name).getThirdClass();
						String temp1 = studentArray.get(name).getThirdGrade();
						studentArray.get(name).setThirdClass(studentArray.get(name).getFirstClass());
						studentArray.get(name).setThirdGrade(studentArray.get(name).getFirstGrade());
						studentArray.get(name).setFirstClass(temp);
						studentArray.get(name).setFirstGrade(temp1);
						}
					else
						{
						}
					}
				System.out.print("[" + (name + 1) + "] " + studentArray.get(name).getlName() + " " + studentArray.get(name).getfName() + " ");
				System.out.printf("%.2f",studentArray.get(name).getGpa());
				System.out.println(" " + studentArray.get(name).getFirstClass() + " " + studentArray.get(name).getFirstGrade() + " " + studentArray.get(name).getSecondClass() + " " + studentArray.get(name).getSecondGrade() + " " + studentArray.get(name).getThirdClass() + " " + studentArray.get(name).getThirdGrade());
				}
			else
				{
				subRunning = false;
				}
			}
		}
	}
