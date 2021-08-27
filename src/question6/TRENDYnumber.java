package question6;
import java.util.Scanner;
public class TRENDYnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n>=100 && n<=999)
    {
    	n=n/10;
    	n=n%10;
    	if(n%3==0)
    	{
    		System.out.println("Trendy number");
    	}
    	else
    	{
    		System.out.println("Not a trendy number");
    	}
    }
    else
    {
    	System.out.println("Not a trendy number");
    }
   
	}

}
