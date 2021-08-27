package question1;
import java.util.Scanner;
public class amobianumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,fir=0,sec=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of months");
    n=sc.nextInt();
    if(n==1)
    {
    	System.out.println(0);
    }
    else if(n==2)
    {
    	System.out.println(1);
    }
    else
    {
    	int sum;
    	for(int i=3;i<=n;i++)
    	{
    		sum=fir+sec;
    		fir=sec;
    		sec=sum;
    	}
    	System.out.println("the amoebia size is",+sum);
    }
	}

}
