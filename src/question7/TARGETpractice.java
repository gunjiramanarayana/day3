package question7;
import java.util.Scanner;
public class TARGETpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int trg,n,sum=0,count=1;
    Scanner sc=new Scanner(System.in);
    trg=sc.nextInt();
    n=sc.nextInt();
    sum=n;
    while(trg>=sum)
    {
    	if(trg==sum)
    	{
    		break;
    	}
    	else
    	{
    	count++;
    	n=sc.nextInt();
    	sum=sum+n;
    	}
    }
    System.out.println("The number of turns is= "+count);
	}

}
