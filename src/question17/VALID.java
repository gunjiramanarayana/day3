package question17;
import java.util.Scanner;
public class VALID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,count=0,valid=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of repetetion ");
    n=sc.nextInt();
    while(n>count)
    {
    	System.out.println("Enter the number:");
    	i=sc.nextInt();
    	if(i%8==0)
    	{
    		count++;
    		valid++;
    	}
    	else
    	{
    		count++;
    	}
    }
    System.out.println("The number of valid numbers entered is " +valid);
	}

}
