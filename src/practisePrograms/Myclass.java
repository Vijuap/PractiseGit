package practisePrograms;
import java.util.HashMap;
import java.util.Map;

public class Myclass {
	
	private Map map;
	
	public static void main(String[] args) throws Exception {
		Myclass m=new Myclass();
		int s=m.getValue("foo", 1);
		System.out.println(s);
	}
	
	public Myclass() {
		map=new HashMap<>();
		map.put("foo", 1);
		map.put("bar",3);
	}
	
public int  getValue(String input, int numRetries) throws Exception {
	System.out.println("my ");
	try {
		return  ((Object) map.get(input)).intValue();
	}
	catch(Exception e) {
		if(numRetries>3) {
			throw e;
		}return getValue(input,numRetries+1);
	}
}
}
