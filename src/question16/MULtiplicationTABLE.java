package question16;
import java.util.Scanner;
public class MULtiplicationTABLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int m,n,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enetr n ");
     n=sc.nextInt();
     System.out.println("Enetr m ");
     m=sc.nextInt();
     for(i=1;i<=m;i++)
     {
    	 System.out.println(i+"*"+n+"="+(i*n));
     }
	}

}
