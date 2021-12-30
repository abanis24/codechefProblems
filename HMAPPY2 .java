/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int K=sc.nextInt();
		  
		    int g=gcd(A,B);
		    int lcm=(A*B)/g;
		    int tab=N/lcm;
		    int ta=N/A - tab;
		    int tb=N/B - tab;
		    
		    if(ta+tb>=K)
		        System.out.println("Win");
		    else
		        System.out.println("Lose");
	}
	}
	public static int gcd(int A,int B){
		    if(A<B)
		    {
		        return gcd(B,A);
		        
		    }
		    else if(B==0){
		        return A;
		    }
		    else{
		        return gcd(B,A%B);
		    }
	}
}
