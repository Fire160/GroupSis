public class Students
	{
	private static String fName;
	private static String lName;
	private static String firstClass;
	private static String firstGrade;
	private static String secondClass;
	private static String secondGrade;
	private static String thirdClass;
	private static String thirdGrade;
	private static double gpa;
	public Students(String e, String r, double a, String t, String y, String u, String i, String o, String p)
		{
		fName = e;
		lName = r;
		gpa = a;
		firstClass = t;
		firstGrade = y;
		secondClass = u;
		secondGrade = i;
		thirdClass = o;
		thirdGrade = p;
		}
	public String getfName()
		{
		return fName;
		}
	public void setfName(String fName)
		{
		Students.fName = fName;
		}
	public String getFirstClass()
		{
		return firstClass;
		}
	public void setFirstClass(String firstClass)
		{
		Students.firstClass = firstClass;
		}
	public String getFirstGrade()
		{
		return firstGrade;
		}
	public void setFirstGrade(String firstGrade)
		{
		Students.firstGrade = firstGrade;
		}
	public String getlName()
		{
		return lName;
		}
	public void setlName(String lName)
		{
		Students.lName = lName;
		}
	public String getSecondClass()
		{
		return secondClass;
		}
	public void setSecondClass(String secondClass)
		{
		Students.secondClass = secondClass;
		}
	public String getSecondGrade()
		{
		return secondGrade;
		}
	public void setSecondGrade(String secondGrade)
		{
		Students.secondGrade = secondGrade;
		}
	public String getThirdClass()
		{
		return thirdClass;
		}
	public void setThirdClass(String thirdClass)
		{
		Students.thirdClass = thirdClass;
		}
	public String getThirdGrade()
		{
		return thirdGrade;
		}
	public void setThirdGrade(String thirdGrade)
		{
		Students.thirdGrade = thirdGrade;
		}
	public double getGpa()
		{
		return gpa;
		}
	public void setGpa(double gpa)
		{
		Students.gpa = gpa;
		}
	}
