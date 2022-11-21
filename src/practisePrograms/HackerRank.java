package practisePrograms;
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	public class HackerRank {
		
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        Result.fizzBuzz(n);

	        bufferedReader.close();
	    }
	


public  static class Result{
	    public static void fizzBuzz(int n) {
	        
	        
	    // Write your code here
	    
	    for (int i=1; i<=n;i++){
	        if(i%3==0 && i%5==0)
	        {
	            System.out.println("Fizzbuzz");
	        }else if(i%3==0 && i%5!=0){
	            System.out.println("Fizz");
	        }else if(i%5==0 && i%3!=0){
	            System.out.println("Buzz");
	        }else {
	            System.out.println(i);
	        }
}
	    }
	    
}
}
