import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class SISRun 
	{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException
		{
		ArrayList<Students> studentArray = createArrayList();
		GpaCalculator.GPACalculate(studentArray);
		printList(studentArray);
		boolean running = true;
		while(running == true)
			{
			System.out.println("+---------(MAIN MENU)---------+");
			System.out.println("Add or remove students      [1]");
			System.out.println("Change grades or schedules  [2]");
			System.out.println("Sort by last name/GPA/class [3]");
			System.out.println("Print current Students      [4]");
			System.out.println("Exit program                [5]");
			String u = input.nextLine();
			if(u.contains("1"))
				{
				SISAddAStudent.addMenu(studentArray);
				}
			else if(u.contains("2"))
				{
				Change.change(studentArray);
				}
			else if(u.contains("3"))
				{
				SortStudents.sort(studentArray);
				}
			else if(u.contains("4"))
				{
				printList(studentArray);
				}
			else
				{
				running = false;
				}
			}
		input.close();
		}
	public static ArrayList<Students> createArrayList() throws IOException
		{
		Scanner file = new Scanner(new File("studentlist3.txt"));
		ArrayList<Students> myArray = new ArrayList<Students>();
		while(file.hasNext())
			{
			String z = file.next();
			String x = file.next();
			double c = 0.0;
			String v = file.next();
			String b = file.next();
			String n = file.next();
			String m = file.next();
			String a = file.next();
			String s = file.next();
			myArray.add(new Students(z,x,c,v,b,n,m,a,s));
			}
		return myArray;
		}
	public static void printList(ArrayList<Students> studentArray)
		{
		for(int i = 0; i < studentArray.size(); i++)
			{
			System.out.print("[" + (i + 1) + "]  [LAST] " + studentArray.get(i).getlName() + " [FIRST] " + studentArray.get(i).getfName() + " [GPA] ");
			System.out.printf("%.2f",studentArray.get(i).getGpa());
			System.out.println(" [P1] " + studentArray.get(i).getFirstClass() + " [GRADE] " + studentArray.get(i).getFirstGrade() + " [P2] " + studentArray.get(i).getSecondClass() + " [GRADE] " + studentArray.get(i).getSecondGrade() + " [P3] " + studentArray.get(i).getThirdClass() + " [GRADE] " + studentArray.get(i).getThirdGrade());
			}
		}
	}