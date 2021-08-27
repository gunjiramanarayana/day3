package question14;
import java.util.Scanner;
public class SUMOFnPOSITIVENUMBERS {
	
    public static void main (String[] args)
    {
    	int n,sum=0,count=0,m,pos=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        while(n>count)
        {
        	System.out.println("Enter the number");
        	m=sc.nextInt();
        	if(m>0)
        	{
        	  sum=sum+m;
        	  count++;
        	  pos++;
        	}
        	else
        	{
        		count++;
        	}
        }
        System.out.println("Number of ppositive numbers entered is " +pos+ " and the sum is "+sum);
    }
}
