package practisePrograms;


public class CharacterCount {

	public static void main(String[] args) {
String str ="java j2ee";
String strLowerCase=str.toLowerCase();
 
 
char[] ch1=strLowerCase.toCharArray();
int[] freq=new int[ch1.length];

 char ch='0';

for (int i=0;i<ch1.length;i++) {
	freq[i]=1;
	for (int j=i+1;j<ch1.length;j++) {
	if (ch1[i]==ch1[j] ) {
freq[i]++;
ch1[j]=ch;
	}

}
}

for(int i=0;i<=freq.length;i++) {
	
	if(ch1[i]!='0' && ch1[i]!=' ') {
		System.out.println("Character   "+ch1[i]+"  occurs  "+freq[i]+" times");
	}
}



	}

	}
	
	
