import java.util.Scanner;
import java.util.ArrayList;
public class SISAddAStudent 
{
	static ArrayList <String> classes = new ArrayList<String>();
	static ArrayList <String> className = new ArrayList<String>();
	static Scanner user1nput = new Scanner(System.in);
	static Scanner userInput1 = new Scanner(System.in);
	static Scanner userInput2 = new Scanner(System.in);
	public static void addStudent()
		{
			className.add("English [1]");
			className.add("Biology [2]");
			className.add("Algebra [3]");
			System.out.println("Please put in a first name.");
			String firstName = user1nput.nextLine();
			System.out.println("Please put in a last name.");
			String lastName = user1nput.nextLine();
			System.out.println("What classes do you want him in?");
			System.out.print(className);
			System.out.println("Enter (1) for English for the 1st class, (2) for Biology the next class, (3) for Algebra the next class.");
			int classChoice1 = userInput1.nextInt();
			className.remove(classChoice1 - 1);
			System.out.println();
			System.out.print(className);
			System.out.println("What is the next class you want him in?");
			int classChoice2 = userInput1.nextInt();
			className.remove(classChoice2 - 1);
			System.out.print(className);
			className.remove(0);
		}
}