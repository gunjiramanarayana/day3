package question15;
import java.util.Scanner;
public class countpositiveANDnegativeNUMBERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,neg=0,count=0,m,pos=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        while(n>count)
        {
        	System.out.println("Enter the number");
        	m=sc.nextInt();
        	if(m>0)
        	{
        	  pos++;
        	  count++;
        	}
        	else
        	{
        		neg++;
        		count++;
        	}
        }
        System.out.println("Number of ppositive numbers entered is " +pos+ " and the number of negative numbers entered is "+neg);
	}

}
