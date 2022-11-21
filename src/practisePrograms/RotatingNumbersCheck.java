package practisePrograms;
import java.util.HashMap;

public class RotatingNumbersCheck {

	public static void main(String[] args) {
System.out.println(rotateCheck(16891));
System.out.println(rotateCheck(100));


	}
	public static  boolean rotateCheck(int input) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		hm.put(1,1);
		hm.put(0, 0);
		hm.put(8, 8);
		hm.put(6, 9);
		hm.put(9, 6);
		
		System.out.println(input);
		int reverse=0;
		int number=input;
		
		while(input>0) {
			int rt=input%10;
			if (!hm.containsKey(rt)) {
				return false;
			}else {
				reverse*=10;
				reverse+=hm.get(rt);
				input=input/10;
			}
		}
		
		return reverse==number;
	}

}
