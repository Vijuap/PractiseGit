package practisePrograms;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
int rev=reverseNumber(12345);
System.out.println(rev);

int i=5;
System.out.printf("%d %d %d %d %d",i,i++,--i,++i,i--);

System.out.println(rev/1000+","+rev%1000+" ");
	}
public static int reverseNumber(int a) {
	System.out.println(a/100);

	int reverse=0;
	int count =0;
	while(a!=0) {
		count ++;
		reverse=reverse*10;
		reverse=reverse+a%10;
		a=a/10;
	}
	

	return reverse;
}
}
