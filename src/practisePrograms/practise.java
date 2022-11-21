package practisePrograms;

public class practise {

	public static void main(String[] args) {
		int c=930;
		
		int mins=practise.hoursToMinutes(c);
		System.out.println(mins);
	}
	//program 1 : int x= 1130;-> 11*60+30=690mins ->11hrs and 30mins
	//program 2: String str ="HelloWorld" ->h=1,o=2 use  Hashmap
	//Program one 
	public static int hoursToMinutes(int num) {
		
		String time=Integer.toString(num);
		
		String minString=time.substring(2);
	
		System.out.println(minString);
		
		int min =Integer.parseInt(minString);
		 System.out.println(min);
 String hrsString=time.substring(0,1);
 System.out.println("+++++++++++");
 System.out.println(hrsString);
 int hours=Integer.parseInt(hrsString);
		
 
 
	
	int total=min+60*hours;
	 return total;
		
		
	}
	
	
}
