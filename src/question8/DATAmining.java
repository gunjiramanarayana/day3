package question8;
import java.util.Scanner;
public class DATAmining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,m,odd=0,even=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    while(n>0)
    {
    	if(n%2==0)
    	{
    		even=even+(n%10);
    		n=n/10;
    	}
    	else
    	{
    		odd=odd+(n%10);
    		n=n/10;
    	}
    }
    if(even==odd)
    {
    	System.out.println("Yes");
    }
    else
    {
    	System.out.println("No");
    }
	}

}
