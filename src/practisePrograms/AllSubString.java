package practisePrograms;

import java.util.ArrayList;
import java.util.List;

public class AllSubString {

	public static void main(String[] args) {
System.out.println(subStrings("Vijaya"));
	}
public static List<String> subStrings(String str){
	List<String> subStringList=new ArrayList<>();
	for (int i=0;i<=str.length();i++) {
		for (int j=1+i;j<=str.length();j++) {
			subStringList.add(str.substring(i,j));
		
		}
	}
	System.out.println(subStringList.size());
	return subStringList;
}
}
