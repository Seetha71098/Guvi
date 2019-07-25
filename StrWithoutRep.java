import java.util.Scanner;
public class StrWithoutRep {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String temp="";
		for(int i=0;i<str.length();i++){
			if(!temp.contains(str.substring(i,i+1))){
				temp+=str.substring(i,i+1);
			}
		}
		System.out.println(temp);
  }
}
