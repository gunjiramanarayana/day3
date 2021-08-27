package question5;
import java.util.Scanner;
public class VIVAODDnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,count=0,n;
	double  score=0;
   Scanner sc=new Scanner(System.in);
   for(i=0;i<=0 && count>=3;i++)
   {
	  // Scannersc =new Scanner(System.in);
	   n=sc.nextInt();
	   if(n%2==1 && n>0 )
	   {
		   count++;
		   score++;
	   }
	   else if(n%2==0 &&  n>0)
	   {
		   score=(score- 0.5);
	   }
	   else
	   {
		   count=3;
	   }
   }
   System.out.println(score);
	}

}
