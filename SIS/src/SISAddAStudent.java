import java.util.Scanner;
import java.util.ArrayList;
public class SISAddAStudent 
{
	static ArrayList <String> classes = new ArrayList<String>();
	static Scanner user1nput = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
		{
			
		}
	public static void addStudent()
		{
			classes.add("English");
			classes.add("Biology");
			classes.add("Algebra");
			System.out.println("Please put in a first name.");
			String firstName = user1nput.nextLine();
			
		}
}