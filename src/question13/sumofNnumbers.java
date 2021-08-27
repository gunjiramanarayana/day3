package question13;
import java.util.Scanner;
public class sumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,sum=0,count=0,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
    while(n>count)
    {
    	System.out.println("Enter the number");
    	m=sc.nextInt();
    	sum=sum+m;
    	count++;
    }
    System.out.println(sum);
	}

}
