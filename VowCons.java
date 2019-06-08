import java.util.Scanner;
public class VowCons {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int i=0;
		char ch[]=str.toCharArray();
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
			System.out.println("vowels");
		}
		else if(ch[i]>'a' && ch[i]<='z'){
			System.out.println("consonants");
		}
		else{
			System.out.println("invalid");
		}
	}

}
