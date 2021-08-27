package question9;
import java.util.Scanner;
public class Specialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,m,sum=0,mul=1,i,j,k,spe;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    if(n>=10 && m<=99)
    {
    	for(k=n;k<=m;k++)
    	{
    	    spe=0;
    		i=k%10;
    	  j=k/10;
    	  sum=i+j;
    	  mul=i*j;
    	  spe=sum+mul;
    	  if(spe==k)
    	  {
    	    System.out.println(k);
    	  }
    	}
    	  
    }
	}
}
