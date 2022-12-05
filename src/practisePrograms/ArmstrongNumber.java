package practisePrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(200));
		
	}
	public static boolean isArmstrong(int num) {
		int temp,sum = 0,rev;
		temp=num;
		
		while(num>0) {
			rev=num%10;
			num=num/10;
			sum=sum+rev*rev*rev;
		}
		if(sum==temp) {
			return true;
		}else {
			return false;
		}
		
	}

}
