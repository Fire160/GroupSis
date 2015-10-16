import java.util.ArrayList;

public class GpaCalculator
	{
	public static void GPACalculate(ArrayList<Students> studentArray)
		{
		ArrayList grades = new ArrayList();
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
				case "D":
				grades.add(1.00);
				break;
				case "D-":
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
				case "D":
				grades.add(1.00);
				break;
				case "D-":
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
				case "D":
				grades.add(1.00);
				break;
				case "D-":
				grades.add(0.67);
				break;
				case "F":
				grades.add(0.00);
				break;
				}
			}
		for(int i = 0; i < studentArray.size(); i ++)
			{
			double temp1 = (double) grades.get(i);
			double temp2 = (double) grades.get(i + studentArray.size() - 1);
			double temp3 = (double) grades.get(i + studentArray.size() + studentArray.size() - 2);
			studentArray.get(i).setGpa((temp1 + temp2 + temp3) / 3 );
			}
		}
	}
