package question2;
import java.util.Scanner;
public class factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n,i;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int sum=1;
   for(i=1;i<=n && sum<n;i++)
   {
	   sum=sum*i;
   }
   if(n==sum)
   {
      System.out.println("yes");
   }
   else
   {
	   System.out.println("no");
   }
   
	}

}
