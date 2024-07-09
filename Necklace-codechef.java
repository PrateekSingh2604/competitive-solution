import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Queue<Integer> nl = new LinkedList<>();
		    
		    for(int j = 0; j<n; j++){
		        nl.add(sc.nextInt());
		    }
		    for(int m=0; m<k; m++){
		        nl.add(nl.poll());
		    }
		    for(int spots: nl){
		        System.out.print(" " + spots);
		    }
		    System.out.println();
		}

	} 
}
