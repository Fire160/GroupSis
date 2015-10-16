import java.util.Comparator;

public class GPASort implements Comparator<Students>
	{
	public int compare(Students s1, Students s2)
		{
		if(s1.getGpa() < s2.getGpa())
			{
			return 1;
			}
		else
			{
			return -1;
			}
		}
	}