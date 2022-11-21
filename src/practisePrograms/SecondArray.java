package practisePrograms;

public class SecondArray {

	public static void main(String[] args) {
     int[] arr1= {1,2,4,6,10};
     int arr_size=arr1.length;
     System.out.println("size of an array "+arr_size);
     int temp=0;
     for(int i=0;i<arr_size-1;i++) {
     
    	 if (arr1[i]>arr1[i+1]) {
    		 temp=arr1[i];
    		 
    	 }else {
    		 temp=arr1[i+1];
    	 }
     

	}
 	System.out.println("greatest number in an array is "+temp);	

 	
	}
	}
