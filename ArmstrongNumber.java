package javatask;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
	      System.out.println("Enter the value");
	      int n=obj.nextInt();
	      int n1=n; 
	      int l,result=0;
	      while(n>0)
	      {
	    	 
	    	  l=n%10;
	    	  
	    	  result+=l*l*l;//result=l*l*l+result;
	    	 
	    	  n=n/10;
	    	  
	      }
	      if(n1==result)
	    	  System.out.println("The given number is armstrong number");
	      else
	    	  System.out.println("The given number is not a armstrong number");
		}


	}

