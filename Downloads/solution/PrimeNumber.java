package mypackage;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
public class PrimeNumber {
	
	public static void main(String args[]) {
	
	ArrayList<Long> arr= new ArrayList<Long>();	

	arr.add((long) 2.0);
	// long max 
	long max=10000;
	long startTime = System.currentTimeMillis();
	for(long i=3;i<max;i++){
		Boolean  isPrime=false;
		//Check is all the numbers are prime.
			 for(Long primenumber: arr){
				 if (i%primenumber != 0){
			            isPrime=true;
				 }
			         else{
			            isPrime=false;
			            break;
			         }
			 }
			 //Condition satisfies means you add to the list of primes.
		if(isPrime){
			      arr.add(i);
		}
			 
	}
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	//add 1 to the list since its divisible by all numbers.
	
	arr.add((long)1.0);
    System.out.println(totalTime+"totaltime");
    System.out.println(arr.size()+"Space Anaylsis for size of the array");
	System.out.println(arr);
 }
}
	
	
	
		
	
	
	
	


