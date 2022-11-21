package practisePrograms;

public class Rightshift {

	public static void main(String[] args) {
	
			Rightshift task= new Rightshift();
			// Test
			task.multiplyBy10(3);
			task.multiplyBy10(1);
			task.multiplyBy10(100);
			task.multiplyBy10(3);
		
	
}
    
		public void multiplyBy10(int num)
		{
			
			int result = ((num) << 3) + ((num) << 1);
//            display result 
			System.out.println(" (" + num + " x 10) " + result);
		}
}