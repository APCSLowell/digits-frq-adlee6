import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	  if(num/10 > 0) {
		  digitList.add(num%10);
		  num = num/10;}
		else
		  digitList.add(num);
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		if(digiList.size() == 1)
			return true;
		for(int i = 0; i < digitList.size()-1; i++)
			return false;
		else
			return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
