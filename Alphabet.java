import java.util.Scanner;
public class Alphabet {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int i=0;
		char ch[]=str.toCharArray();
		if(ch[i]>'a' && ch[i]<='z'){
			System.out.println("alphabet");
		}
		else{
			System.out.println("no");
		}
	}

}
