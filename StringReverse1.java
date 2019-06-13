import java.util.Scanner;
public class StringReverse1 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String s[]=st.split(" ");
		String rev="";
		for(int i=0;i<s.length;i++){
			rev="";
		for(int j=s[i].length()-1;j>=0;j--){
		rev=rev+s[i].charAt(j);
		}
		System.out.print(rev+" ");
		}
		scan.close();
     }
}
