import java.util.Scanner;
public class StringDifferOneChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=scan.nextLine();
		System.out.println("enter the string:");
		String s2=scan.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(i==j){
					if(s1.charAt(i)!=s2.charAt(i)){
					count++;
				}
				}
			}
		}
		if(count==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
