package git_project_package;

import java.util.Scanner;

public class ProjectClass {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Shams from local");
		
		 Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
	        fib(num);

	    }

	    public static void fib(int num){
	        //WRITE YOUR CODE HERE
	    	
	    	int fibArr []= new int[num+2];
	    	fibArr[0] = 0;
	    	fibArr[1] = 1;
	    	
	    	for(int i = 2; i<=num; i++) {
	    		fibArr[i]=fibArr[i-1]+fibArr[i-2];
	    	} 
	    	System.out.println(fibArr[num]);
		    
		System.out.println("Thank you");
	}

}
