import java.util.Comparator;

public class Sorters implements Comparator<Students>
	{
	public int compare(Students s1, Students s2)
		{
		return s1.getlName().compareTo(s2.getlName());
		}
	}
