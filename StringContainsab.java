import java.util.Scanner;
public class StringContainsab {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int c=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++){
		if(ch[i]=='a'|| ch[i]=='b'){
		c++;
		}
		else{
		c=0;
		break;	
		}
		}
		if(c==0){
		System.out.println("no");
		}
		else{
		System.out.println("yes");
		}
      scan.close();
	}
}
