package practisePrograms;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
String str="God is good  Great eat toll";
String str1=str.toLowerCase();
System.out.println(str1);
int count =0;

char[] ch1=str1.toCharArray();
System.out.println("Duplicate characters in String ");
for(int i=0;i<=ch1.length;i++) {
	count =0;
	for(int j=i+1;j<ch1.length;j++) {
		if (ch1[i]==ch1[j] && ch1[i]!=' ') {
			count++;
			ch1[j]='0';
			if(count>1 && ch1[i]!='0') {
			System.out.println(ch1[i]);
			}
			
		}
	}
}
	}

}
