package question12;
import java.util.Scanner;
public class print3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    m=sc.nextInt();
	    if(n>=m)
	    {
	    while(n>=m)
	    {
	    	System.out.println(n);
	    	n--;
	    }
	    }
	    else
	    {
	    	while(n<=m)
	        {
	        	System.out.println(n);
	        	n++;
	        }
	    }
	}

}
