import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class SISRun 
	{
	public static void main(String[] args) throws IOException
		{
		ArrayList<Students> studentArray = createArrayList();
		printList(studentArray);
		boolean running = true;
		Scanner input = new Scanner(System.in);
		while(running == true)
			{
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
		file.close();
		return myArray;
		}
	public static void printList(ArrayList<Students> studentArray)
		{
		for(int i = 0; i < studentArray.size(); i++)
			{
			System.out.println("[" + i + "] " + studentArray.get(i).getlName() + " " + studentArray.get(i).getfName() + " " + studentArray.get(i).getGpa() + " " + studentArray.get(i).getFirstClass() + " " + studentArray.get(i).getFirstGrade() + " " + studentArray.get(i).getSecondClass() + " " + studentArray.get(i).getSecondGrade() + " " + studentArray.get(i).getThirdClass() + " " + studentArray.get(i).getThirdGrade());
			}
		}
	}