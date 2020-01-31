import java.util.*;
class Main{
	public static void main(String args[])
	{
		double n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();
		if(n>0)
		{
				if(n<1){
					System.out.println("small positive num ");
					}
				else if(n>1000000)
				{
					System.out.println("large positive num ");
				}
				else
				{ 
					System.out.println("positive num ");
				}
		}
		else if(n<0){
		if(Math.abs(n)<1){
			System.out.println("small negative num ");
			}
			else if(Math.abs(n)>1000000){
			System.out.println("large positive num");
			}
			else{
			System.out.println("zero");
			}
		}
	}
}
			