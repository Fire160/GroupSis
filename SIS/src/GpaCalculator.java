import java.util.ArrayList;

public class GpaCalculator
	{
	public static void GPACalculate(ArrayList<Students> studentArray)
		{
		ArrayList<double> grades = new ArrayList<double>();
		for(int i = 0; i < studentArray.size(); i ++)
			{
			String fGrade = studentArray.get(i).getFirstGrade();
			switch(fGrade)
				{
				case "A":
				grades.add(4.00);
				break;
				case "A-":
				grades.add(3.67);
				break;
				case "B+":
				grades.add(3.33);
				break;
				case "B":
				grades.add(3.00);
				break;
				case "B-":
				grades.add(2.67);
				break;
				case "C+":
				grades.add(2.33);
				break;
				case "C":
				grades.add(2.00);
				break;
				case "C-":
				grades.add(1.67);
				break;
				case "D+":
				grades.add(1.33);
				break;
				case "D+":
				grades.add(1.00);
				break;
				case "D+":
				grades.add(0.67);
				break;
				case "F":
				grades.add(0.00);
				break;
				}
			}
		for(int i = 0; i < studentArray.size(); i ++)
			{
			String fGrade = studentArray.get(i).getSecondGrade();
			switch(fGrade)
				{
				case "A":
				grades.add(4.00);
				break;
				case "A-":
				grades.add(3.67);
				break;
				case "B+":
				grades.add(3.33);
				break;
				case "B":
				grades.add(3.00);
				break;
				case "B-":
				grades.add(2.67);
				break;
				case "C+":
				grades.add(2.33);
				break;
				case "C":
				grades.add(2.00);
				break;
				case "C-":
				grades.add(1.67);
				break;
				case "D+":
				grades.add(1.33);
				break;
				case "D+":
				grades.add(1.00);
				break;
				case "D+":
				grades.add(0.67);
				break;
				case "F":
				grades.add(0.00);
				break;
				}
			}
		for(int i = 0; i < studentArray.size(); i ++)
			{
			String fGrade = studentArray.get(i).getThirdGrade();
			switch(fGrade)
				{
				case "A":
				grades.add(4.00);
				break;
				case "A-":
				grades.add(3.67);
				break;
				case "B+":
				grades.add(3.33);
				break;
				case "B":
				grades.add(3.00);
				break;
				case "B-":
				grades.add(2.67);
				break;
				case "C+":
				grades.add(2.33);
				break;
				case "C":
				grades.add(2.00);
				break;
				case "C-":
				grades.add(1.67);
				break;
				case "D+":
				grades.add(1.33);
				break;
				case "D+":
				grades.add(1.00);
				break;
				case "D+":
				grades.add(0.67);
				break;
				case "F":
				grades.add(0.00);
				break;
				}
			}
		for(int i = 0; i < studentArray.size(); i ++)
			{
			studentArray.get(i).setGpa((grades.get(i) + grades.get(i + studentArray.size()) + grades.get(i + studentArray.size() + studentArray.size())) / 3 );
			}
		}
	}
