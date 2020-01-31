import java.util.*;
class Main
{
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int n1=n-1;
		while(n1!=0)
		{
			int num=n1;
			int c=0;
			while(num>0)
			{
				int r=num%10;
				num/=10;
				if(r==m)
				{
					c++;
					break;
				}
			}
			if(c==1)
			{
				n1--;
			}
			else
			{
				break;
			}
		}
		System.out.print(n1);
}
}