import java.util.*;
class Main
{	
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	
	for(int i=Integer.parseInt(s1)-1;i>=0;i--)
	{
		if(String.valueOf(i).contains(s2))
		{}
		else
		{
			System.out.println(i);
			break;
		}		
	}	
	}
}