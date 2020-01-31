import java.util.*;
class Main{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter a digit to be removed");
		int m;
		m=sc.nextInt();
		int n1=n,c=0,flag=0,ans=0;
		while(n1>0)
		{
			int r=n1%10;
			n1/=10;
			c++;
			if(r==m)
			{
				flag=1;
				ans=((n/(int)Math.pow(10,c-1))*(int)Math.pow(10,c-1))-1;
			}
		}
		if(flag==0)
		{
			ans=n-1;
		}
		System.out.println(ans);
	}
}
		