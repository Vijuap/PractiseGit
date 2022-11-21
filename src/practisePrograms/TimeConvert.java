package practisePrograms;

public class TimeConvert {

	public static void main (String[] args ) {
	String str ="930";
	

String res=str.substring(0,1)+"hrs"+"  "+str.substring(2)+"mins";
String hrs=str.substring(0,2);//11
  System.out.println(res);
  int hrsM=Integer.parseInt(hrs);
  String mins=str.substring(2);
  int minsM=Integer.parseInt(mins);
  
  int totalhrsmins=(hrsM*60)+minsM;
  System.out.println(totalhrsmins);
  
}
}
