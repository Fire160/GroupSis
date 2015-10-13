import java.util.*;
public class SortStudents {
	
	public static Student SortLastName(studentArray) {
		
	}
	public static Student SortGPA(studentArray) {
		
	}
	public static Student SortClass(studentArray) {
		
	}
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 1 for sort by last name");
		System.out.println("Enter 2 for sort by GPA");
		System.out.println("Enter 3 for sort by GPA");
		int userChoice = userInput.nextInt();
		if(userChoice == 1) {
			SortLastName();
		}
		if(userChoice == 2) {
			SortGPA();
		}
		if(userChoice == 3) {
			SortClass();
		}
	}

}
