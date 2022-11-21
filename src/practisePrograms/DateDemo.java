package practisePrograms;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date=new Date();
	      SimpleDateFormat ft =new SimpleDateFormat (" E MM:dd:yyyy,  hh:mm:ss ");

	      System.out.println("Current Date: " + ft.format(date));
       
	      String s1=ft.format(date).toString().substring(1, 4).toUpperCase();
	      System.out.println(s1);
	      
	      
	      
	      switch (	s1)

	      
	      {
	    	  case "SUN" :
	    		  System.out.println("Its sunday");
	    		  break;
	    	  case "MON":
		    		  System.out.println("Its Monday");
		    		  break;
		    		  case "TUE" : System.out.println("Its Tuesday");
			    		  break;
			    case "WED" :
				    		  System.out.println("Its Wednesday");
				    		  break;
			  case "THU" :
					    		  System.out.println("Its Thursday");
					    		  break;
				    		  case "FRI" :
					    		  System.out.println("Its Friday");
					    		  break;
				    		  case "SAT" :
					    		  System.out.println("Its Saturday");
					    		  break;
				    		  default:
				    			    System.out.println("Looking forward to the Weekend");
				    			}		    		  
	      
	      
	      }

}

