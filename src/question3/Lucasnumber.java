package question3;
import java.util.Scanner;
public class Lucasnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum,fir=0,sec=0,thd=1,i,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
	    {
	    	System.out.println(0);
	    }
	    else if(n==2)
	    {
	    	System.out.println("0 0 ");
	    }
	    else if(n==3)
	    {
	    	System.out.println("0 0 1 ");
	    }
	    else
	    	{
	    	 System.out.print("0 0 1 ");
	    	
	    	  for(i=4;i<=n;i++)
	    	  {
	    		  sum=sec+thd;
	    		  sec=thd;
	    		  thd=sum;
	    		  System.out.print(sum+ " ");
	    		  
	    	  }
	    	}
    	
	}

}
