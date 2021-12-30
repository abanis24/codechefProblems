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
		    int L=sc.nextInt();
		    int B=sc.nextInt();
		    int res=gcd(L,B);
		    System.out.println(res);
		}
	}
	public static int gcd(int L,int B){
	    if(B==0){
	        return L;
	    }
	    return gcd(B,L%B);
	}
}
