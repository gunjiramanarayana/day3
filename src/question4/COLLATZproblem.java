package question4;
import java.util.Scanner;
public class COLLATZproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,count=0;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     if(n==1)
     {
    	 System.out.println(n);
    	 System.out.println(count);
     }
     else
     {
    	 while(n!=1)
    	 {
    	 if(n%2==0)
    	 {
    		 n=n/2;
    		 System.out.println(n);
    		 count++; 
    	 }
    	 else
    	 {
    		 n=((3*n)+1);
    		 System.out.println(n);
    		 count++;
    	 }
    	 }
    	 System.out.println(count);
     }
     
	}

}
