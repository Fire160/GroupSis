import java.util.Scanner;
import java.util.ArrayList;
public class SISAddAStudent 
	{
	public static void addMenu(ArrayList<Students> studentArray)
		{
		Scanner userInput = new Scanner(System.in);
		boolean subRunning = true;
		while(subRunning == true)
			{
			System.out.println("Type 1 to add a student");
			System.out.println("Type 2 to remove a student");
			System.out.println("Type any other number to return to the menu");
			int stuff = userInput.nextInt();
			if(stuff == 1)
				{
				ArrayList <String> classes = new ArrayList<String>();
				ArrayList <String> className = new ArrayList<String>();
				className.add("English");
				className.add("Biology");
				className.add("Algebra");
				System.out.println("Please put in a first name.");
				String firstName = userInput.nextLine();
				System.out.println("Please put in a last name.");
				String lastName = userInput.nextLine();
				System.out.println("What classes do you want him in?");
				System.out.println("[1] " + className.get(0) + "  [2]" + className.get(1) + " [3]" + className.get(2));
				int classChoice1 = userInput.nextInt();
				classes.add(className.get(classChoice1 - 1));
				className.remove(classChoice1 - 1);
				System.out.println("[1] " + className.get(0) + "  [2]" + className.get(1));
				System.out.println("What is the next class you want him in?");
				int classChoice2 = userInput.nextInt();
				classes.add(className.get(classChoice2 - 1));
				className.remove(classChoice2 - 1);
				classes.add(className.get(0));
				studentArray.add(new Students(firstName, lastName, 0.00, classes.get(0), "A+", classes.get(1), "A+", classes.get(2), "A+"));
				SISRun.printList(studentArray);
				}
			else if(stuff == 2)
				{
				Scanner things = new Scanner(System.in);
				System.out.println("Put in the number of the student you would like to remove");
				int g = things.nextInt();
				studentArray.remove(g - 1);
				SISRun.printList(studentArray);
				things.close();
				}
			else
				{
				subRunning = false;
				}
			}
		userInput.close();
		}
	}