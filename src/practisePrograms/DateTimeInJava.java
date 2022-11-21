package practisePrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeInJava {

	public static void main(String[] args) {
 Date d=new Date();
 SimpleDateFormat s=new SimpleDateFormat("E MM-dd-YYYY");
 System.out.println(d.toString());
 
 System.out.println(s.format(d));
 
 String date=s.format(d);
 String m=date.substring(4, 6);
 System.out.println(m);
 
 switch (m) {
 case "1":
  String jan="Jan";
  System.out.print(jan);
   break;
 case "2":
	  String feb="Feb";
	  System.out.print(feb);

   break;
 case "3":
	  String mar="Mar";
	  System.out.print(mar);

   break;
 case "4":
	  String apr="Apr";
	  System.out.print(apr);

   break;
 case "5":
	  String may="May";
	  System.out.print(may);

  break;
 case "6":
	  String jun="Jun";
	  System.out.print(jun);

  break;
 case "7":
	  String jul="Jul";
	  System.out.print(jul);

  break;
 case "8":
	  String aug="Aug";
	  System.out.print(aug);

  break;
   case "9":
	  String sep="Sep";
	  System.out.print(sep);

  break;
 case "10":
	  String oct="Oct";
	  System.out.print(oct);

  break;
 case "11":
	  String nov="Nov";
	  System.out.print(nov);

  break;
 case "12":
	  String dec="Dec";
	  System.out.print(dec);

  break;
}
 
 
//  if (date.substring(4, 6)){
 String res =" "+date.substring(7,9)+"th"+" "+date.substring(10);
  
 System.out.println(res);
	

	}	

}
