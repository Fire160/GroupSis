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
	public Students(String e,String r,String t,String y,String u,String i,String o,String p)
		{
		setfName(e);
		setlName(r);
		setFirstClass(t);
		setFirstGrade(y);
		setFirstClass(u);
		setFirstGrade(i);
		setFirstClass(o);
		setFirstGrade(p);
		}
	public static String getfName()
		{
		return fName;
		}
	public static void setfName(String fName)
		{
		Students.fName = fName;
		}
	public static String getFirstClass()
		{
		return firstClass;
		}
	public static void setFirstClass(String firstClass)
		{
		Students.firstClass = firstClass;
		}
	public static String getFirstGrade()
		{
				return firstGrade;
		}
	public static void setFirstGrade(String firstGrade)
		{
				Students.firstGrade = firstGrade;
		}
	public static String getlName()
		{
				return lName;
		}
	public static void setlName(String lName)
		{
				Students.lName = lName;
		}
	public static String getSecondClass()
		{
				return secondClass;
		}
	public static void setSecondClass(String secondClass)
		{
				Students.secondClass = secondClass;
		}
	public static String getSecondGrade()
		{
				return secondGrade;
		}
	public static void setSecondGrade(String secondGrade)
		{
				Students.secondGrade = secondGrade;
		}
	public static String getThirdClass()
		{
				return thirdClass;
		}
	public static void setThirdClass(String thirdClass)
		{
				Students.thirdClass = thirdClass;
		}
	public static String getThirdGrade()
		{
				return thirdGrade;
		}
	public static void setThirdGrade(String thirdGrade)
		{
				Students.thirdGrade = thirdGrade;
		}
	}
